package tournament;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by jmontes on 4/3/16.
 */

@SpringBootApplication
public class TournamentApp extends WebMvcConfigurerAdapter {

    public static void main(String[] args) {
        SpringApplication.run(TournamentApp.class, args);
    }
}
