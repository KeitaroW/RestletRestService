import org.restlet.resource.ServerResource;
import com.keitarow.timetracking.*;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ResourceException;
/**
 *
 * @author Benedikt
 */
public class EmployeesResource extends ServerResource {
    private Company company;

    @Override
    protected void doInit() throws ResourceException {
        super.doInit();
        this.company = (Company)getContext().getAttributes().get("COMPANY");
    }
    
    @Get
    public Employees retrieve() {
        return company.getEmployees();
    }
    
    @Post
    public Employees store(Employee emp) {
        company.getEmployees().getEmployee().add(emp);
        return company.getEmployees();
    }
}
