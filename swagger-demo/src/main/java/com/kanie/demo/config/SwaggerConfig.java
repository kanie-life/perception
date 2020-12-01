package com.kanie.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Swagger配置类
 * @author ：kanie
 * @date ：Created in 2020/12/1 20:48
 */
@Configuration
@EnableOpenApi
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        Docket docket = new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                .select()
                //为当前controller包生成API文档
//                .apis(RequestHandlerSelectors.basePackage("com.kanie.demo.controller"))
                //任何RequestHandler都满足此条件
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
        return docket;
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("测试")
                .description("swagger的一个用例")
                .version("1.0")
                .contact(new Contact("kanie", "/", "email"))
                .build();
    }
}
