package nl.sijpesteijn.fourpixel_neuron;

import org.junit.Test;

import static org.junit.Assert.*;

public class NeuronTest {

    @Test
    public void testNoMatch() throws Exception {
        Neuron neuron = new Neuron();
        neuron.addConnection(new Connection(0d, 1d));
        neuron.addConnection(new Connection(0d, 1d));
        assertEquals(0d,neuron.getOutput(),0d);
    }

    @Test
    public void testHalfMatch() throws Exception {
        Neuron neuron = new Neuron();
        neuron.addConnection(new Connection(1d, 1d));
        neuron.addConnection(new Connection(0d, 1d));
        assertEquals(0.5d,neuron.getOutput(),0d);
    }

    @Test
    public void testFullMatch() throws Exception {
        Neuron neuron = new Neuron();
        neuron.addConnection(new Connection(1d, 1d));
        neuron.addConnection(new Connection(1d, 1d));
        assertEquals(1.0d,neuron.getOutput(),0d);
    }

    @Test
    public void testWithNegativeWeightsNoMatch() throws Exception {
        Neuron neuron = new Neuron();
        neuron.addConnection(new Connection(0d, -1d));
        neuron.addConnection(new Connection(0d, -1d));
        assertEquals(0d,neuron.getOutput(),0d);
    }

    @Test
    public void testWithNegativeWeightsHalfMatch() throws Exception {
        Neuron neuron = new Neuron();
        neuron.addConnection(new Connection(1d, -1d));
        neuron.addConnection(new Connection(0d, -1d));
        assertEquals(-0.5d,neuron.getOutput(),0d);
    }

    @Test
    public void testWithNegativeWeightsFullMatch() throws Exception {
        Neuron neuron = new Neuron();
        neuron.addConnection(new Connection(1d, -1d));
        neuron.addConnection(new Connection(1d, -1d));
        assertEquals(-1.0d,neuron.getOutput(),0d);
    }

    @Test
    public void testWithDifferentWeightsFullMatch() throws Exception {
        Neuron neuron = new Neuron();
        neuron.addConnection(new Connection(1d, -1d));
        neuron.addConnection(new Connection(1d, 1d));
        assertEquals(0.0d,neuron.getOutput(),0d);
    }
}