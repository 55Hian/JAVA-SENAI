package javafundamentals;

public class Aluno {
	private String nome = "";
	private int identificacao = 0;
	private String curso = "";
	private double media = 0;
	public final int CFP_AUTOMOBILISTICA = 113;
	
	public void definirNome(String nome) {
		this.nome = nome;
	}
	
	public String obterNome() {
		return nome;
	}
}
