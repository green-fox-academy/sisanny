package shop.webshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import shop.webshop.models.ShopItems;

@Controller
public class ShopList {

    ShopItems items = new ShopItems();

    @GetMapping(path = "/shop")
    public String renderShop(Model model) {
        model.addAttribute("items", items.shopItems);
        return "Thymeleaf";
    }

    @GetMapping(path = "/only-available")
    public String getOnlyAvailableItems(Model model) {
        model.addAttribute("items", items.getAvailableItemList());
        return "Thymeleaf";
    }

}
