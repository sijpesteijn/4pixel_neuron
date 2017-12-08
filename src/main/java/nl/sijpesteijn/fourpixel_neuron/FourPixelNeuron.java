package nl.sijpesteijn.fourpixel_neuron;


public class FourPixelNeuron {

    public static void main(String[] args) {
        NeuronNetwork network = new NeuronNetwork();
        FourPixelImage image = getInput(args[0]);
        EndNeuron output = network.findImage(image);
        System.out.println("Highest neuron: " + output.getName());
    }

    private static FourPixelImage getInput(String arg) {
        System.out.println("Input: " + arg);
        String[] pixels = arg.split(",");
        return new FourPixelImage(Double.valueOf(pixels[0]),Double.valueOf(pixels[1]),Double.valueOf(pixels[2]),Double.valueOf(pixels[3]));
    }
}
