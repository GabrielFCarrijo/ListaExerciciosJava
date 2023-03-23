package listaExercicio1.exercicio7;

//Crie uma classe que represente um aluno considerando os atributos:nome,p1,p2.
//Em outra classe,no mesmo pacote crie uma classe principal(Main.java)e:
//		a.crie uma variável a1 do tipo aluno que receba a instância de Aluno;V
//		b.atribua valores arbitrários;V
//		c.mostre os valores;V
//		d.crie uma variável a2 que receba a1;V
//		e.altere os valores da p1 e p2 na variável a2 e mostre os valores dos atributos de a1 e a2;V
//		f.os valores são diferentes?explique.
//      Os valores atribuidos dos dois sao sim diferentes, mais a alocação da memoria so muda e assim mudando o valor
//      apenas quando damos um new Aluno por ex.

public class Main {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		a1.setNome("Pedro");
		a1.setP1(10);
		a1.setP2(4);

		System.out.println(
				"Aluno " + a1.getNome() + " tirou nota " + a1.getP1() + " na p1 e na p2 tirou " + a1.getP2());

		Aluno a2 = a1;
		a2.setP1(4);
		a2.setP2(10);

		System.out.println(
				"Aluno " + a2.getNome() + " tirou nota " + a2.getP1() + " na p1 e na p2 tirou " + a2.getP2());
	}
}
