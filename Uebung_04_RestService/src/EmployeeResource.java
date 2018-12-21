import org.restlet.resource.ServerResource;
import com.keitarow.timetracking.*;
import java.util.List;
import org.restlet.resource.Get;
import org.restlet.resource.Put;
import org.restlet.resource.ResourceException;
/**
 *
 * @author Benedikt
 */
public class EmployeeResource extends ServerResource {
    private Company company;
    
    @Override
    protected void doInit() throws ResourceException {
        super.doInit();
        this.company = (Company)getContext().getAttributes().get("COMPANY");
    }
    
    @Get
    public Employee retrieve() {
        List<Employee> employees = company.getEmployees().getEmployee();
        String loginname = (String)getRequest().getAttributes().get("loginname");
        if (!loginname.isEmpty()) {
            for (Employee e : employees) {
                if (e.getAccount().getLoginname().equals(loginname))
                    return e;
            }
        }
        return null;
    }
    
    @Put
    public Employee edit(Employee emp) {
        List<Employee> employees = company.getEmployees().getEmployee();
        String loginname = (String)getRequest().getAttributes().get("loginname");
        if (!loginname.isEmpty()) {
            for (int i = 0; i < employees.size(); i++) {
                if (employees.get(i).getAccount().getLoginname().equals(loginname)) {
                    company.getEmployees().getEmployee().set(i, emp);
                    return emp;
                }
            }
        }
        return null;
    }
}
