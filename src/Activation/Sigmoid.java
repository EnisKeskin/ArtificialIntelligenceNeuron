package Activation;

public class Sigmoid implements ActivationFunction {

    double result = 0;
    @Override
    public double activation(double data) {
        return result = 1/(1+Math.pow(Math.E,-data));
    }

    @Override
    public String toString() {
        return "Sigmoid{" +
                "result=" + result +
                '}';
    }
}
