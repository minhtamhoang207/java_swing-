package model;

import java.io.Serializable;

public class ReaderModel implements Serializable {
    private int id;
    private String name;
    private String address;
    private String phone;
    private static int sma = 10000;

    public ReaderModel(){
        id = sma++;
    }

    public ReaderModel(int id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        ReaderModel.sma = sma;
    }
    
  
    public Object[] toObjects(){
        return new Object[]{
            getId(),
            getName(),
            getAddress(),
            getPhone()
        };
    }
}
