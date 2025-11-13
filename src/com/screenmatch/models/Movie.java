package com.screenmatch.models;

public class Movie {
    String name;
    int releaseYear;
    boolean isFree;
    double imdbReview;
    int durationInMinutes;

    private double reviewsSum;
    private int reviewsQuantity;

    public void displaySpecs() {
        String specs = """
                        -------- Fixa Técnica do Filme --------
                        %s
                        Nota no IMDB:           %.2f
                        Ano de lançamento:      %d
                        Duração (em minutos):   %d
                        """.formatted(name, imdbReview, releaseYear, durationInMinutes);

        System.out.println(specs);
    }

    public void addReview(double reviewScore) {
        reviewsSum += reviewScore;
        reviewsQuantity++;
    }

    public double getMeanOfReviews() {
        return reviewsSum / reviewsQuantity;
    }

    public int getReviewsQuantity() {
        return reviewsQuantity;
    }
}
