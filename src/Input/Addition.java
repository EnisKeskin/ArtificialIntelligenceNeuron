package Input;


public class Addition implements InputFunction {

    private double result = 0;

    @Override
    public void inputProcess(Data data, Weights weights) {
        if ( data.getData().size() == weights.getWeights().size() ){
            for (int i = 0; i < data.getData().size(); i++) {
                this.result += data.getData().get(i) + weights.getWeights().get(i);

            }
        }else {
            System.out.println("Her veri için ağırlık gerekir.");
        }
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }



}
