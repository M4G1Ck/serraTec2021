/*
6 - Escreva um programa que imprima todos os número de 1 até n.
Exemplo de entrada:
6
Saída esperada:
1 2 3 4 5 6
*/

programa 
{
		
	funcao inicio() 
	{
		inteiro  numN, N

		numN = 0
		N = 6 //'N' é o número de incrementações (somas) a partir no numN(0). Usem outros números para testarem.

		enquanto(numN < N) {      //'para' igual 'for'
			numN = numN + 1       //para esse incremento pode substituir o 'numN+1 por numN++'
			escreva(numN + " ")   //as aspas (" ") e o espaço dentro é para separar os números na impressão(escreva)
	     	
		}
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 298; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */