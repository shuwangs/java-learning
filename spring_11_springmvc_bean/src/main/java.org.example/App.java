import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import controller.UserController;

public class App {
    public static void main(String[] args){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(config.SpringConfig.class);
        System.out.println(ctx.getBean(UserController.class));
    }
}
