public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();

        myMovie.name = "O Senhor dos Anéis: A Sociedade do Anel";
        myMovie.releaseYear = 2002;
        myMovie.durationInMinutes = 171;
        myMovie.review = 8.9;

        System.out.printf(
                "Filme - %s (nota: %.2f)%nLançado em %d com %d minutos de duração",
                myMovie.name, myMovie.review, myMovie.releaseYear, myMovie.durationInMinutes
        );
    }
}
