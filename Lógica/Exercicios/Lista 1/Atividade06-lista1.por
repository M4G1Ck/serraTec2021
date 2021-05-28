programa
{
	/* Escreva um programa que diga se o número é par ou ímpar
Dica : o operador % calcula a divisão de um número X por um número Y e retorna o
resto da divisão
Exemplo :
Entrada:
Digite um número : 2
Saída:
O número 2 é par

	 * 	
	 */
	funcao inicio()
	{
		inteiro n1, divisao

		escreva("Digite um número: ")
		leia(n1)

		divisao = n1 % 2 

		se(divisao == 0)
		{
			escreva("O número ", n1, " é par")
		}
		senao
		{
			escreva("O número ", n1, " é ímpar")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 472; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 */