package model;

import java.io.Serializable;

public class ServiceModel implements Serializable {
    private int id;
    private String serviceName;
    private String serviceGroup;
    private long cost;
    private long fee;
    private static int sma = 1000;

    public ServiceModel(){
        id = sma++;
    }

    public ServiceModel(int id, String serviceName, String serviceGroup, long cost, long fee) {
        this.id = id;
        this.serviceName = serviceName;
        this.serviceGroup = serviceGroup;
        this.cost = cost;
        this.fee = fee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceGroup() {
        return serviceGroup;
    }

    public void setServiceGroup(String serviceGroup) {
        this.serviceGroup = serviceGroup;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    public long getFee() {
        return fee;
    }

    public void setFee(long fee) {
        this.fee = fee;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        ServiceModel.sma = sma;
    }
    
  
    public Object[] toObjects(){
        return new Object[]{
            getId(),
            getServiceName(),
            getServiceGroup(),
            getCost(),
            getFee()
        };
    }
}
