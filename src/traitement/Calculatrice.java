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
        try {
            return op1 / op2;
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        if (op1 > 0) {
            return Double.POSITIVE_INFINITY;
        }

        return Double.NEGATIVE_INFINITY;
    }

    public Calculatrice() {

    }
}
