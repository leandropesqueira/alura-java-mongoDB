package br.com.alura.escolalura.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Aluno {
	
	private ObjectId id;
	
	private String nome;	
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dataNascimento;
	
	private Curso curso;
	
	private List<Nota> notas;
	
	private List<Habilidade> habilidades;

	public Aluno criarId() {
		setId(new ObjectId());
		return this;
	}

	public Aluno adicionar(Aluno aluno, Habilidade habilidade) {
		List<Habilidade> habilidades = aluno.getHabilidades();
		habilidades.add(habilidade);
		aluno.setHabilidades(habilidades);
		return aluno;		
	}
	
	public List<Habilidade> getHabilidades(){
		if(habilidades == null) {
			habilidades = new ArrayList<Habilidade>();
		}
		return habilidades;
	}

	

}
