public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();

        myMovie.name = "O Senhor dos Anéis: A Sociedade do Anel";
        myMovie.releaseYear = 2002;
        myMovie.durationInMinutes = 171;
        myMovie.imdbReview = 8.9;

        myMovie.displaySpecs();

        myMovie.addReview(8);
        myMovie.addReview(5);
        myMovie.addReview(6);
        myMovie.addReview(10);

        System.out.printf("Média de notas na plataforma: %.2f", myMovie.getMeanOfReviews());
    }
}
