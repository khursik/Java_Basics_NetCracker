package ru.netcracker.task1;

public class Main {
    public static void main(String[] args) {
        Equation equation = new Equation();
        equation.setCoefficients(1, -4, 7);
        System.out.println(equation.getResult());
    }
}
