package polimorfismo.atv2;

public class Soma implements Operacao{

    @Override
    public double calcular(double a, double b) {
        return a+b;
    }

}
