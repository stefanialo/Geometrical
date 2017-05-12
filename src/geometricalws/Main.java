
package geometricalws;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.ws.Endpoint;

public class Main {
public static void main (String[] args) {
String wsAddress = "http://localhost:8765/GeometricalWS/CircleFunctions";
Endpoint.publish(wsAddress, new CircleFunctions());
System.out.println("Web service was published successfully.\n"+ "WSDL URL: " + wsAddress + "?WSDL");
    try {
        // Keep the local web server running until the process is killed while (Thread.currentThread().isAlive()) try {
        Thread.sleep(10000);
    } catch (InterruptedException ex) {
       
    }
}
}
    

