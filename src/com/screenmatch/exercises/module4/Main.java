package com.screenmatch.exercises.module4;

import com.screenmatch.exercises.module4.models.CurrencyConvertor;
import com.screenmatch.exercises.module4.models.RetangularRoomCalculator;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();

    }

    /**
     * Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o método converterDolarParaReal() para converter um valor em dólar para reais. A classe deve receber o valor em dólar como parâmetro.
     */
    public static void exercise1 () {
        CurrencyConvertor convertor = new CurrencyConvertor();
        double dollars = 15.99;
        double reais = convertor.convertDollarToReal(dollars);

        System.out.printf("""
                Valor em dólares:   $ %.2f
                Valor em reais:    R$ %.2f
                """, dollars, reais);
    }

    /**
     * Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com os métodos calcularArea() e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular. A classe deve receber altura e largura como parâmetros.
     */
    public static void exercise2 () {
        RetangularRoomCalculator roomCalculator = new RetangularRoomCalculator();
        roomCalculator.setHeight(5);
        roomCalculator.setWidth(10);

        System.out.printf("""
                Sua sala de %.1fmx%.1fm
                Perímetro: %.1fm
                Área: %.1fm2
                """,
                roomCalculator.getHeight(),
                roomCalculator.getWidth(),
                roomCalculator.calculatePerimeter(),
                roomCalculator.calculateArea()
        );
    }
}
