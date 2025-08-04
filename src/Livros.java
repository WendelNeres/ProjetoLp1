public class Livros extends Produto {
    String autor;
    int numeroPaginas;

    public Livros(String autor,int numeroPaginas){
        
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

    public double precoComDesconto() {
        return (float) (this.PrecoUnitario * 0.85);
    }

    public String toString() {
        return toString() +
               "\nAutor: " + autor +
               "\nNúmero de Páginas: " + numeroPaginas +
               "\nPreço com Desconto: " + precoComDesconto();
    }
}
