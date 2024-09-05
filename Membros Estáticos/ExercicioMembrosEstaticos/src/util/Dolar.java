package util;

public class Dolar {

    public static double valorDolar = 5.50;
    public static double taxa = 0.06;

    public static double valorPagar(double qtdDolar){
            return (qtdDolar * valorDolar) + ((qtdDolar * valorDolar) * taxa);
    }
}
