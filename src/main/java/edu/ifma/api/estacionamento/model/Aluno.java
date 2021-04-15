package edu.ifma.api.estacionamento.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Aluno extends Condutor{
	
	@NotNull @NotEmpty
	private String curso;
	@NotNull @NotEmpty
	private String tipoAluno;
	
	public Aluno() {
		super();
	}
	public Aluno(Long id, String nome, String sexo, String endereco, String telefone, Veiculo veiculo) {
		super(id, nome, sexo, endereco, telefone, veiculo);
	}
	public String getCurso() {
		return curso;
	}
	public String getTipoAluno() {
		return tipoAluno;
	}
	
}
