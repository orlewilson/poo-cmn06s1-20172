/*
 * Disciplina:	Programação Orientada a Objetos
 * Professor:	Orlewilson B. Maia
 * Data:		31/08/2017
 * Autor:		Orlewilson B. Maia
 * Descrição:	Executar o projeto
 *  
 */

public class Principal {

	// executar projeto
	public static void main(String[] args) {

		// criando objeto do tipo dragao
		Dragao smaug = new Dragao();

		// atribuindo valores aos atributos (sem encapsulamento)
		// smaug.cor = "preto";
		// smaug.idade = 345;
		// smaug.peso = 360.6;
		// smaug.sexo = 'M';
		// smaug.tamanho = 60;

		// atribuindo valores aos atributos (com encapsulamento)
		smaug.setCor("preto");
		smaug.setIdade(345);
		smaug.setPeso(360.6);
		smaug.setSexo('M');
		smaug.setTamanho(60);

		// mostrando valores dos atributos no
		// console (sem encapsulamento)
//		System.out.println("Cor: " + smaug.cor);
//		System.out.println("Idade: " + smaug.idade);
//		System.out.println("Peso: " + smaug.peso);
//		System.out.println("Sexo: " + smaug.sexo);
//		System.out.println("Tamanho: " + smaug.tamanho);
		
		// mostrando valores dos atributos no
		// console (com encapsulamento)
		System.out.println("Cor: " + smaug.getCor());
		System.out.println("Idade: " + smaug.getIdade());
		System.out.println("Peso: " + smaug.getPeso());
		System.out.println("Sexo: " + smaug.getSexo());
		System.out.println("Tamanho: " + smaug.getTamanho());
	}
}
