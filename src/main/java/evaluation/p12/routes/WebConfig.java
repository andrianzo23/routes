package evaluation.p12.routes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "example.com")
public class WebConfig implements WebMvcConfigurer {

    // =======================================
    // =             Bean Config             =
    // =======================================



    // =======================================
    // =          Override Methods           =
    // =======================================

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/pdfs/**")
                .addResourceLocations("/WEB-INF/assets/pdfs/");
        
        registry.addResourceHandler("/img/**")
        .addResourceLocations("/WEB-INF/assets/img/");

        registry.addResourceHandler("/css/**")
                .addResourceLocations("/WEB-INF/assets/css/");

        registry.addResourceHandler("/js/**")
                .addResourceLocations("/WEB-INF/assets/js/");
     
        registry.addResourceHandler("/lib/**")
        .addResourceLocations("/WEB-INF/assets/lib/");
        
        registry.addResourceHandler("/mail/**")
        .addResourceLocations("/WEB-INF/assets/mail/");
        
    }
}