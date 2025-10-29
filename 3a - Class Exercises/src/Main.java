import io.github.henriquempereira.screematch.model.Filme;
import io.github.henriquempereira.screematch.model.Series;
import io.github.henriquempereira.screematch.model.Titulo;
import io.github.henriquempereira.screenmatch.service.CalculadoraDeTempo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Titulo titulo = new Titulo();
        titulo.setName("Avatar");
        titulo.setDurationInMinutes(180);
        System.out.println("O nome do titulo é: " + titulo.getName() + " e tem duração de : " + titulo.getDurationInMinutes());


        Filme favorito = new Filme();
        favorito.setName("Matrix");
        favorito.setYearOfRelease(1999);
        favorito.setDurationInMinutes(135);
        favorito.setIncludedInThePlan(true);

        Filme outro = new Filme();
        outro.setName("John Wick");
        outro.setYearOfRelease(2014);
        outro.setDurationInMinutes(101);
        outro.setIncludedInThePlan(true);

        Series serie = new Series();
        serie.setName("“La Casa de Papel”");
        serie.setYearOfRelease(2017);
        serie.setIncludedInThePlan(true);
        serie.setItActive(true);
        serie.setNumberOfSeason(5);
        serie.setNumberOfEp(10);
        serie.setDurationInMinutes(45);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.IncludeTitle(favorito);
        calculadora.IncludeTitle(outro);
        calculadora.IncludeTitle(serie);

        System.out.println("Tempo total: " + calculadora.getDurationTimeInMinutes());
    }
}