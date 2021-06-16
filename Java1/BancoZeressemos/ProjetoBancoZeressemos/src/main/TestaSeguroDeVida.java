package main;
import conta.ContaCorrente;
import util.InteracaoUsuario;

public class TestaSeguroDeVida {
    public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		
		conta.deposito(150);
		double valorSeguro = InteracaoUsuario.lerDoubles("Informe o valor que deseja assegurar: ");
		
		conta.seguroDeVida(valorSeguro);
	}
}
