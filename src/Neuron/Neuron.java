package Neuron;

import Activation.ActivationFunction;
import Input.Data;
import Input.InputFunction;
import Input.Weights;

import java.util.ArrayList;

public class Neuron implements INeuron {

    private double inputData;
    private Data dataSet;
    private Weights weights;
    private InputFunction input;
    private ActivationFunction active;

    @Override
    public void Data(Data dataSet) {
        this.dataSet = dataSet;
    }

    @Override
    public void Weights(Weights weights) {
        this.weights = weights;
    }

    @Override
    public void InputFunction(InputFunction input) {
        this.input = input;
        this.input.inputProcess(this.dataSet,this.weights);
        inputData = input.getResult();
    }

    @Override
    public void ActivationFunction(ActivationFunction active) {
        this.active = active;
        this.active.activation(inputData);
    }

    @Override
    public String toString() {
        return "Neuron{" +
                "  \n inputData= " + inputData +
                ", \n dataSet= " + dataSet +
                ", \n weights= " + weights +
                ", \n active= " + active +
                '}';
    }
}
