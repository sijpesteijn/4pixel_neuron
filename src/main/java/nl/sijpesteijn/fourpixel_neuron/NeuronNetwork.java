package nl.sijpesteijn.fourpixel_neuron;

public class NeuronNetwork {
    public EndNeuron findImage(FourPixelImage image) {

        Neuron l1_n1 = new Neuron();
        l1_n1.addConnection( new Connection(image.getPixel(0), 1d));
        l1_n1.addConnection( new Connection(image.getPixel(3), 1d));

        Neuron l1_n2 = new Neuron();
        l1_n2.addConnection( new Connection(image.getPixel(1), 1d));
        l1_n2.addConnection( new Connection(image.getPixel(2), 1d));

        Neuron l1_n3 = new Neuron();
        l1_n3.addConnection( new Connection(image.getPixel(0), 1d));
        l1_n3.addConnection(new Connection(image.getPixel(3), -1d));

        Neuron l1_n4 = new Neuron();
        l1_n4.addConnection( new Connection(image.getPixel(1), 1d));
        l1_n4.addConnection(new Connection(image.getPixel(2), -1d));


        Neuron l2_n1 = new Neuron();
        l2_n1.addConnection(new Connection(l1_n1.getOutput(), 1d));
        l2_n1.addConnection(new Connection(l1_n2.getOutput(), 1d));

        Neuron l2_n2 = new Neuron();
        l2_n2.addConnection(new Connection(l1_n1.getOutput(), -1d));
        l2_n2.addConnection(new Connection(l1_n2.getOutput(), 1d));

        Neuron l2_n3 = new Neuron();
        l2_n3.addConnection(new Connection(l1_n3.getOutput(), 1d));
        l2_n3.addConnection(new Connection(l1_n4.getOutput(), -1d));

        Neuron l2_n4 = new Neuron();
        l2_n4.addConnection(new Connection(l1_n3.getOutput(), -1d));
        l2_n4.addConnection(new Connection(l1_n4.getOutput(), -1d));

        EndNeuron l3_n1 = new EndNeuron("Solid white [1,1,1,1]");
        l3_n1.addConnection(new Connection(l2_n1.getOutput(), 1d));

        EndNeuron l3_n2 = new EndNeuron("Solid black [-1,-1,-1,-1]");
        l3_n2.addConnection(new Connection(l2_n1.getOutput(), -1d));

        EndNeuron l3_n3 = new EndNeuron("Vertical left [1,-1,-1,1]");
        l3_n3.addConnection(new Connection(l2_n2.getOutput(), -1d));

        EndNeuron l3_n4 = new EndNeuron("Vertical right [-1,1,1,-1]");
        l3_n4.addConnection(new Connection(l2_n2.getOutput(), 1d));

        EndNeuron l3_n5 = new EndNeuron("Forward slash [-1,1,-1,1]");
        l3_n5.addConnection(new Connection(l2_n3.getOutput(), -1d));

        EndNeuron l3_n6 = new EndNeuron("Backward slash [1,-1,1,-1]");
        l3_n6.addConnection(new Connection(l2_n3.getOutput(), 1d));

        EndNeuron l3_n7 = new EndNeuron("Horizontal bottom [-1,-1,1,1]");
        l3_n7.addConnection(new Connection(l2_n4.getOutput(), 1d));

        EndNeuron l3_n8 = new EndNeuron("Horizontal top [1,1,-1,-1]");
        l3_n8.addConnection(new Connection(l2_n4.getOutput(), -1d));

        EndNeuron highest = l3_n1;
        if (l3_n2.getOutput() > highest.getOutput()) {
            highest = l3_n2;
        }
        if (l3_n3.getOutput() > highest.getOutput()) {
            highest = l3_n3;
        }
        if (l3_n4.getOutput() > highest.getOutput()) {
            highest = l3_n4;
        }
        if (l3_n5.getOutput() > highest.getOutput()) {
            highest = l3_n5;
        }
        if (l3_n6.getOutput() > highest.getOutput()) {
            highest = l3_n6;
        }
        if (l3_n7.getOutput() > highest.getOutput()) {
            highest = l3_n7;
        }
        if (l3_n8.getOutput() > highest.getOutput()) {
            highest = l3_n8;
        }

        return highest;
    }
}
