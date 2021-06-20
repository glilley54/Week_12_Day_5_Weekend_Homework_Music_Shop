package instruments;

public class Guitar extends Instrument {

    private int noOfStrings;

    public Guitar(String colour, String type, String material, String manufacturer, int noOfStrings ) {
        super(colour, type, material, manufacturer);
        this.noOfStrings = noOfStrings;
    }

    public int getNoOfStrings() {
        return noOfStrings;
    }

    @Override
    public String makeSound() {
        return "I'm a guitar and I'm playing!";


    }
}
