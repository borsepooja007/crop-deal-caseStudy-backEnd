package ApiZullGateWayM_Service.ApiZullGatewayMNew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ApiZullGatewayMNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiZullGatewayMNewApplication.class, args);
		System.out.println("Running");
	}

}
