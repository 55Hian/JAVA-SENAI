package javafundamentals;

public class TestarAluno {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		Aluno aluno2 = new Aluno();
		
		aluno.definirNome("Hian");
		aluno2.definirNome("Gabriel");
		
		System.out.println(aluno.obterNome());
		System.out.println(aluno2.obterNome());

	}

}
