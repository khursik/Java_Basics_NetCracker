package ru.netcracker.task1;

public class Equation {

    private static double a, b, c;

    public void setCoefficients(double a0, double b0, double c0) {
        if (a0 == 0) try {
            throw new Exception("The equation must be quadratic!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        a = a0;
        b = b0;
        c = c0;
    }

    public Roots getResult() {
        Roots roots = new Roots();
        Discriminant d = new Discriminant();
        if (d.getDiscriminant() >= 0) {
            roots.x1 = (-b + Math.sqrt(d.getDiscriminant())) / (2 * a);
            roots.x2 = (-b - Math.sqrt(d.getDiscriminant())) / (2 * a);
        } else {
            roots.x1 = null;
            roots.x2 = null;
        }
        return roots;
    }

    public static class Roots {

        public Double x1, x2;

        @Override
        public String toString() {
            return "roots: " + x1 + ", " + x2;
        }
    }
    public static class Discriminant {
        public double getDiscriminant() {
            return b * b - 4 * a * c;
        }
    }
}
