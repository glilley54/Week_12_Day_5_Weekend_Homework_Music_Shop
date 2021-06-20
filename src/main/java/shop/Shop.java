package shop;

import java.util.ArrayList;

public class Shop implements ISell{
    private ArrayList<ISell> stock;

    public ArrayList<ISell> getStock() {
        return stock;
    }


    public void addStock(stock) {
        this.stock.add(stock);
    }

    @Override
    public int calculateMarkup() {
        return 0;

    }
}

