package polimorfismo.atv1;

public class Galo implements Animal {


    @Override
    public String emitirsom() {
        return "cocoricó";
    }

    @Override
    public String comer() {
        return "Milho";
    }
}
