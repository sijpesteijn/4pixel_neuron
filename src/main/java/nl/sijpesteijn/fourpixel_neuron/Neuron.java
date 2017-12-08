package nl.sijpesteijn.fourpixel_neuron;

import java.util.ArrayList;
import java.util.List;

public class Neuron {
    private List<Connection> connections = new ArrayList<>();

    public Double getOutput() {
        return this.connections.stream()
                .mapToDouble(connection -> connection.getValue() * connection.getWeight())
                .sum()/connections.size();
    }

    public void addConnection(Connection connection) {
        this.connections.add(connection);
    }

    public static void main(String[] args) {
        Neuron neuron = new Neuron();
        neuron.addConnection( new Connection(1d, 1d));
        neuron.addConnection(new Connection(-1d, 1d));
        System.out.println(neuron.getOutput());
    }
}
