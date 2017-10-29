/*
 * Disciplina:	Programação Orientada a Objetos
 * Professor:	Orlewilson B. Maia
 * Data:		26/10/2017
 * Autor:		Orlewilson B. Maia
 * Descrição:	Classe para representar o 
 * 				modelo Serumaninho
 */
// abstract = não permite criar objeto
public abstract class Serumaninho {

	// atributos
	private String nome;
//	int idade;
//	char sexo;
//	String endereco;
//	String matricula;
	
	// construtor sem argumento
	public Serumaninho() {
		this.nome = "";
	}
	
	// construtor com argumento
	public Serumaninho(String nome) {
		this.nome = nome;
	}
	
	// métodos
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	// mostrar dados 
	public void mostrarDados() {
		// recomendado
		System.out.println("Nome: " + getNome());

//		System.out.println("Nome: " + this.nome);
	}
	
}











