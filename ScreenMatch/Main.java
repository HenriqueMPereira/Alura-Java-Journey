public class Main {
    public static void main(String[] args) {
        Movie meuFilme1 = new Movie();
        double dMedia;

        meuFilme1.sName = "Rei Leão";
        meuFilme1.iYearOfRelase = 2005;

        meuFilme1.ratingMovie(5.5);
        meuFilme1.ratingMovie(10);
        meuFilme1.ratingMovie(4.5);

        meuFilme1.showSpecifications();
        dMedia = meuFilme1.getMedia();
        System.out.println("A média do filme é: " + dMedia);
    }
}
