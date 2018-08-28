package dubboprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//指定aop事务执行顺序，已保证在切换数据源的后面
@EnableTransactionManagement(order = 2)
//排除数据源自动配置
@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class
})
public class DubboProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboProviderApplication.class, args);
	}
}
