programa
{
	funcao inicio ()
	{
		inteiro n1, n2
		cadeia operacao
		
		escreva("calculadora elétrica, bixo!!!\nDigite um numero: ")
		leia(n1)
		escreva("Digite mais um número:")
		leia(n2)
		escreva("+, -, /, x")
		escreva("\nOperação:")
		leia(operacao)
		se( operacao == "+" )
		{
			escreva(n1, "+", n2, "=", n1+n2)
		}
		se( operacao == "-" )
		{
			escreva(n1, "-", n2, "=", n1-n2)
		}
		se( operacao == "x" )
		{
			escreva(n1, "x", n2, "=", n1*n2)
		}
		se( operacao == "/" )
		{
			real div
			div = n1/n2
			escreva(n1, "/", n2, "=", div)
		}
		
		
		
		
		
		
		
		
		
		
	}
}