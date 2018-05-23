package br.com.connectcargas.model;

public class Transportadora {
	
	private Integer id;
	public String nome;
	public String cnpj;
	public String endereco;
	
	
	
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



	public String getCnpj() {
		return cnpj;
	}



	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}



	public String getEndereco() {
		return endereco;
	}



	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}



	@Override
	public String toString() {
		return "Transportadora [id=" + id + ", nome=" + nome + ", cnpj=" + cnpj + ", endereco=" + endereco + "]";
	}
	
	

}
