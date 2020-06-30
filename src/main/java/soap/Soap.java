package soap;

import data.Goods;

import javax.jws.WebService;

@WebService(endpointInterface = "soap.WebServiceSOAP",
        serviceName = "Soap")
public class Soap implements WebServiceSOAP {
    @Override
    public String testService() {
        return "Привет лунатикам!";
    }

    @Override
    public String sayHelloTo(String text) {
        return "Привет, " + text + "!";
    }

    @Override
    public Goods getGoods() {
        Goods goods = new Goods();
        goods.setId(1);
        goods.setName("Хайдар");
        return goods;
    }
}
