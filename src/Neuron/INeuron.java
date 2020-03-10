package Neuron;

import Activation.ActivationFunction;
import Input.Data;
import Input.InputFunction;
import Input.Weights;

import java.util.ArrayList;

public interface INeuron {

    void Data (Data dataSet);
    void Weights (Weights weights);
    void InputFunction (InputFunction input);
    void ActivationFunction (ActivationFunction active);

}
