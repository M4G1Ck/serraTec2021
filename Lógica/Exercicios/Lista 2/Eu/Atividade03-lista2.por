programa
{
/*Escreva um programa para verificar se um caractere é uma vogal ou consoante.
Exemplo de entrada:
k
Saída esperada:
k é uma consoante*/
	
	funcao inicio()
	{
		caracter letra
		escreva("Digite uma letra: ")
		leia(letra)

		enquanto	(
				letra != 'q' e letra != 'w' e letra != 'e' e letra != 'r' e letra != 't' e letra != 'y' e letra != 'u' e letra != 'i' e letra != 'o' e letra != 'p' e  
				letra != 'a' e letra != 's' e letra != 'd' e letra != 'f' e letra != 'g' e letra != 'h' e letra != 'j' e letra != 'k' e letra != 'l' e 
				letra != 'z' e letra != 'x' e letra != 'c' e letra != 'v' e letra != 'b' e letra != 'n' e letra != 'm' e
				letra != 'Q' e letra != 'W' e letra != 'E' e letra != 'R' e letra != 'T' e letra != 'Y' e letra != 'U' e letra != 'I' e letra != 'O' e letra != 'P' e  
				letra != 'a' e letra != 's' e letra != 'd' e letra != 'f' e letra != 'g' e letra != 'h' e letra != 'j' e letra != 'k' e letra != 'l' e 
				letra != 'Z' e letra != 'X' e letra != 'C' e letra != 'V' e letra != 'B' e letra != 'N' e letra != 'M'
				)
				{
					escreva("Opção inválida.")
					escreva(" ")
					escreva("\nDigite uma letra: ")
					leia(letra)
					limpa()
				}
		se
		(
			letra == 'A' ou letra == 'E' ou letra == 'I' ou letra == 'O' ou letra == 'U' ou
			letra == 'a' ou letra == 'e' ou letra == 'i' ou letra == 'o' ou letra == 'u'	
		)
			{
				escreva(letra, " é uma vogal")
			}
		senao
			{
				escreva(letra, " é uma consoante")
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1116; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */