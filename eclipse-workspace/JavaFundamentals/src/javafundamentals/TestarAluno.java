package javafundamentals;

public class TestarAluno {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		Aluno aluno2 = new Aluno();
		Corintiano serHumano3 = new Corintiano();
		
		aluno.definirNome("Hian");
		aluno2.definirNome("Gabriel");
		serHumano3.nome = "thiago";
		
		System.out.println(aluno.obterNome());
		System.out.println(aluno2.obterNome());
		System.out.println(serHumano3.nome);

	}

}
