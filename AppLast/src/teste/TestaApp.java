package teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import negocio.Aluno;

public class TestaApp {

	public static void main(String[] args) {

		System.out.println("AppLast");

		int qtde = Integer.valueOf(args[0]);
		Scanner ler = new Scanner(System.in);
		List<Aluno> alunos = new ArrayList<Aluno>();
		
//		String[] nomes = new String[qtde];
//		List<String> Nomes = new ArrayList<String>();
//		int[] idades = new int[qtde];
//		List<Integer> Idades = new ArrayList<Integer>();
//		float[] mensalidades = new float[qtde];
//		List<Float> Mensalidades = new ArrayList<Float>();

		for (int i = 0; i < qtde; i++) {
			Aluno aluno = new Aluno();
	
			System.out.println("Informe o nome do aluno:");
			aluno.setNome(ler.next());

			System.out.println("Informe a idade do aluno:");
			aluno.setIdade(ler.nextInt());
			
			System.out.println("Informe a mensalidade do aluno:");
			aluno.setMensalidade(ler.nextFloat());	
			
			alunos.add(aluno);
		}
		
		ler.close();
		
		for (Aluno alunoPrint : alunos) {
			alunoPrint.exibir();
		}
	}
}

