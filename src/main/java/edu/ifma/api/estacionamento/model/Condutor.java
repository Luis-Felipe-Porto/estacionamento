package edu.ifma.api.estacionamento.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Condutor {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@NotNull @NotEmpty
	private String nome;
	@NotNull
	private String sexo;
	@NotEmpty
	private String endereco;
	@NotNull
	private String telefone;
	@ManyToOne(cascade=CascadeType.ALL)
	private Veiculo veiculo;
	
	public Condutor() {
		
	}
	public Condutor(Long id, String nome, String sexo, String endereco, String telefone, Veiculo veiculo) {
		super();
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		this.endereco = endereco;
		this.telefone = telefone;
		this.veiculo = veiculo;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public String getNome() {
		return nome;
	}
	public String getSexo() {
		return sexo;
	}
	public String getEndereco() {
		return endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
}
