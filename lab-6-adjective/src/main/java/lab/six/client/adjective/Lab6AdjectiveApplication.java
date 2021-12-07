package lab.six.client.adjective;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Lab6AdjectiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab6AdjectiveApplication.class, args);
	}
}
