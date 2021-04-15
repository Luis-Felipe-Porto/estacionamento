package edu.ifma.api.estacionamento.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Tercerizado extends Condutor{
	@NotNull @NotEmpty
	private String Empresa;
	
	public Tercerizado() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tercerizado(Long id, String nome, String sexo, String endereco, String telefone, Veiculo veiculo) {
		super(id, nome, sexo, endereco, telefone, veiculo);
		// TODO Auto-generated constructor stub
	}
	public String getEmpresa() {
		return Empresa;
	}
}
