package aplicacao;

public abstract class Contribuinte {
	private String nome;
	private double rendaBruta;

	public Contribuinte(String nome, double rendaBruta) {
		this.nome = nome;
		this.rendaBruta = rendaBruta;
	}

	public abstract double calcularImposto();

	public double getRendaBruta() {
		return rendaBruta;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nRenda Bruta: R$" + rendaBruta;
	}
}
