package controlador;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

import model.PrincipalModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bl.PrincipalService;
import spring.springGET;

@RestController
public class PrincipalController
{
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public springGET greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new springGET(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
    @RequestMapping("/GetData")
    public ArrayList<PrincipalModel> GetData() {
    	PrincipalService bl = new PrincipalService();
    	ArrayList<PrincipalModel> n= bl.GetData();
    	return n;
    }
}
