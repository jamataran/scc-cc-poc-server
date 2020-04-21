package es.autowired.scc.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SccServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SccServerApplication.class, args);
	}

}
