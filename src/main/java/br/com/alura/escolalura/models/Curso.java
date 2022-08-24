package br.com.alura.escolalura.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Curso {
	
	private String nome;
	
	public Curso(String nome) {
		this.nome = nome;
	}	

}
