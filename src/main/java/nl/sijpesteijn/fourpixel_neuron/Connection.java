package nl.sijpesteijn.fourpixel_neuron;

public class Connection {
    private final Double value;
    private final Double weight;

    public Connection(Double value, Double weight) {
        this.value = value;
        this.weight = weight;
    }

    public Double getValue() {
        return value;
    }

    public Double getWeight() {
        return weight;
    }
}
