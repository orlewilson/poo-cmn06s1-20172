/*
Disciplina: 	Programação Orientado a Objetos
Professor:		Orlewilson Bentes Maia
Data:			03/08/2017
Autor:			Orlewilson Bentes Maia
Descrição:		Exemplo de cadastro de pessoas sem usar vetor

*/

#include <stdio.h>

int main() {
	
	// Dados a serem armazenados
	int idade;
	char nome[12];
	char sexo[2];
	
	// Ler os valores para armazenar no registro
	printf("Lendo Valores \n");
	
	printf("Digite o nome: ");
	scanf("%s", nome);
		
	printf("Digite a idade: ");
	scanf("%d", &idade);
		
	printf("Digite o sexo: ");
	scanf("%s", sexo);	
	
	// Imprimir os valores dos registros
	printf("Imprimindo Valores \n");
		
	printf("Nome: %s \n", nome);
		
	printf("Idade: %d \n", idade);
		
	printf("Sexo: %s \n", sexo);

}
