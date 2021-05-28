programa
{
	
		
	
	funcao inicio()
	{

		real nt, ex, result01, result02

		/* Escreva um algoritmo que leia o total de horas normais e o total de horas extras trabalhadas por um empregado em um ano*/
							
		escreva(" Olá!/n Este programa irá calcular suas horas extras neste ano!") 

		escreva("\n\nDigite a quantidade de horas extras: ")
		leia(ex)

		escreva("Digite a quantidade de horas normais trabalhadas: ")
		leia(nt)

		result01 = nt * 10

		result02 = ex * 15

		/* Uma empresa paga R$10.00 por hora normal trabalhada e R$ 15.00 por hora extra.
  		e calcule o salário anual deste trabalhador. */

  		escreva("Seu Salário Anual é: ", (result01 + result02) )
				
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 677; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */