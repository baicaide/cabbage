package org.alex.common.config;

import com.google.common.base.Predicate;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Description TODO
 * @Author alexcai
 * @Date 2021/5/11 22:34
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

  @Bean
  public Docket openApi() {
    Predicate<RequestHandler> predicate = (RequestHandler input) -> {
      return input.isAnnotatedWith(ApiOperation.class);
    };

    return new Docket(DocumentationType.SWAGGER_2)
        .groupName("openApi")
        .genericModelSubstitutes(DeferredResult.class)
        .useDefaultResponseMessages(false)
        .forCodeGeneration(false)
        .select()
        .apis(predicate)
        .paths(PathSelectors.any())
        .build()
        .apiInfo(apiInfo());

  }


  private ApiInfo apiInfo() {
    return new ApiInfoBuilder().title("Alex RESTful APIs").description("api 文档")
        .version("1.0").build();
  }

}
