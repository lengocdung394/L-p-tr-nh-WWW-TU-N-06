package iuh.fit.se.bai2.basejava;

import iuh.fit.se.bai2.xmlbasedconfiguration.Address;
import iuh.fit.se.bai2.xmlbasedconfiguration.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Address address() {
        return new Address("HCM","Nguyen Van Bao","Viet Nam");
    }
    @Bean
    public Employee employee(){
       return  new Employee(123,"Le Ngoc Dung", address());
    }
}
