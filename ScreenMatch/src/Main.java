import io.github.henriquempereira.screenmatch.model.Movie;
import io.github.henriquempereira.screenmatch.service.RecommendationFilter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Movie filme1 = new Movie();
        filme1.setsName("A volta dos que não foram");
        filme1.setiNumberOfViews(100);
        filme1.setiDurationTime(120);

        // Avaliando filme para ter uma média quue será usada para testar o interface e classe filter
        filme1.setdRating(10);
        filme1.setdRating(8);
        System.out.println("A média do filme '" + filme1.getsName() + "' é : " + filme1.getdMedia());

        RecommendationFilter filter = new RecommendationFilter();
        filter.filter(filme1);
    }
}