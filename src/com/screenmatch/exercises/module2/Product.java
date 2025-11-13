package com.screenmatch.exercises.module2;

/**
 * Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.
 */
public class Product {
    private String name;
    private double price;

    public void applyDiscount(double discountPercent) {
        if (discountPercent > 100) {
            System.out.println("Um desconto maior que 100% é inválido!");
            return;
        }

        if (discountPercent < 0) {
            System.out.println("Um desconto negativo é inválido!");
            return;
        }

        this.price *= (1 - discountPercent / 100);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
