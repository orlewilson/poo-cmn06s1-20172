/*
Disciplina: 	Programação Orientado a Objetos
Professor:		Orlewilson Bentes Maia
Data:			03/08/2017
Autor:			Orlewilson Bentes Maia
Descrição:		Exemplo de cadastro de pessoas usando struct com vetor 

*/

#define N 3 // quantidade de registros

#include <stdio.h>

// Estrutura para representar dados para cadastro de uma pessoa
struct Pessoa {
	int idade;
	char nome[12];
	char sexo[2];
};

int main() {
	
	struct Pessoa cadastro[N];
	
	int x; // variável de controle
	
	// Ler os valores para armazenar no registro
	printf("Lendo Valores \n");
	for (x = 0; x < N; x++){
		
		printf("Registro %d: ----------\n", x+1);
		
		printf("Digite o nome: ");
		scanf("%s", cadastro[x].nome);
		
		printf("Digite a idade: ");
		scanf("%d", &cadastro[x].idade);
		
		printf("Digite o sexo: ");
		scanf("%s", cadastro[x].sexo);	
	}
	
	// Imprimir os valores dos registros
	printf("Imprimindo Valores \n");
	for (x = 0; x < N; x++){
		printf("Registro %d: ----------\n", x+1);
		
		printf("Nome: %s \n", cadastro[x].nome);
		
		printf("Idade: %d \n", cadastro[x].idade);
		
		printf("Sexo: %s \n", cadastro[x].sexo);
	}
}
