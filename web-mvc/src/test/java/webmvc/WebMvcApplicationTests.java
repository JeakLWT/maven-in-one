package webmvc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.test.context.junit4.SpringRunner;
import webmvc.combination.Duck;
import webmvc.combination.FirstDuck;

import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebMvcApplicationTests {

	@Test
	public void contextLoads() {
        Duck duck=new FirstDuck();
        duck.dackQuack();
        duck.display();
	}

    @Test
    public void contextLoads1() {
        Duck duck=new FirstDuck();
        duck.dackQuack();
        duck.duckFly();
        duck.display();
    }

}
