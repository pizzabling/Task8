package soap;

import data.Goods;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface WebServiceSOAP {

    @WebMethod
    String testService();

    @WebMethod
    String sayHelloTo(@WebParam(name = "text") String text);

    @WebMethod
    Goods getGoods();
}


