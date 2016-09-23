package Student.Yang;

/**
 * Hello world!
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "SpringBeans.xml");
 
        HelloWorld obj = (HelloWorld) context.getBean("helloBean");
        obj.printHello();
        Car car=(Car)context.getBean("car");
        System.out.println(car.toString());
        car=(Car)context.getBean("car2");
        System.out.println(car.toString());
        Person person=(Person)context.getBean("person");
        System.out.println(person.toString());
        person=(Person)context.getBean("person2");
        System.out.println(person.toString());
        //List
        listCar listcar=(listCar)context.getBean("listcar");
        System.out.println(listcar);
        //测试util属性供多个模块调用
        listcar=(listCar)context.getBean("listcar2");
        System.out.println("util:"+listcar.toString());
        //Map
        MapPerson map=(MapPerson)context.getBean("map");
        System.out.println(map.toString());
        //properties
        DataSource datasource=(DataSource)context.getBean("datasource");
       System.out.println(datasource.toString());
        //namespace
       person=(Person)context.getBean("person5");
       System.out.println(person.toString());
    }
}
