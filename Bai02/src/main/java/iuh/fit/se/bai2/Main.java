package iuh.fit.se.bai2;

import iuh.fit.se.bai2.basejava.AppConfig;
import iuh.fit.se.bai2.xmlbasedconfiguration.Address;
import iuh.fit.se.bai2.xmlbasedconfiguration.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    private static org.springframework.context.ApplicationContext context;

    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("bean.xml");
        // setter
        Employee employee = context.getBean("employeeSetter", Employee.class);
        System.out.println(employee);
        // contructor
        Employee employee2 = context.getBean("employeeConstructor", Employee.class);
        System.out.println(employee2);

//       Java-Based
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee em = applicationContext.getBean(Employee.class);
        System.out.println(em);
        Address a = applicationContext.getBean(Address.class);
        System.out.println(a);


    }
}
