package com.example.base;

import com.example.base.model.Persona;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BaseApplication implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(BaseApplication.class);

    public static void main(String[] args) {
        LOG.info("STARTING THE APPLICATION");
        SpringApplication.run(BaseApplication.class, args);
        LOG.info("APPLICATION FINISHED");
    }

    @Override
    public void run(String... args) throws Exception {
        LOG.info("EXECUTING : command line runner");
        LOG.info("Generar persona");
        Persona persona1 = new Persona("Saul", (byte) 38, 'H', (short) 68, 1.68F);
        LOG.info("Info persona 1: {}", persona1);
        LOG.info("Peso ideal: {}", persona1.calcularIMC());
        LOG.info("Es mayor de edad: {}", persona1.esMayorDeEdad());
    }
}
