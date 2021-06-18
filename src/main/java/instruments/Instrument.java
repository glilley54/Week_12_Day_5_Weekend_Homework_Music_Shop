package instruments;

public abstract class Instrument implements IPlay {

    private String colour;
    private String type;
    private String material;
    private String manufacturer;

    public Instrument(String colour, String type, String material, String manufacturer) {
        this.colour = colour;
        this.type = type;
        this.material = material;
        this.manufacturer = manufacturer;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
