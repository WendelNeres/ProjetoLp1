import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Produto p1 = new Livro("Joao",200,1,"Livro 1",50,10);
        Produto p2 = new Livro("Maria",200,2,"Livro 2",50,10);
        Produto p3 = new Eletronico(1,"Celular",1000,10,6,"220");
        Produto p4 = new Eletronico(2,"Liquidificador",180,10,2,"220");
        Produto p5 = new Eletronico(1,"Televisão",2000,10,10,"220");

        ItemVenda itemVenda1 = new ItemVenda(p1, 2);
        ItemVenda itemVenda2 = new ItemVenda(p4, 1);
        ItemVenda itemVenda3 = new ItemVenda(p3, 1);

        Venda venda1 = new Venda(1, "04/08/2025");
        venda1.addItemVenda(itemVenda1);
        venda1.addItemVenda(itemVenda2);

        System.out.println(venda1);


        Venda venda2 = new Venda(2, "03/08/2025");
        venda2.addItemVenda(itemVenda3);
        venda2.addItemVenda(itemVenda1);
        venda2.addItemVenda(itemVenda2);

        venda2.removeItemVenda(itemVenda1);

        System.out.println(venda2);


    }
}
