package com.barberAppointments.barberAppointments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.repository"})
@EntityScan(basePackages = {"com.entities"})
public class BarberAppointmentsApplication {

	public static void main(String[] args) {

		SpringApplication.run(BarberAppointmentsApplication.class, args);
	}

}
