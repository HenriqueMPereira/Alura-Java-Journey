import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listaDeNomes = new ArrayList<>();
        listaDeNomes.add("Henrique");
        listaDeNomes.add("Cesar");
        listaDeNomes.add("Pedro");
        listaDeNomes.add("Marcelo");


        listaDeNomes.remove("Cesar");
        System.out.println(listaDeNomes);
    }
}