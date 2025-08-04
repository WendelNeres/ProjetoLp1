public class Eletronico extends Produto{
    private int garantiaMeses;
    private String voltagem;

    public Eletronico(int idProduto, String nome, float precoUnitario, int quantEstoque, int garantiaMeses, String voltagem) {
        super(idProduto, nome, precoUnitario, quantEstoque);
        this.garantiaMeses = garantiaMeses;
        this.voltagem = voltagem;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public String getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(String voltagem) {
        this.voltagem = voltagem;
    }



}
