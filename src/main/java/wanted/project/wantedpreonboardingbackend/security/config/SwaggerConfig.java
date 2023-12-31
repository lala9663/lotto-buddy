package wanted.project.wantedpreonboardingbackend.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket apiV1() {
        return new Docket(DocumentationType.OAS_30)
                .useDefaultResponseMessages(false)
                .groupName("apiV1")
                .select()
                .apis(RequestHandlerSelectors.basePackage("wanted.project.wantedpreonboardingbackend.member.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Project",
                "Project API docs",
                "V1",
                "http://localhost:8080/",
                new Contact("Contact Me", "https://lala9663.tistory.com/", "lala96632040@gmail.com"),
                "Licences",
                "http://localhost:8080/",
                new ArrayList<>());
    }
}