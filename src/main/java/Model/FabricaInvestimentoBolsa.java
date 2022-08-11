package Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class FabricaInvestimentoBolsa {

   private List<Negocio> Listanegocios = new ArrayList<Negocio>();

    public InvestimentoBolsa constroiInvestimentoParaData(LocalDate data, List<Negocio> negocios) {
        double maximo = negocios.get(0).getPreco();
        double minimo = negocios.get(0).getPreco();
        double volume = 0;
        for (Negocio negocio : negocios) {
            volume += negocio.getVolumeDinheiro();
            if (negocio.getPreco() > maximo) {
                maximo = negocio.getPreco();
            } else if (negocio.getPreco() < minimo) {
                minimo = negocio.getPreco();
            }
        }
        double abertura = negocios.get(0).getPreco();
        double fechamento = negocios.get(negocios.size() - 1).getPreco();

        return new InvestimentoBolsa(abertura, fechamento, minimo, maximo,
                volume, data);
    }

    public List<Negocio> getListanegocios() {
        return Listanegocios;
    }

    public String constroiNegocio(double preco, int quantidade, LocalDate data){
       if (preco < 0 & data == null){
           //TODO: retorna erro
           return "ERROOOOOOO";

       }
        Negocio novoNegocio = new Negocio(preco, quantidade, data);
       getListanegocios().add(novoNegocio);
       return "SUCESSOOOOOO";

    }

    public void ordenaLista(){
        Arrays.sort(Listanegocios.);

        Collections.sort(Listanegocios, new SortByPreco());
    }


}

