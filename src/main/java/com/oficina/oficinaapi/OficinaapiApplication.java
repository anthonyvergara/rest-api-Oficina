package com.oficina.oficinaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//ESSAS ANOTACOES SAO IMPORTANTES PARA TER UM PROJETO COMPLETO SPRING BOOT RODANDO EM QUALQUER ARQUITETURA
@SpringBootApplication //identifica que é uma aplicacao spring boot para poder dar start nos recursos
@EntityScan(basePackages = {"com.oficina.model"}) //informa os modelos para criar as tabelas automaticas
@ComponentScan(basePackages = {"com.*"}) // injecao de dependencia para controlar os objetos
@EnableJpaRepositories(basePackages = {"com.oficina.repository"}) // interface para persistencia do jpa ex: crud
@EnableTransactionManagement // controle de transacoes no banco de dados, evitar erros na hora de inserir ou varias requisicoes ao mesmo tempo
@EnableWebMvc //ativa recurso de mvc - porem esse projeto de aula so usa rest
@RestController // para o projeto identificar que é uma aplicacao rest e os controllers retornarem json
@EnableAutoConfiguration // configura todo o projeto para manipulacoes de classes, dependencias, faz tudo funcionar no projeto
public class OficinaapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OficinaapiApplication.class, args);
	}

}
