package designPattern.zomatoExample;

import designPattern.zomatoExample.client.User;
import designPattern.zomatoExample.managers.CartManager;
import designPattern.zomatoExample.managers.RestaurantManager;
import designPattern.zomatoExample.model.Cart;
import designPattern.zomatoExample.model.Item;
import designPattern.zomatoExample.model.Restaurant;
import designPattern.zomatoExample.model.UserInfo;
import designPattern.zomatoExample.service.Notification;
import designPattern.zomatoExample.service.Payment;
import designPattern.zomatoExample.service.serviceImpl.SMS;
import designPattern.zomatoExample.service.serviceImpl.UPI;

import java.math.BigDecimal;
import java.util.List;

public class TestZomato {

    public static void main(String[] args) {
        CartManager cartManager = new CartManager(new Cart());
        RestaurantManager restaurantManager = new RestaurantManager(getRestaurants());
        Payment upi = new UPI();
        Notification sms = new SMS();
        UserInfo userInfo = new UserInfo("Sid", 123245234L, 9845279832L, "abc@gmail.com", "Hubli");

        User user = new User(userInfo,cartManager, restaurantManager, sms, upi);

        user.searchRestaurant("Hubli");
        Restaurant swarnaResto = user.selectRestaurant("Swarna");
        user.addToCart(swarnaResto.getMenu().stream().filter(item-> item.getName().equals("Egg frid rice")).findAny().orElse(null));
        user.addToCart(swarnaResto.getMenu().stream().filter(item-> item.getName().equals("Lemon rice")).findAny().orElse(null));
        user.doCheckOut();
    }

    private static List<Restaurant> getRestaurants() {
        return List.of(
                Restaurant.builder().name("Udupi").menu(List.of(
                                Item.builder().name("Idli").price(BigDecimal.valueOf(40)).build(),
                                Item.builder().name("Dosa").price(BigDecimal.valueOf(70)).build()
                        ))
                        .location("Bangalore")
                        .build(),
                Restaurant.builder().name("Krishna").menu(List.of(
                                Item.builder().name("Upma").price(BigDecimal.valueOf(35)).build(),
                                Item.builder().name("Samosa").price(BigDecimal.valueOf(40)).build()
                        ))
                        .location("Bangalore")
                        .build(),
                Restaurant.builder().name("Sid").menu(List.of(
                                Item.builder().name("South meals").price(BigDecimal.valueOf(125)).build(),
                                Item.builder().name("North meals").price(BigDecimal.valueOf(90)).build()
                        ))
                        .location("Hubli")
                        .build(), Restaurant.builder().name("Swarna").menu(List.of(
                                Item.builder().name("Egg frid rice").price(BigDecimal.valueOf(80)).build(),
                                Item.builder().name("Lemon rice").price(BigDecimal.valueOf(70)).build()
                        ))
                        .location("Hubli")
                        .build()
                );
    }

}
