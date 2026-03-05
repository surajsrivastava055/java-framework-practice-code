public class Address {

    public Address(){
        System.out.println("Address cpnsturctor called...");
    }

    private String address;
    private int pinCode;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public void printName(){
        System.out.println("Hello gyan how are u ?");
    }
}
