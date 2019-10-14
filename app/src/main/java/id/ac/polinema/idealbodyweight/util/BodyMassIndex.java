package id.ac.polinema.idealbodyweight.util;

public class BodyMassIndex {
    private float weigth;
    private float height;
    private float index;

    public BodyMassIndex(float weigth, float height) {
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
