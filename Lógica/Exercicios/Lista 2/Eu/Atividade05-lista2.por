programa
{
	
	funcao inicio()
	{
/*Implemente um programa tomador de decisão que considera as seguintes opções
para determinar se o usuário usará a fila preferencial ou a fila comum.
O usuário usa a fila preferencial caso :
● Possui mais de 60 anos : Usa fila preferencial
● É deficiente físico : Usa fila preferencial
● É mulher gestante : Usa fila preferencial
O programa recebe como entrada a Idade, Sexo e a condição especial do usuário, se
houver.
Exemplo de entrada:
22
homem
deficiente
Saída esperada:
Fila preferencial
*/
	inteiro idade, condicaoEspecial, sexo
	
		escreva("Para melhorar nosso atendimento em nossa fila, preencha os requisitos abaixo:\n")
		escreva("Informe sua idade: ")
		leia(idade)

		escreva("Digite seu sexo: \n1 - Feminino \n2 - Masculino \n")
		leia(sexo)

		escreva("Possui condição especial?: \n1 - Gestante \n2 - Deficiente \n3 - Não \n: ")
		leia(condicaoEspecial)
		
			se(idade >= 60 ou (condicaoEspecial ==1 e sexo ==1) ou condicaoEspecial == 2)
			{
				escreva("Você está na fila preferencial!")
			}
			senao
				{
				escreva("Você está na fila comum")
				}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 874; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */