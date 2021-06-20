package instruments;

public class Keyboard extends Instrument{

    private String size;

    public Keyboard(String colour, String type, String material, String manufacturer, String size) {
        super(colour, type, material, manufacturer);
        this.size= size;
    }

        public String getSize(){
        return size;
        }
    @Override
    public String makeSound() {
        return "I'm a Keyboard playing!";
    }
}

