package br.com.lph.curso.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration // Marca essa classe como sendo de configuração do Spring
public class SpringMvcConfig {
	
	@Bean //Define o método como um bean gerenciado pelo Spring Framework;
	public InternalResourceViewResolver viewResolver() { 
		InternalResourceViewResolver resolver = new InternalResourceViewResolver(); //A instância da classe InternalResourceViewResolver é necessária para a configuração do view template do Spring MVC baseado em JSTL
		resolver.setPrefix("/WEB-INF/views/"); // Configuração do prefixo da páginas JSPs. Assim, o Spring MVC sabe onde encontrar as páginas e não se faz necessário digitar esse caminho sempre que for necessário acessar uma dessas páginas
		resolver.setSuffix(".jsp"); // Define o tipo de arquivo das páginas web. Assim, não se faz necessário digitar a extensão do arquivo sempre que se quiser acessar um desses arquivos através dos controllers
		resolver.setViewClass(JstlView.class); // A classe JstlView informa ao Spring MVC que o view template será baseado no framework JSTL
		return resolver;
	}
}
