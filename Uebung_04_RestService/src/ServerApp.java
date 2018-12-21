import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.resource.Directory;
import org.restlet.routing.Router;
import com.keitarow.timetracking.*;
import javax.xml.bind.Marshaller;
/**
 *
 * @author Benedikt
 */
public class ServerApp extends Application {
    private File file = new File("timetracking.xml");
    private volatile Company company;
    private volatile JAXBContext companyContext;

    public ServerApp() {
        try {
            companyContext = JAXBContext.newInstance(Company.class);
            company = (Company)companyContext.createUnmarshaller().unmarshal(file);
        } catch (JAXBException ex) {
            ex.printStackTrace();
        }
    }
    
    @Override
    public Restlet createInboundRoot() {
        Router router = new Router(getContext());
        router.getContext().getAttributes().put("COMPANY", company);
        router.getContext().getAttributes().put("COMPANYCONTEXT", companyContext);
        router.attachDefault(new Directory(getContext(), "http://"));
        router.attach("/employees", EmployeesResource.class);
        router.attach("/employees/{loginname}", EmployeeResource.class);
        router.attach("/employees/{loginname}/entries", EntriesResource.class);
        return router;
    }
}
