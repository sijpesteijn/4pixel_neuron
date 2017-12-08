package nl.sijpesteijn.fourpixel_neuron;

import java.util.Arrays;

public class FourPixelImage {
    private Double[] pixels;

    public FourPixelImage(Double ...pixels) {
        this.pixels = pixels;
    }

    public Double getPixel(int i)
    {
        if (pixels.length > i)
            return pixels[i];
        return 0d;
    }

    @Override
    public String toString() {
        return "FourPixelImage{" +
                "pixels=" + Arrays.toString(pixels) +
                '}';
    }
}
