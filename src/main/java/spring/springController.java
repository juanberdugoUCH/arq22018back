package spring;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import bl.PrincipalService;
import model.PrincipalModel;

@RestController
public class springController {

    @Bean
    public WebMvcConfigurerAdapter corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("*");
            }
        };
    }
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public springGET greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new springGET(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
    @RequestMapping("/getMemberActivity")
    public ArrayList<PrincipalModel> getData() {
       PrincipalService service = new PrincipalService();
       return service.GetMemberActivity();
    }
}
