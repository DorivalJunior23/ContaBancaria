package br.com.java;

public class Teste {
	public static void main(String[] args) {
		
		ContaCorrente[] cn = new ContaCorrente[2];
		
		ContaCorrente cc = new ContaCorrente();
		cc.setAgencia(1111);
		cc.setNumero(2222);
		cc.depositar(10000);
		cc.setChequeEspecial(45500);
		cc.setTipo("Pessoa Fisica");
		
		ContaCorrente cv = new ContaCorrente();
		cv.setAgencia(3333);
		cv.setNumero(9999);
		cv.depositar(500000);
		cv.setChequeEspecial(2400000);
		cv.setTipo("Pessoa Juridica");
		
		cn[0] = cc;
		cn[1] = cv;
		
		for(int i=0;i<2;i++) {
			System.out.println("Agencia: " + cn[i].getAgencia() + "\nNumero da conta: " + cn[i].getNumero() + "\nSaldo da conta: " + cn[i].getSaldo() + "\nCheque especial: " + cn[i].getChequeEspecial() + "\nSaldo total da conta" + cn[i].saldoDisponivel() + "\nTipo: " + cn[i].getTipo() + "\n");
		}
		
		}


}
