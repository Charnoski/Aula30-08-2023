package aplicacao;

import java.util.ArrayList;
import java.util.List;

public class Teste {
	public static void main(String[] args) {
		List<Contribuinte> contribuintes = new ArrayList<>();

		contribuintes.add(new PessoaFisica("João Simplicio", 1500.0, "123.123.123-11"));
		contribuintes.add(new PessoaFisica("Maria Das Dores", 3000.0, "567.123.321-44"));
		contribuintes.add(new PessoaJuridica("Empresa SMO", 100000.0, "12.342.678/0001-01"));
		contribuintes.add(new PessoaJuridica("Empresa SC", 50000.0, "12.123.564/0001-02"));

		for (Contribuinte c : contribuintes) {
			System.out.println(c);
			System.out.println("Imposto a pagar: R$" + c.calcularImposto());
			System.out.println("==========================================");
		}
	}
}
