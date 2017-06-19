package shosta.vlada.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author Igor Hnes on 6/20/17.
 */
@Configuration
@EnableWebMvc
@ComponentScan("shosta.vlada.server")
public class WebConfig extends WebMvcConfigurerAdapter {

}
