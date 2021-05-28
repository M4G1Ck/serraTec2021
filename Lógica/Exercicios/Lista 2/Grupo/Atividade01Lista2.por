programa
{
	
	funcao inicio()
	{
		/*Escreva um programa para verificar se um triângulo pode ser formado pelo valor
fornecido para os ângulos.*/


		inteiro A, B, C, SOMA
		
	
	
			escreva(" Este programa irá verificar a validade dos ângulos do triângulo ")

			escreva("Digite o valor de A: ")
			leia(A)

			escreva("\nDigite o valor de B: ")
			leia(B)
			escreva("\nDigite o valor de C: ")
			leia(C)

			SOMA = A + B + C
							    
				
				se(SOMA != 180)
			{		
					escreva("\n\nOs valores fornecidos são nulos.", "\n\nTente novamente!")
				
			
			}		
					senao
					se(SOMA == 180)

			{	
					escreva("Parabéns! \nOs valores digitados são válidos. \nSeu triângulo será formado.")
				
			}

				
			

			

		
	}		 
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 714; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */