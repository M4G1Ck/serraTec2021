programa
{
	
	funcao inicio()
	{
		/*Escreva um programa para verificar se um triângulo é Equilátero, Isósceles ou
		Escaleno.
		Exemplo de entrada:
		50 50 60
		Saída esperada:
		O triângulo é isósceles*/

		real a, b, c

		escreva("Digite o valor do primeiro lado do triângulo: ")
		leia(a)

		escreva("Digite o valor do segundo lado do triângulo: ")
		leia(b)

		escreva("Digite o valor do terceiro lado do triângulo: ")
		leia(c)
		
		se(a + b < c ou a + c < b ou b + c < a) 
		{
		 		escreva("Não é um triângulo!")
		}
		senao
			se(a == b e a == c)																
				{
					escreva("Equilátero")
				}	
			senao
			
			se(a == b ou a == c ou b == c) 
				{
					escreva("Isósceles")
				}
			senao
				{
					escreva("Escaleno")
				}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 10; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */