
import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Put;
import com.keitarow.timetracking.*;

/**
 *
 * @author Benedikt
 */
public interface Timetracking {
    @Get
    public Employees employees();

    @Put
    public void addEmployee(Employee employee);

    @Delete
    public void remove();
}
