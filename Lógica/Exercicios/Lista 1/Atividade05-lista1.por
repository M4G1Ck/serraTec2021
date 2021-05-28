programa
{
	
	funcao inicio()
	{
		inteiro n1, n2
		
		// Escreva um programa que encontre o valor máximo entre 2 números
		
		escreva("Digite um número: ")
		leia(n1)
		
		escreva("Digite outro número: ")
		leia(n2)

		se(n1 > n2)
		{
			escreva("O primeiro número digitado (", n1, ") é maior que o segundo (", n2, ")! ") 
		}

		senao
		{
			se(n1 < n2)
			{
				escreva("O segundo número digitado (", n2, ") é maior que o primeiro (", n1, ")! ")
			}
			senao
			{
				escreva("O primeiro número digitado (", n1, ") é igual ao segundo (", n2, ")! ")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 539; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */