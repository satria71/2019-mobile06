package id.ac.polinema.idealbodyweight.util;

public class BodyMassIndex {
    private int weigth;
    private int height;
    private float index;

    public BodyMassIndex(int weigth, int height) {
        this.weigth = weigth;
        this.height = height;
        this.index = calculate();
    }

    public float getIndex() {
        return index;
    }

    private float calculate(){
        return (float) (weigth / Math.pow(height,2));
    }
}
