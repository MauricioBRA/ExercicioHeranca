package br.com.generation.ExercicioHeranca;

public class Animal {
	
	//Atributos --> variaveis privado
	private String nome;
	private int idade;
	
	//Métodos --> Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//Métodos --> verbos --> ações
	void correr() {
		System.out.println("O cachorro está correndo.... ");
	}
	void cavalgar() {
		System.out.println("O Cavalo esta calvangando...");
	}
	void Subir() {
		System.out.println("A preguiça está a subir a arvore....");
	}

}
