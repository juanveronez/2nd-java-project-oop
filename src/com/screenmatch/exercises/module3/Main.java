package com.screenmatch.exercises.module3;



public class Main {
    public static void main(String[] args) {
        exercise2();
    }

    /**
     * Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos. Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço. Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar informações.
     */
    public static void exercise1() {
        Jeep jeep = new Jeep();
        jeep.setModel("Jeep Renegate");
        jeep.setPrices(120_000.00, 150_000.00, 115_000.00);

        System.out.println(jeep);
    }

    /**
     * Crie uma classe Animal com um método emitirSom(). Em seguida, crie duas subclasses: Cachorro e Gato, que herdam da classe Animal. Adicione o método emitirSom() nas subclasses, utilizando a anotação @Override para indicar que estão sobrescrevendo o método. Além disso, adicione métodos específicos para cada subclasse, como abanarRabo() para o Cachorro e arranharMoveis() para o Gato.
     */
    public static void exercise2() {
        Cat morticia = new Cat();
        morticia.makeSomethingRisky();
        morticia.makeSomethingRisky();

        System.out.println("Número de vidas da Morticia aqui: " + morticia.getLivesNumber());

        morticia.makeSomethingRisky();
        morticia.makeSomethingRisky();
        morticia.makeSomethingRisky();
        morticia.makeSomethingRisky();
        morticia.makeSomethingRisky();
        morticia.makeSomethingRisky();

        Dog pandora = new Dog();
        System.out.println("Pandora: " + pandora.emitAnimalSound());;
    }

    /**
     * Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. Adicione um método específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.
     */
    public void exercise3() {}

    /**
     * Crie uma classe NumerosPrimos com métodos como verificarPrimalidade() e listarPrimos(). Em seguida, crie duas subclasses, VerificadorPrimo e GeradorPrimo, que herdam da classe NumerosPrimos. Adicione um método específico para cada uma das subclasses, como verificarSeEhPrimo() para o VerificadorPrimo e gerarProximoPrimo() para o GeradorPrimo.
     */
    public void exercise4() {

    }
}
