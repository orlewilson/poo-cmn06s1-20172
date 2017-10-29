/*
 * Disciplina:	Programação Orientada a Objetos
 * Professor:	Orlewilson B. Maia
 * Data:		26/10/2017
 * Autor:		Orlewilson B. Maia
 * Descrição:	Classe para representar o 
 * 				modelo Professor
 */

// extends = herança
public class Professor extends Serumaninho {

	// atributos
	private double salario;
	// String estadoCivil;
	// String titulacao;
	// String disciplinas;
	// int cargaHoraria;
	// int nivelCrueldade;

	// construtor sem argumento
	public Professor() {

		// primeira forma

		// chamando o método
		// public Serumaninho()
		// super(); // recomendado

		// chamando o método
		// public Serumaninho(String nome)
		// super("");

		// segunda forma
		// setNome("");

		// this.salario = 0.0;
		setSalario(0.0); // recomendado
	}

	
	
	// construtor com argumento
	public Professor(String nome, double salario) {

		// primeira forma

		// chamando o método
		// public Serumaninho(String nome)
		//super(nome); // recomendado

		// segunda forma
		//setNome(nome);

		//this.salario = salario;
		setSalario(salario); // recomendado
	}

	
	
	
	
	// métodos
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getSalario() {
		return this.salario;
	}
	
	// mostrar dados 
	public void mostrarDados() {
		
		// primeira forma
		super.mostrarDados();
		
		// recomendado
		System.out.println("Salário: " + getSalario());
		System.out.println("Nome: " + getNome());
		
	}

}








