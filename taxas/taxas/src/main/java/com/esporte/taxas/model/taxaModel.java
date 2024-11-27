package com.esporte.taxas.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "partidas")

public class taxaModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID Id;
	private String resultado;
	private int round;
	private int abates;
	private int mortes;
	private int hs;
	private String imagem;
	public UUID getId() {
		return Id;
	}
	public void setId(UUID id) {
		Id = id;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	public int getRound() {
		return round;
	}
	public void setRound(int round) {
		this.round = round;
	}
	public int getAbates() {
		return abates;
	}
	public void setAbates(int abates) {
		this.abates = abates;
	}
	public int getMortes() {
		return mortes;
	}
	public void setMortes(int mortes) {
		this.mortes = mortes;
	}
	public int getHs() {
		return hs;
	}
	public void setHs(int hs) {
		this.hs = hs;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	public taxaModel (UUID Id,String resultado,int round,int abates,int mortes,int hs,String imagem) {
		  super();
		    this.Id = Id;
			this.resultado = resultado;
			this.round = round;
			this.abates = abates;
			this.mortes = mortes;
			this.hs = hs;
			this.imagem = imagem;
	}
}
