package exercicios.exercicio7;

//Crie uma classe que represente um aluno considerando os atributos:nome,p1,p2.
//Em outra classe,no mesmo pacote crie uma classe principal(Main.java)e:
//		a.crie uma variável a1 do tipo aluno que receba a instância de Aluno;
//		b.atribua valores arbitrários;
//		c.mostre os valores;
//		d.crie uma variável a2 que receba a1;
//		e.altere os valores da p1 e p2 na variável a2 e mostre os valores dos atributos de a1 e a2;
//		f.os valores são diferentes?explique.

public class Aluno {

	private String nome;
	private Integer p1;
	private Integer p2;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getP1() {
		return p1;
	}

	public void setP1(Integer p1) {
		this.p1 = p1;
	}

	public Integer getP2() {
		return p2;
	}

	public void setP2(Integer p2) {
		this.p2 = p2;
	}
}
