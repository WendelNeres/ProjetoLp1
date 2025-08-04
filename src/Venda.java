package venda;

import java.util.ArrayList;

public class Venda {
    private int idVenda;
    private String dataVenda;
    private ArrayList<ItemVenda> itensVenda = new ArrayList<>();
    private String status;

    public Venda(int idVenda, String dataVenda) {
        this.idVenda = idVenda;
        this.dataVenda = dataVenda;
        this.status = "Pendente";
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void addItemVenda(ItemVenda item) {
        if (itensVenda == null) {
            itensVenda = new ArrayList<>();
        }
        this.itensVenda.add(item);
    }

    public void removeItemVenda(ItemVenda item) {
        this.itensVenda.remove(item);
    }

    public double calcularTotalVenda() {
        double total = 0.0;
        for (ItemVenda item : itensVenda) {
            total += item.getValorTotal();
        }
        return total;
    }

    public double calcularTotalVendaComDesc() {
        double total = 0.0;
        for (ItemVenda item : itensVenda) {
            total += item.getValorTotalComDesconto();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Venda: {" +
                "idVenda=" + idVenda + '\n' +
                " dataVenda='" + dataVenda + '\n' +
                " status='" + status + '\n' +
                " total=" + calcularTotalVenda() + "\n" +
                " totalComDesconto=" + calcularTotalVendaComDesc() + "\n" +
                " itensVenda=" + itensVenda +
                '}';
    }
}
