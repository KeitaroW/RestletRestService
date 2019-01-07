import org.restlet.resource.ServerResource;
import com.keitarow.timetracking.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ResourceException;
/**
 *
 * @author Benedikt
 */
public class EntriesResource extends ServerResource implements IEntriesResource {
    private Company company;
    
    @Override
    protected void doInit() throws ResourceException {
        super.doInit();
        this.company = (Company)getContext().getAttributes().get("COMPANY");
    }
    
    @Get
    public Entries retrieve() {
        Date start = null;
        Date end = null;
        try {
            start = new SimpleDateFormat("yyyy-MM-dd").parse(getQueryValue("start"));
            end = new SimpleDateFormat("yyyy-MM-dd").parse(getQueryValue("end"));
            Calendar c = Calendar.getInstance();    //**************************
            c.setTime(end);                         // Done to include the end 
            c.add(Calendar.DATE, 1);                // date in the search
            end = c.getTime();                      //**************************
        } catch (Exception e) {
            
        }
        List<Employee> employees = company.getEmployees().getEmployee();
        List<Entry> entryList = company.getEntries().getEntry();
        Entries entries = new Entries();
        String loginname = (String)getRequest().getAttributes().get("loginname");
        int id = 0;
        if (!loginname.isEmpty()) {
            for (Employee e : employees) {
                if (e.getAccount().getLoginname().equals(loginname))
                    id = e.getId().intValue();
            }
        }
        for (Entry e : entryList) {
            if (start != null && end != null) {
                if (e.getEmployeeID().intValue() == id)
                    if (e.getStart().after(start) && e.getEnd().after(start) && e.getStart().before(end) && e.getEnd().before(end))
                        entries.getEntry().add(e);
            } else {
                if (e.getEmployeeID().intValue() == id)
                    entries.getEntry().add(e);
            }
        }
        return entries;
    }
    
    @Post
    public Entries store(Entry entry) {
        company.getEntries().getEntry().add(entry);
        List<Employee> employees = company.getEmployees().getEmployee();
        List<Entry> entryList = company.getEntries().getEntry();
        Entries entries = new Entries();
        String loginname = (String)getRequest().getAttributes().get("loginname");
        int id = 0;
        if (!loginname.isEmpty()) {
            for (Employee e : employees) {
                if (e.getAccount().getLoginname().equals(loginname))
                    id = e.getId().intValue();
            }
        }
        for (Entry e : entryList) {
            if (e.getEmployeeID().intValue() == id) {
                entries.getEntry().add(e);
            }
        }
        return entries;
    }
}
