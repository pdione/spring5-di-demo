package group.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import group.springframework.controllers.ConstructorInjectedController;
import group.springframework.controllers.GetterInjectedController;
import group.springframework.controllers.MyController;
import group.springframework.controllers.PropertyInjectedController;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
	ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

	MyController controller = (MyController) ctx.getBean("myController");

	System.out.println(controller.hello());
	System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
	System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
	System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }
}
