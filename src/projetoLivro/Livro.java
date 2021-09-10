package projetoLivro;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa p) {
	this.titulo = titulo;
	this.autor = autor;
	this.paginaAtual = 0;
	this.aberto = false;
	this.totPaginas = totPaginas;
	this.leitor = p;
    }

    public String detalhes() {
	return "Livro titulo = " + titulo + "\n Autor = " + autor + "\n Total de Paginas = " + totPaginas
		+ "\n Pagina atual = " + paginaAtual + "\n Aberto = " + aberto + "\n Leitor = " + leitor.getNome()
		+ ", de " + leitor.getIdade() + " anos, do sexo " + leitor.getSexo();
    }

    public String getTitulo() {
	return titulo;
    }

    public void setTitulo(String titulo) {
	this.titulo = titulo;
    }

    public String getAutor() {
	return autor;
    }

    public void setAutor(String autor) {
	this.autor = autor;
    }

    public int getTotPaginas() {
	return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
	this.totPaginas = totPaginas;
    }

    public int getPaginaAtual() {
	return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
	this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
	return aberto;
    }

    public void setAberto(boolean aberto) {
	this.aberto = aberto;
    }

    public Pessoa getLeitor() {
	return leitor;
    }

    public void setLeitor(Pessoa leitor) {
	this.leitor = leitor;
    }

    @Override
    public void abrir() {
	this.aberto = true;
    }

    @Override
    public void fechar() {
	this.aberto = false;
    }

    @Override
    public void folhear(int p) {
	this.paginaAtual = p;
    }

    @Override
    public void avancarPag() {
	this.paginaAtual++;
    }

    @Override
    public void voltarPag() {
	this.paginaAtual--;
    }

}
