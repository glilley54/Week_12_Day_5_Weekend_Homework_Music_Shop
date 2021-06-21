package shop;

import java.util.ArrayList;

public class Shop implements ISell{
    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList();
    }


    public ArrayList<ISell> getStock() {
        return stock;
    }


    public void addStock(ShopItems shopItems) {
        this.stock.add(shopItems);
    }

    @Override
    public int calculateMarkup() {
        return 0;

    }

    public int getStockCount() {
        return this.stock.size();

    }

    public void removeStock(ShopItems shopItems) {
        this.stock.remove(shopItems);

    }
}

