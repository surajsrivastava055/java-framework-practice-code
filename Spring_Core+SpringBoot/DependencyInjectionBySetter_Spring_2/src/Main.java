import com.gyan.list.ProductInformation;
import com.gyan.map.ProductInformation2;
import com.gyan.set.ProductInformation1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new FileSystemXmlApplicationContext("C:\\Users\\Gyan Chandra\\Desktop\\JavaByDilipeSir\\DependencyInjectionBySetter_Spring_2\\spring.xml");
        ProductInformation object1=(ProductInformation) context.getBean("productList");
        System.out.println(object1);

        ProductInformation1 object2=(ProductInformation1) context.getBean("productList1");
        System.out.println(object2);

        System.out.println("--------------------------------------------------------------");
        ProductInformation2 object3=(ProductInformation2) context.getBean("productList2");
        System.out.println(object3);


    }
}
