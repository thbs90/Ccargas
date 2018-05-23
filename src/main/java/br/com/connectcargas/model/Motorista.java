package br.com.connectcargas.model;

import java.util.Date;

public class Motorista {
	
	private Integer id;
	private String nome;
	private String matricula;
	private String endereco;
	private String cpf;
	private Date dataNascimento;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	@Override
	public String toString() {
		return "Motorista [id=" + id + ", nome=" + nome + ", matricula=" + matricula + ", endereco=" + endereco
				+ ", cpf=" + cpf + ", dataNascimento=" + dataNascimento + "]";
	}
	
	

}
