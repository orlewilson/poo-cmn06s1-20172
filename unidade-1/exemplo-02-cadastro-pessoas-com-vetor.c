/*
Disciplina: 	Programação Orientado a Objetos
Professor:		Orlewilson Bentes Maia
Data:			03/08/2017
Autor:			Orlewilson Bentes Maia
Descrição:		Exemplo de cadastro de pessoas usando vetor 

*/

#define N 3 // quantidade de registros

#include <stdio.h>

int main() {
	
	// Dados a serem armazenados
	int idade[N];
	char nome[N][12];
	char sexo[N][2];
	
	int x; // variável de controle
	
	// Ler os valores para armazenar no registro
	printf("Lendo Valores \n");
	for (x = 0; x < N; x++){
		
		printf("Registro %d: ----------\n", x+1);
		
		printf("Digite o nome: ");
		scanf("%s", nome[x]);
		
		printf("Digite a idade: ");
		scanf("%d", &idade[x]);
		
		printf("Digite o sexo: ");
		scanf("%s", sexo[x]);	
	}
	
	// Imprimir os valores dos registros
	printf("Imprimindo Valores \n");
	for (x = 0; x < N; x++){
		printf("Registro %d: ----------\n", x+1);
		
		printf("Nome: %s \n", nome[x]);
		
		printf("Idade: %d \n", idade[x]);
		
		printf("Sexo: %s \n", sexo[x]);
	}
}
