import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");

        // по умолчанию отрабатывает Singleton. Ссылки ведут на один объект
        System.out.println(bean == bean1);
        System.out.println(bean.getMessage());



        // поменяли с Singleton на Prototype
        Cat cat =  applicationContext.getBean(Cat.class);
        Cat cat2 =  applicationContext.getBean(Cat.class);

        System.out.println(cat == cat2);



    }
}