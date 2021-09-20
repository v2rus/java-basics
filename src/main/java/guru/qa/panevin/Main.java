package guru.qa.panevin;


public class Main {
    public static void main(String[] args) {
        CellPhone phone1 = new CellPhone("iphone XR", 64, "beeline");
        CellPhone phone2 = new CellPhone("note", 32, "mts");
        CellPhone phone3 = new CellPhone("11 pro lite", 128, "yota");
        phone1.isPhoneBrandNew = true;

        System.out.println(phone1.checkIfPhoneIsNew());
        System.out.println(phone2.getId());
        System.out.println(phone3.checkBrand());
        phone3.setBrand("xiaomi");
        System.out.println(phone3.checkBrand());
    }
}
