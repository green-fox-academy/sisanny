package shop.webshop.models;

public class ShopItem {
    protected String name;
    protected String description;
    protected int price;
    protected int quantityOfStock;

    public ShopItem(String name, String description, int price, int quantityOfStock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityOfStock = quantityOfStock;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantityOfStock() {
        return quantityOfStock;
    }

    public String getDescription() {
        return description;
    }
}
