import org.restlet.*;
import org.restlet.data.Protocol;
import org.restlet.resource.*;
import org.restlet.routing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Benedikt
 */
public class Uebung_04_RestService {
    
    public static void main(String[] args) throws Exception {
        Application app = new ServerApp();
        Component component = new Component();
        component.getServers().add(Protocol.HTTP, 8083);
        component.getDefaultHost().attach(app);
        component.start();
    }
}
