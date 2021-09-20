package guru.qa.panevin;

public class CellPhone {
    static public int id;
    String brand;
    String model;
    int memoryCapacity;
    boolean isPhoneBrandNew;
    String networkType;

    public CellPhone (String model, int memoryCapacity, String networkType){
        this.id = ++id;
        this.model = model;
        this.memoryCapacity = memoryCapacity;
        this.networkType = networkType;
    }

    public boolean checkIfPhoneIsNew (){
        return isPhoneBrandNew;
    }

    public String setBrand (String brand){
        this.brand = brand;
        return brand;
    }

    public String checkBrand (){
        return brand;
    }
    public int getId (){
        return id;
    }
}
