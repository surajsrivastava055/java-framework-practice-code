import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // creating spring/IOC container object
        ApplicationContext container=new FileSystemXmlApplicationContext("C:\\Users\\Gyan Chandra\\Desktop\\JavaByDilipeSir\\FirstSpringProgram\\spring.xml");

        //Address object: address1
        Address address=(Address) container.getBean("address1");
        address.printName();
        address.getAddress();

        //Student object: student1
        Student student=(Student) container.getBean("student1");
        student.setName("Gyan Chandra");
        System.out.println(student.getName());
        System.out.println(student.getAddress());


    }
}