public class Movie {
    String sName;
    int iYearOfRelase, iTotalOfRating=0;
    double dDurantionMinutes, dSumOfRating;
    boolean bIncluded;

    void showSpecifications() {
        System.out.println("O nome do filme é: " + sName);
        System.out.println("O ano do filme é: " + iYearOfRelase);
    }

    void ratingMovie (double dRate) {
        dSumOfRating = dSumOfRating + dRate;
        iTotalOfRating++;
    }

    double getMedia () {
        double media = dSumOfRating / iTotalOfRating;
        return media;
    }
}
