package Input;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Data {

    private ArrayList<Double> data = new ArrayList<Double>();

    public Data() {
    }

    public Data(ArrayList<Double> data) {
        this.data = data;
    }

    public ArrayList<Double> getData() {
        return data;
    }

    public void setData(ArrayList<Double> data) {
        this.data = data;
    }

    public void dataCompression(){
        double compress = 0;
        double minValue = Collections.min(this.data);
        double maxValue = Collections.max(this.data);
        for (int i = 0; i < data.size(); i++) {
            compress = Double.parseDouble(new DecimalFormat("##.######").format(((data.get(i) - minValue) / (maxValue - minValue))));
            data.set(i,compress);
        }
    }

    @Override
    public String toString() {
        return "Data{" +
                "data=" + data +
                '}';
    }
}
