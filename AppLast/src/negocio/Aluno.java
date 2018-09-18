package negocio;

import interfaces.IExibido;

public class Aluno implements IExibido{
	
	private String nome;
	private int idade;
	private float mensalidade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public float getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}

	public void exibir() {
		System.out.printf("O aluno %s tem %d anos e paga R$%.2f\n",
				nome,	
				idade,
				mensalidade);
		
	}
	
	public void relatorio() {
		
		
	}
}
