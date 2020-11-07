package shop.webshop.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShopItems {
    public ArrayList<ShopItem> shopItems;

    public ShopItems(ArrayList<ShopItem> shopItems) {
        this.shopItems = shopItems;
    }

    public ShopItems() {
        this.shopItems = new ArrayList<>();
        shopItems.add(new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000, 5));
        shopItems.add(new ShopItem("Printer", "Some HP printer that prints stuff", 300, 2));
        shopItems.add(new ShopItem("Coca Cola", "0.5l standard coke", 25, 0));
        shopItems.add(new ShopItem("Wokin", "Chicken with rice and WOKIN sauce", 119, 100));
        shopItems.add(new ShopItem("T-shirt", "Blue with corgi on bike", 300, 1));
    }

    public List<ShopItem> getAvailableItemList() {
        return shopItems.stream().filter(ShopItem -> ShopItem.getQuantityOfStock() > 0).collect(Collectors.toList());
    }
}
