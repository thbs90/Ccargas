package br.com.connectcargas.model;

import java.sql.Date;

public class Jornada {

	private Integer id;
	private Date dataTrabalho;
	private String rotaOrigem;
	private String rotaDestino;
	private Date inicioJornada;
	private Date fimJornada;
	private Date inicioDirecao;
	private Date fimDirecao;
	private Date inicioDescanso;
	private Date fimDescanso;
	private Date inicioAlimentacao;
	private Date fimAlimentacao;
	private Date inicioEspera;
	private Date fimEspera;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDataTrabalho() {
		return dataTrabalho;
	}
	public void setDataTrabalho(Date dataTrabalho) {
		this.dataTrabalho = dataTrabalho;
	}
	public String getRotaOrigem() {
		return rotaOrigem;
	}
	public void setRotaOrigem(String rotaOrigem) {
		this.rotaOrigem = rotaOrigem;
	}
	public String getRotaDestino() {
		return rotaDestino;
	}
	public void setRotaDestino(String rotaDestino) {
		this.rotaDestino = rotaDestino;
	}
	public Date getInicioJornada() {
		return inicioJornada;
	}
	public void setInicioJornada(Date inicioJornada) {
		this.inicioJornada = inicioJornada;
	}
	public Date getFimJornada() {
		return fimJornada;
	}
	public void setFimJornada(Date fimJornada) {
		this.fimJornada = fimJornada;
	}
	public Date getInicioDirecao() {
		return inicioDirecao;
	}
	public void setInicioDirecao(Date inicioDirecao) {
		this.inicioDirecao = inicioDirecao;
	}
	public Date getFimDirecao() {
		return fimDirecao;
	}
	public void setFimDirecao(Date fimDirecao) {
		this.fimDirecao = fimDirecao;
	}
	public Date getInicioDescanso() {
		return inicioDescanso;
	}
	public void setInicioDescanso(Date inicioDescanso) {
		this.inicioDescanso = inicioDescanso;
	}
	public Date getFimDecanso() {
		return fimDescanso;
	}
	public void setFimDescanso(Date fimDescanso) {
		this.fimDescanso = fimDescanso;
	}
	public Date getInicioAlimentacao() {
		return inicioAlimentacao;
	}
	public void setInicioAlimentacao(Date inicioAlimentacao) {
		this.inicioAlimentacao = inicioAlimentacao;
	}
	public Date getFimAlimentacao() {
		return fimAlimentacao;
	}
	public void setFimAlimentacao(Date fimAlimentacao) {
		this.fimAlimentacao = fimAlimentacao;
	}
	public Date getInicioEspera() {
		return inicioEspera;
	}
	public void setInicioEspera(Date inicioEspera) {
		this.inicioEspera = inicioEspera;
	}
	public Date getFimEspera() {
		return fimEspera;
	}
	public void setFimEspera(Date fimEspera) {
		this.fimEspera = fimEspera;
	}
	@Override
	public String toString() {
		return "Jornada [id=" + id + ", dataTrabalho=" + dataTrabalho + ", rotaOrigem=" + rotaOrigem + ", rotaDestino="
				+ rotaDestino + ", inicioJornada=" + inicioJornada + ", fimJornada=" + fimJornada + ", inicioDirecao="
				+ inicioDirecao + ", fimDirecao=" + fimDirecao + ", inicioDescanso=" + inicioDescanso + ", fimDescanso="
				+ fimDescanso + ", inicioAlimentacao=" + inicioAlimentacao + ", fimAlimentacao=" + fimAlimentacao
				+ ", inicioEspera=" + inicioEspera + ", fimEspera=" + fimEspera + "]";
	}
	
	
}

