package guru.qa.panevin;

public class CellPhone {
    int id;
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

    public boolean checkIfPhoneIsNew (boolean isPhoneBrandNew){
        this.isPhoneBrandNew = isPhoneBrandNew;
        return isPhoneBrandNew;
    }

    public String checkBrand (String brand){
        this.brand = brand;
        return brand;
    }
    public int getId (){
        return id;
    }
}
