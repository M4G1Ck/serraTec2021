package main;
import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;
import impostos.Selic;

public class TestaAtualizadorDeContas {
    public static void main(String[] args) {

		//Conta c = new Conta();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();

		Selic adc = new Selic(0.01);

		//c.deposita(1000);
		cc.deposito(1000);
		cp.deposito(1000);

		//adc.roda(c);
		adc.roda(cc);
		adc.roda(cp);

		System.out.println("Saldo Total: " + adc.getSaldoTotal());
	}
}
