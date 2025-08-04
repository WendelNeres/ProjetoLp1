

public class ItemVenda {
   private Produto produto;
   private int quant;

    public ItemVenda(Produto produto, int quant) {
        this.produto = produto;
        this.quant = quant;
        
    }

  
    public Produto getProduto() {
        return produto;
    }

    
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

  
    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    
    }
    public float calcularTotalItem(float total){
            
        total = produto.getPrecoUnitario()* quant;
        return total;
            
        }
    public float calcularTotalItemComDesconto(){
        return this.produto.precoComDesconto() * this.quant;

    }

    @Override
    public String toString() {
        return
                "produto=" + produto.getNome() +
                ", quant=" + quant
                ;
    }
}
