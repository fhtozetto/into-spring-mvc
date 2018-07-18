package br.com.lph.curso.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration // Marca essa classe como sendo de configuração do Spring
@ComponentScan("br.com.lph.curso") // Todos os pacotes dentro de "br.com.lph.curso" serão escaniados pelo Spring
@EnableWebMvc // Para usar o SpringMVC
public class RootConfig {

}
