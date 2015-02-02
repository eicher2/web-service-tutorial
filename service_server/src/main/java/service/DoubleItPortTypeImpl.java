package service;

import org.example.contract.doubleit.DoubleItPortType;

import javax.jws.WebService;
import java.util.Date;

@WebService(targetNamespace = "http://www.example.org/contract/DoubleIt", 
            portName="DoubleItPort",
            serviceName="DoubleItService", 
            endpointInterface="org.example.contract.doubleit.DoubleItPortType")
public class DoubleItPortTypeImpl implements DoubleItPortType {

    public int doubleIt(int numberToDouble) {
        System.out.println("doubleIt @ " + new Date() + " numberToDouble: " + numberToDouble);
        return numberToDouble * 2;
    }
}

