//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Creating Address Object...
        Address address=new Address(); // (Manually)

        address.setAddress("Lucknow");
        address.setPinCode(123456);

        // Creating Student Object...
        Student student=new Student(); //(Manually)
        student.setName("Gyan");
        student.setContactNumber("7856685685");

        //Student have dependency of Address object.
        student.setAddress(address); // Injecting Address object into Student object (Manually)

        System.out.println("Student Name: "+student.getName());
        System.out.println("Student ContactNumber: "+student.getContactNumber());
        System.out.println("Student Address: "+student.getAddress().getAddress());
        System.out.println("Student PinCode: "+student.getAddress().getPinCode());





    }
}