programa
{
	funcao inicio ()
	{
		inteiro n1, n2, resulSoma, resulSub, resulMult
		real resulDiv
		
		escreva("Apresente dois números para efetuar as equações.\nDigite o primeiro número: ")
		leia(n1)
		escreva("Digite o segundo número: ")
		leia(n2)
		
		resulSoma = n1+n2
		resulSub = n1-n2
		resulDiv = n1/n2
		resulMult = n1*n2
		
		escreva("A soma de ", n1, " e ", n2, " é igual a ", resulSoma)
		escreva("\nA subtração de ", n1, " por ", n2, " é igual a ", resulSub)
		escreva("\nA divisão de ", n1, " por ", n2, " é igual a ", resulDiv)
		escreva("\nA multiplicação de ", n1, " por ", n2, " é igual a ", resulMult)			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 623; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */