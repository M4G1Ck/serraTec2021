programa
{
	/*Escreva um programa para verificar se um triângulo pode ser formado pelo valor
fornecido para os ângulos.
Exemplo de entrada:
40 55 65
Saída esperada:
O triângulo não é válido*/

	funcao inicio()
	{
		inteiro a, b, c, soma

		escreva("Este programa irá verificar se um triângulo pode ser formado pelo valor dos ângulos\n")
		escreva("Informe o valor do ângulo A: ")
		leia(a)
		
		escreva("Informe o valor do ângulo B: ")
		leia(b)

		escreva("Informe o valor do ângulo C: ")
		leia(c)

		soma = a + b + c

		se
		(
			soma != 180.0 e a!= 0 e b!=0 e c!=0
		)
			{
				escreva("\nO triangulo nao pode ser formado!")
			}
		senao
			{
				escreva("\nO triangulo pode ser formado!")
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 568; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */