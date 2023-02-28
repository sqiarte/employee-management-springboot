package com.kwan.springboot;

import com.kwan.springboot.model.Employee;
import com.kwan.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Kwan");
		employee.setLastName("Jung");
		employee.setEmailId("suebkwan@gmail.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("K");
		employee1.setLastName("Kung");
		employee1.setEmailId("kwan@gmail.com");
		employeeRepository.save(employee1);
	}
}

