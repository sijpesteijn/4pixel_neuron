package nl.sijpesteijn.fourpixel_neuron;


public class FourPixelNeuron {

    public static void main(String[] args) {
        NeuronNetwork network = new NeuronNetwork();
        FourPixelImage image = getInput(args[0]);
        FourPixelImage output = network.findImage(image);
        System.out.println(output);
    }

    private static FourPixelImage getInput(String arg) {
        String[] pixels = arg.split(",");
        return new FourPixelImage(Double.valueOf(pixels[0]),Double.valueOf(pixels[1]),Double.valueOf(pixels[2]),Double.valueOf(pixels[3]));
    }
}
