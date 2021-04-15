package edu.ifma.api.estacionamento.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Servidor extends Condutor{
	@NotNull @NotEmpty
	private String departamento;
		
	public Servidor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Servidor(Long id, String nome, String sexo, String endereco, String telefone, Veiculo veiculo) {
		super(id, nome, sexo, endereco, telefone, veiculo);
		// TODO Auto-generated constructor stub
	}
	public String getDepartamento() {
		return departamento;
	}
	
}
