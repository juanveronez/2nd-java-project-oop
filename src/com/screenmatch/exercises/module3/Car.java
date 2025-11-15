package com.screenmatch.exercises.module3;

public class Car {
    private String model;
    private double priceYear1;
    private double priceYear2;
    private double priceYear3;

    public String getModel() {
        return model;
    }

    public double getHighestPrice() {
        double highestPrice = priceYear1;

        if (priceYear2 > highestPrice) highestPrice = priceYear2;

        if (priceYear3 > highestPrice) highestPrice = priceYear3;

        return highestPrice;
    }

    public double getLowestPrice() {
        double lowestPrice = priceYear1;

        if (priceYear2 < lowestPrice) lowestPrice = priceYear2;

        if (priceYear3 < lowestPrice) lowestPrice = priceYear3;

        return lowestPrice;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrices(double priceYear1, double priceYear2, double priceYear3) {
        this.priceYear1 = priceYear1;
        this.priceYear2 = priceYear2;
        this.priceYear3 = priceYear3;
    }

    @Override
    public String toString() {
        return """
                Modelo: %s
                Preços: R$ %.2f (ano 1), R$ %.2f (ano 2) e R$ %.2f (ano 3)
                Maior preço: R$ %.2f
                Menor preço: R$ %.2f
                """.formatted(model, priceYear1, priceYear2, priceYear3, getHighestPrice(), getLowestPrice());
    }
}
