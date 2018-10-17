package spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import dal.Conexion;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
    	Conexion con = new Conexion();
    	con.obtener();
        SpringApplication.run(Application.class, args);
    }
}