package traitement;

public class Calculatrice implements InterCalcul {

    @Override
    public double add(double op1, double op2) {
        return op1 + op2;
    }

    @Override
    public double sous(double op1, double op2) {
        return op1 - op2;
    }

    @Override
    public double multi(double op1, double op2) {
        return op1 * op2;
    }

    @Override
    public double div(double op1, double op2) {
        return op1 / op2;
    }

    public Calculatrice() {

    }
}
