import Activation.ActivationFunction;
import Activation.Sigmoid;
import Input.Addition;
import Input.InputFunction;
import Input.Weights;
import Input.Data;
import Neuron.Neuron;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String csvFile = "/home/enis/Desktop/YapayZeka/heart.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        boolean check = false;
        ArrayList<Double> dataSet = new ArrayList<>();

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] country = line.split(cvsSplitBy);
                if (check){
                    dataSet.add(Double.parseDouble(country[7]));
                }
                check = true;
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        Data data = new Data();
        data.setData(dataSet);
        data.dataCompression();

        Weights weights = new Weights();
        weights.randomWeights(dataSet.size(),true);

        InputFunction addition = new Addition();

        ActivationFunction sigmoid = new Sigmoid();

        Neuron neuron = new Neuron();

        neuron.Data(data);
        neuron.Weights(weights);
        neuron.InputFunction(addition);
        neuron.ActivationFunction(sigmoid);
        System.out.println(neuron.toString());

    }
}
