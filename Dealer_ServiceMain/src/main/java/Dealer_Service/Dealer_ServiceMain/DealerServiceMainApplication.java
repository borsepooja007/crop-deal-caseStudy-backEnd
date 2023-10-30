package Dealer_Service.Dealer_ServiceMain;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class DealerServiceMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(DealerServiceMainApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public Docket swaggerConfiguration() {

		return new Docket(DocumentationType.SWAGGER_2).select()

				.apis(RequestHandlerSelectors.basePackage("Dealer_Service")).build().apiInfo(apiDetails());
	}

	private ApiInfo apiDetails() {
		return new ApiInfo("Dealer Service", "CropDeal ", "1.0", "Demo",
				new springfox.documentation.service.Contact("Pooja Borse", "http://Localhost:9002", "pb@gmail.com"),
				"API ", "http://Localhost:9002", Collections.emptyList());
	}

}
