programa
{
	
	funcao inicio()
	{
		real tempcelsius, tempfahr
		/*Escreva um programa que receba a temperatura em Celsius e retorne o valor em Fahrenheit
		Exemplo :
		Entrada:
		Digite o valor da temperatura em Celsius : 10
		Saída:
		10 graus Celsius é o mesmo que 50 graus Fahrenheit*/
		
		escreva("Digite o valor da temperatura em °C: ")
		leia(tempcelsius)

		tempfahr = (1.8 * tempcelsius) + 32
		
		escreva("O valor da temperatura em fahrenheit é: ",tempfahr)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 69; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */