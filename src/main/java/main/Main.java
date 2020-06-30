package main;

import data.Goods;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import soap.WebServiceSOAP;

public class Main {
    public static void main(String[] args) {
        String url = "http://localhost:8080/soap/webserviceSOAP";

        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setServiceClass(WebServiceSOAP.class);
        factoryBean.setAddress(url);

        WebServiceSOAP webServiceSOAP = (WebServiceSOAP) factoryBean.create();

        Goods result = webServiceSOAP.getGoods();
        System.out.println("Результат: " + result);
    }
}
