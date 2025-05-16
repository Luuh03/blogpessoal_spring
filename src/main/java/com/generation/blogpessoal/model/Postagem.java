package com.generation.blogpessoal.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_postagens") // CREATE TABLE tb_postagens();
public class Postagem {
	
	@Id // PRIMARY KEY
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
	private Long id;

	@Column(length = 100) // define o tamanho 100 no campo no banco de dados
	@NotBlank(message = "O atributo 'título' é obrigatório!") // Não aceita nulo nem espaço em branco
	@Size(min = 5, max = 100, message = "O atributo 'título' deve ter no mínimo 5 e no máximo 100 caracteres!")
	private String titulo;
	
	@Column(length = 1000) // configuração banco de dados
	@NotBlank(message = "O atributo 'texto' é obrigatório!") // validação
	@Size(min = 10, max = 1000, message = "O atributo 'texto' deve ter no mínimo 10 e no máximo 1000 caracteres!") // validação
	private String texto;
	
	@UpdateTimestamp
	private LocalDateTime data;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}
}
