package main;




import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = {"com.system.dao.**"})
@ComponentScan(basePackages = {"com.system.**"})
@EnableCaching
@EnableAsync
@Configurable
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
