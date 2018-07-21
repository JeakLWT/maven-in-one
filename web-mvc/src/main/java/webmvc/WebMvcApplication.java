package webmvc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan(basePackages = "webmvc.mapper")
public class WebMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebMvcApplication.class, args);
	}
}
