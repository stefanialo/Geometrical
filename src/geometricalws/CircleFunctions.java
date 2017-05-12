package geometricalws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "Circle", serviceName = "CircleService", portName = "CirclePort")
@SOAPBinding(style = SOAPBinding.Style.RPC)

public class CircleFunctions {

    @WebMethod(operationName = "area")
    public double getArea(@WebParam(name = "r") double r) {
        return Math.PI * (r * r);
    }

    @WebMethod(operationName = "circumference")
    public double getCircumference(@WebParam(name = "r") double r) {
        return 2 * Math.PI * r;
    }
}
