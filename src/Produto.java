public abstract class Produto {
    protected int idProduto;
    protected String nome;
    protected float precoUnitario;
    protected int quantEstoque;

    public Produto(int idProduto, String nome, float precoUnitario, int quantEstoque) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantEstoque = quantEstoque;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantEstoque() {
        return quantEstoque;
    }

    public abstract float precoComDesconto();

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }

    public float calcularValorEstoque(){
        return this.precoUnitario * this.quantEstoque;
    }

    public boolean atualizarEstoque(int quantidade){
        if (this.quantEstoque < quantidade) {
            return false;
        }else {
            setQuantEstoque( getQuantEstoque() - quantidade);
            return true;
        }
    }
}
