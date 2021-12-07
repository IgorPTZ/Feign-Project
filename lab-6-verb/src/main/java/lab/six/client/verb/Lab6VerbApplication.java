package lab.six.client.verb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Lab6VerbApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab6VerbApplication.class, args);
	}

}
