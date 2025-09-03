package polimorfismo.atv1;

public class Pato implements Animal{

    @Override
    public String emitirsom() {
        return "Quacquac";
    }

    @Override
    public String comer() {
        return "Peixe";
    }
}
