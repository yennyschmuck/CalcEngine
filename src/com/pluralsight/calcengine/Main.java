package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
        performCalculations();
    }

    static void performCalculations() {
        MathEquation[] equations = new MathEquation[4];
        equations[0] = create(10.3d, 5.6d, 'a');
        equations[1] = create(8.99d, 7.6d, 's');
        equations[2] = create(6.22d, 12.4d, 'm');
        equations[3]= create(50.6d, 4.5d, 'd');

        for(MathEquation equation : equations) {
            equation.execute();
            System.out.println("Result: " + String.format("%.2f", equation.result));
        }
    }

    private static MathEquation create (double leftVal, double rightVal, char opCode) {
        MathEquation equation = new MathEquation();
        equation.leftVal = leftVal;
        equation.rightVal = rightVal;
        equation.opCode = opCode;

        return equation;
    }
}
