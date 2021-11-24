import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.retry.annotation.EnableRetry;

@EnableRetry
@SpringBootApplication
@ComponentScan({"com.davor.spring"})
public class DavorRetrySpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DavorRetrySpringApplication.class, args);
	}

}
