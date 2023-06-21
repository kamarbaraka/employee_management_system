package com.develhope.employee_management_system;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmployeeManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeManagementSystemApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(EmployeeRepository repository){
        return (args -> {
            /*insertJavaAdvocates(repository);
            System.out.println(repository.findAll());*/
            System.out.println(repository.getEmployeeByFirstName("kamar"));
        });
    }
    public void insertJavaAdvocates(EmployeeRepository repository){

        var emp1 = new Employee("baraka", "kombe", "samson@gmail.com", "Nairobi", 1400);
        repository.save(new Employee("kamar", "baraka", "kamar254baraka@gmail.com",
                "Thika", 2500));

        repository.save(emp1);
        var emp2 = new Employee("kahindi", "ngari", "1245876", "Mombasa", 3600);
        repository.save(emp2);
    }

}
