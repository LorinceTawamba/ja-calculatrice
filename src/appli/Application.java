package appli;

import traitement.Calculatrice;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        double op1 = 35;
        double op2 = 0;
        double result;
        Calculatrice calculatrice = new Calculatrice();

        result = calculatrice.add(op1, op2);
        System.out.println(op1 + " + " + op2 + " = " + result);

        result = calculatrice.sous(op1, op2);
        System.out.println(op1 + " - " + op2 + " = " + result);

        result = calculatrice.multi(op1, op2);
        System.out.println(op1 + " x " + op2 + " = " + result);

        result = calculatrice.div(op1, op2);
        System.out.println(op1 + " / " + op2 + " = " + result);
    }
}
