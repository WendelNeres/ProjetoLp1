public class Livro extends Produto {
    String autor;
    int numeroPaginas;

    public Livro(String autor, int numeroPaginas, int idProduto, String nome, float precoUnitario, int quantEstoque){
        
        super(idProduto,nome,precoUnitario,quantEstoque);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public float precoComDesconto() {
        return (float) (this.precoUnitario * 0.85);
    }

    public String toString() {
        return toString() +
               "\nAutor: " + autor +
               "\nNúmero de Páginas: " + numeroPaginas +
               "\nPreço com Desconto: " + precoComDesconto();
    }
}

