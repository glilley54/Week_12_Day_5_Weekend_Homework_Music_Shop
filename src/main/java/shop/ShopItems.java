package shop;
import instruments.Instrument;
import shop.Shop;

public class ShopItems implements ISell {

    private String description;
    private int buyPrice;
    private int sellPrice;

    public ShopItems(String description, int buyPrice, int sellPrice) {
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }

    @Override
    public int calculateMarkup() {
        int markup = (sellPrice - buyPrice);
        return markup;
    }
}
