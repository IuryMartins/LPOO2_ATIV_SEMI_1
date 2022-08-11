package Model;

import java.time.LocalDate;

public final class InvestimentoBolsa {
    private final double abertura; //preço da primeira negociação do dia;
    private final double fechamento; //preço da última negociação do dia;
    private final double minimo; //preço da negociação mais barata do dia;
    private final double maximo; //preço da negociação mais cara do dia;
    private final double volume; //quantidade de dinheiro que passou
    //em todas as negociações nesse dia;
    private final LocalDate data; //a qual dia o resumo se refere
    public InvestimentoBolsa(double abertura, double fechamento,
                             double minimo, double maximo, double volume, LocalDate data) {
        this.abertura = abertura;
        this.fechamento = fechamento;
        this.minimo = minimo;
        this.maximo = maximo;
        this.volume = volume;
        this.data = data;
    }
//... métodos get...

    public double getAbertura() {
        return abertura;
    }

    public double getFechamento() {
        return fechamento;
    }

    public double getMinimo() {
        return minimo;
    }

    public double getMaximo() {
        return maximo;
    }

    public double getVolume() {
        return volume;
    }

    public LocalDate getData() {
        return data;
    }


    public boolean isAlta() {
        return this.abertura <= this.fechamento;
    }
    public boolean isBaixa() {
        return this.abertura > this.fechamento;
    }

}