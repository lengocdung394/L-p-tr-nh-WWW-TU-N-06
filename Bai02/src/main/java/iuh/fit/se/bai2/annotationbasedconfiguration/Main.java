package iuh.fit.se.bai2.annotationbasedconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "iuh.fit.se.bai2.annotationbasedconfiguration")
public class Main {
    public static void main(String[] args) {
        // Load context bằng AnnotationConfigApplicationContext
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Main.class);

        // Lấy bean employee
        Employee emp = context.getBean(Employee.class);

        System.out.println(emp);

        ((AnnotationConfigApplicationContext) context).close();
    }
}