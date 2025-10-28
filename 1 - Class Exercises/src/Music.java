public class Music {
    String sName, sArtist;
    int iYearReleased, iNumRating;
    double dRate;

    void technicalSpecification () {
        System.out.println("O nome da música é: " + sName);
        System.out.println("Foi lançada em: " + iYearReleased);
        System.out.println("Avaliação: " + dRate);
    }

    void rateTheMusica (double dScore) {
        dRate += dScore;
        iNumRating++;
    }

    double mediaOfTheMusic () {
        double dMedia = dRate / iNumRating;
        return dMedia;
    }

}
