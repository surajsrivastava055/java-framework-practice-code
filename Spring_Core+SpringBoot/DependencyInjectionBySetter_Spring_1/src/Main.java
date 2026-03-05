import com.gyan.Employee;
import com.gyan.ProductInformation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext container=new FileSystemXmlApplicationContext("C:\\Users\\Gyan Chandra\\Desktop\\JavaByDilipeSir\\DependencyInjectionBySetter_Spring_1\\spring.xml");

        Employee employee=(Employee) container.getBean("employee");

        System.out.println(employee.getCompanyName());
        System.out.println(employee.getEid());
        System.out.println(employee.getEname());

        ProductInformation productInformation=(ProductInformation) container.getBean("product1");
        System.out.println(productInformation);

        ProductInformation productInformation1=(ProductInformation) container.getBean("product2");
        System.out.println(productInformation1);


    }
}