package com.example.baitaptuan06;

import com.example.baitaptuan06.autowiring.Department;
import com.example.baitaptuan06.configuration.Group;
import com.example.baitaptuan06.configuration.User;
import com.example.baitaptuan06.configuration.UserService;
import com.example.baitaptuan06.xmlbased.Person;
import com.example.baitaptuan06.xmlbased.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    private static org.springframework.context.ApplicationContext context;

    public static void main(String[] args) {
//     XML-Based Configuration – Setter Injection – Object Injection
        context = new ClassPathXmlApplicationContext("bean.xml");
        Student student1 = context.getBean("student1", Student.class);
        System.out.println(student1);

        Student student2 = context.getBean("student2", Student.class);
        System.out.println(student2);

//     XML-Based Configuration – Collection Injection

        context = new ClassPathXmlApplicationContext("bean.xml");
        Person person1 = context.getBean("person", Person.class);
        System.out.println(person1);

        // Spring’s Auto-wiring (cont.)

        context = new ClassPathXmlApplicationContext("bean.xml");
        Department department1 = context.getBean("dept1", Department.class);
        System.out.println(department1);

        context = new ClassPathXmlApplicationContext("bean.xml");
        Department department2 = context.getBean("dept2", Department.class);
        System.out.println(department2);

        context = new ClassPathXmlApplicationContext("bean.xml");
        Department department3 = context.getBean("dept3", Department.class);
        System.out.println(department3);

        context = new ClassPathXmlApplicationContext("bean.xml");
        Department department4 = context.getBean("dept4", Department.class);
        System.out.println(department4);


        ApplicationContext context1 = new AnnotationConfigApplicationContext(UserService.class);
        User user =  context1.getBean(User.class);
        System.out.println(user);
        Group group = context1.getBean(Group.class);
        System.out.println(group);

    }
}
