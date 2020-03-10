package Input;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.function.DoubleBinaryOperator;

public class Weights {

    private ArrayList<Double> weights = new ArrayList<Double>();

    public Weights() {
    }

    public Weights(ArrayList<Double> weights) {
        this.weights = weights;
    }

    public ArrayList<Double> getWeights() {
        return weights;
    }

    public void setWeights(ArrayList<Double> weights) {
        this.weights = weights;
    }

    public void setWeights(double weights) {
        this.weights.add(weights);
    }

    public void randomWeights(int size,boolean negative){
        double tempDouble;
        double upper;
        double lower;
        for (int i = 0; i < size; i++) {
            if(negative){
              upper = 1;
              lower = -1;
            }else {
               upper = 1;
               lower = 0;
            }
            tempDouble =  Math.random() * (upper - lower) + lower;
            tempDouble = Double.parseDouble(new DecimalFormat("##.######").format(tempDouble));
            this.weights.add(tempDouble);
        }
    }

    @Override
    public String toString() {
        return "Weights{" +
                "weights=" + weights +
                '}';
    }
}
