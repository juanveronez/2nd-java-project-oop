public class Movie {
    String name;
    int releaseYear;
    boolean isFree;
    double imdbReview;
    double reviewsSum;
    int reviewsQuantity;
    int durationInMinutes;

    void displaySpecs() {
        String specs = """
                        -------- Fixa Técnica do Filme --------
                        %s
                        Nota no IMDB:           %.2f
                        Ano de lançamento:      %d
                        Duração (em minutos):   %d
                        """.formatted(name, imdbReview, releaseYear, durationInMinutes);

        System.out.println(specs);
    }

    void addReview(double reviewScore) {
        reviewsSum += reviewScore;
        reviewsQuantity++;
    }

    double getMeanOfReviews() {
        return reviewsSum / reviewsQuantity;
    }
}
