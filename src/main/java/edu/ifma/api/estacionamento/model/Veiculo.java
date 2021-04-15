package edu.ifma.api.estacionamento.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Veiculo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@NotNull @NotEmpty
	private String tipo;
	@NotNull 
	private Integer ano;
	@NotNull @NotEmpty
	private String cor;
	@NotNull @NotEmpty
	private String placa;
	@NotNull @NotEmpty
	private String modelo;
	@NotNull @NotEmpty
	private String marca;
	
	public Long getId() {
		return id;
	}
	public String getTipo() {
		return tipo;
	}
	public Integer getAno() {
		return ano;
	}
	public String getCor() {
		return cor;
	}
	public String getPlaca() {
		return placa;
	}
	public String getModelo() {
		return modelo;
	}
	public String getMarca() {
		return marca;
	}
	
	
}
