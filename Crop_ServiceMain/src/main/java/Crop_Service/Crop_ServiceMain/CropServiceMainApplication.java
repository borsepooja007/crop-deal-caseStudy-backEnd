package Crop_Service.Crop_ServiceMain;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class CropServiceMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(CropServiceMainApplication.class, args);

	}

	@Bean
	public Docket swaggerConfiguration() {

		return new Docket(DocumentationType.SWAGGER_2).select()

				.apis(RequestHandlerSelectors.basePackage("Crop_Service")).build().apiInfo(apiDetails());
	}

	private ApiInfo apiDetails() {
		return new ApiInfo("Crop Service", "CropDeal ", "1.0", "Demo",
				new springfox.documentation.service.Contact("Pooja Borse", "http://Localhost:9005", "pb@gmail.com"),
				"API ", "http://Localhost:9005", Collections.emptyList());
	}

}
