/*
 * Disciplina:	Programação Orientada a Objetos
 * Professor:	Orlewilson B. Maia
 * Data:		31/08/2017
 * Autor:		Orlewilson B. Maia
 * Descrição:	Classe para representar o 
 * 				modelo Dragao
 *  
 */

public class Dragao {

	// atributos (sem encapsulamento)
	// double tamanho;
	// double peso;
	// char sexo;
	// String cor;
	// int idade;

	// atributos (com encapsulamento)
	private double tamanho;
	private double peso;
	private char sexo;
	private String cor;
	private int idade;

	// Métodos para acessar os atributos (encapsulamento)
	public double getTamanho() {
		return this.tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public double getPeso() {
		return this.peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public char getSexo() {
		return this.sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getCor() {
		return this.cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}