/*
 * Disciplina:	Programação Orientada a Objetos
 * Professor:	Orlewilson B. Maia
 * Data:		26/10/2017
 * Autor:		Orlewilson B. Maia
 * Descrição:	Classe para representar o 
 * 				modelo Professor
 */

public class Professor {

	// atributos
	private double salario;
//	String estadoCivil;
//	String titulacao;
//	String disciplinas;
//	int cargaHoraria;
//	int nivelCrueldade;
	
	// construtor sem argumento
	public Professor() {
		this.salario = 0.0;
	}
	
	// construtor com argumento
	public Professor(double salario) {
		this.salario = salario;
	}
	
	// métodos
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return this.salario;
	}
}
