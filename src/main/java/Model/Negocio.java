package Model;

import java.time.LocalDate;

public final class Negocio {
    private final double preco;
    private final int quantidade;
    private final LocalDate data;

    public Negocio(double preco, int quantidade, LocalDate data) {
        this.preco = preco;
        this.quantidade = quantidade; this.data = data;
    }
    // ...metódos get
    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public LocalDate getData() {
        return data;
    }

    public double getVolumeDinheiro(){
        return preco * quantidade;
    }

}
