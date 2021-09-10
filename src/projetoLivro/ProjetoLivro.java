package projetoLivro;

public class ProjetoLivro {
    public static void main(String[] args) {

	Pessoa[] p = new Pessoa[2];
	Livro[] l = new Livro[3];

	p[0] = new Pessoa("Daniel", 27, "M");
	p[1] = new Pessoa("Gabriela", 24, "F");

	l[0] = new Livro("A volta dos que não foram", "Frank Hustems", 300, p[0]);
	l[1] = new Livro("As tranças do Rei Careca", "John Fergson", 300, p[1]);

	System.out.println("===========================");
	System.out.println(l[0].detalhes());
	System.out.println("===========================");
	l[0].folhear(200);
	System.out.println(l[1].detalhes());
	System.out.println("===========================");

    }

}
