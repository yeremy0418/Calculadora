package Calculadora;

public class Operations {

    private double num1;
    private double num2;

    public Operations() {
    }

    public Operations(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double addition(double num1, double num2) {
        return num1 + num2;
    }

    public double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public double division(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("ERROR");
        }
        return num1 / num2;
    }

    public double exponentiation(double base, double power) {
        return Math.pow(base, power);
    }

    public double percentage(double num, double percentage) {
        return (num * percentage) / 100;
    }
}
