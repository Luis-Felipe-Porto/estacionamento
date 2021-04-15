package edu.ifma.api.estacionamento.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
@Entity
public class Analise {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@NotNull
	private Boolean deferido;
	private String descricao;
	@ManyToOne(cascade=CascadeType.ALL)
	private Condutor condutorAnalisado;
	public boolean analisarCondutor(Condutor condutor) {
		return true;
	}
	public boolean analisarVeiculo(Veiculo veiculo) {
		return true;
	}
	public Boolean getDeferido() {
		return deferido;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setCondutorAnalisado(Condutor condutorAnalisado) {
		this.condutorAnalisado = condutorAnalisado;
	}
	public Condutor getCondutorAnalisado() {
		return condutorAnalisado;
	}
}
