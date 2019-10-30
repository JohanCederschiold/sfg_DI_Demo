package se.jpdc.didemo;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import se.jpdc.didemo.controllers.ConstructorInjectedController;
import se.jpdc.didemo.controllers.PropertyInjectedController;
import se.jpdc.didemo.controllers.SetterInjectedController;
import se.jpdc.didemo.services.GreetingService;

@SpringBootApplication
public class DidemoApplication {

    public static void main(String[] args) {


        ApplicationContext ctx = SpringApplication.run(DidemoApplication.class, args);
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }

}
