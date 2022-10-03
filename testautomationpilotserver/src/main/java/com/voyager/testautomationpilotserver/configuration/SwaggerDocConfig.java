package com.voyager.testautomationpilotserver.configuration;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.beans.factory.annotation.Value;
/**
 * @author Prashant Mishra
 */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerDocConfig {

//    @Bean
//    public GroupedOpenApi publicApi() {
//	return GroupedOpenApi.builder().group("pilot-automation-server-public")
//		.pathsToMatch("/pas/**").build();
//    }

    @Bean
    public GroupedOpenApi adminApi() {
	return GroupedOpenApi.builder().group("pilot-automation-server-admin")
		.pathsToMatch("/pas/**")
//		.addMethodFilter(method -> method.isAnnotationPresent(PilotAutomationServerApp.class))
		.build();
    }

    @Bean
    public OpenAPI customOpenAPI(@Value("${springdoc.version}") String appVersion) {
        return new OpenAPI()
                .components(
                        new Components()
//                                .addSecuritySchemes("basicScheme",
//                                        new SecurityScheme().type(SecurityScheme.Type.HTTP)
//                                                .scheme("basic"))
//                                .addParameters("myHeader1",
//                                        new Parameter().in("header").schema(new StringSchema())
//                                                .name("myHeader1"))
//                                .addHeaders("myHeader2",
//                                        new Header().description("myHeader2 header")
//                                                .schema(new StringSchema()))
                )
                .info(new Info().title("Pilot Automation Server").version(appVersion).description(
                        "PilotAutomationServer a spring boot project for centralized automation server, which will utilize other teting modules"));

    }

}
