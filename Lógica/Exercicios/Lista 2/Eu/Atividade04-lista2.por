programa
{
	
	funcao inicio()
	{
		/*Escreva um programa que funcione como uma calculadora simples de soma (+),
		subtração(-), multiplicação(*) e divisão(/)
		Exemplo de entrada:
		10*2
		Saída esperada:
		10 * 2 = 20 */

		real n1, n2
		caracter operacao
		
		escreva("Digite o primeiro número: ")
		leia(n1)

		escreva("Digite o segundo número: ")
		leia(n2)

		escreva("Digite a operação ( '+', '-', '*', '/'): ")
		leia(operacao)
		
			se
			(operacao == '+')
			{
				escreva("\nO resultado da soma entre ", n1, " e " , n2, " é igual a: ", n1 + n2)
			}
			senao se
			(operacao == '-')
			{
				escreva("\nO resultado da subtracao entre ", n1, " e ", n2, " é igual a: ", n1 - n2)
			}
			senao se
			(operacao == '*')
			{
				escreva("\nO resultado da multiplicacao entre ", n1, " e ", n2, " é igual a: ", n1 * n2) 
			}
			senao se
			(operacao == '/')
			{
				escreva("\nO resultado da divisao entre ", n1, " e ", n2, " é igual a : ", n1 / n2)
			}
				senao
					{
						escreva("Operação inválida!")
					}
			
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1016; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */