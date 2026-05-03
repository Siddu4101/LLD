package designPattern.zomatoExample.managers;

import designPattern.zomatoExample.model.Cart;
import designPattern.zomatoExample.model.Item;
import designPattern.zomatoExample.model.Restaurant;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Slf4j
public class CartManager {
    private final Cart cart;

    public CartManager(Cart cart) {
        this.cart = cart;
    }

    public void setRestaurantForTheCart(Restaurant restaurant){
        cart.setRestaurant(restaurant);
    }

    public void addItemToCart(Item item){
        if(cart.getItems() != null && cart.getItems().contains(item)) {
            log.warn("Item already present in cart");
        }
        else if(item != null && cart.getRestaurant().getMenu().contains(item)) {
            log.info("adding item {} to the cart", item.getName());
            cart.getItems().add(item);
            log.info("item added to the cart");
        }
        else {
            log.error("this item doesn't exist in this restaurant");
        }
    }

    public BigDecimal getTotalPrice(){
        Optional<BigDecimal> totalPrice = cart.getItems().stream().map(Item::getPrice).reduce(BigDecimal::add);
        log.info("total price of the cart items {}", totalPrice.orElse(BigDecimal.ZERO));
        return totalPrice.orElse(BigDecimal.ZERO);
    }

    public void clearTheCart(){
        log.info("clearing the cart...");
        cart.setItems(List.of());
    }

}
