package shosta.vlada.server;

import lombok.val;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import shosta.vlada.server.config.WebConfig;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @author Igor Hnes on 6/20/17.
 */
public class AppManager implements WebApplicationInitializer {

    private static final String DISPATCHER = "dispatcher";

    public void onStartup(ServletContext servletContext) throws ServletException {
        val applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.register(WebConfig.class);
        servletContext.addListener(new ContextLoaderListener(applicationContext));


        ServletRegistration.Dynamic registration = servletContext.addServlet(DISPATCHER, new DispatcherServlet(applicationContext));
        registration.addMapping("/");

    }
}
