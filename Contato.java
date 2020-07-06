package com.mod.dados;

public class Contato {
	private String nome;
	private int telefone;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public String toString() {
		StringBuilder contatos=new StringBuilder();
		
		contatos.append("Nome : "+nome);
		contatos.append(" Telefone : "+telefone);
		
		return contatos.toString();
	}
}
