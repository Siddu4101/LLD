package designPattern.zomatoExample.client;

import designPattern.zomatoExample.managers.CartManager;
import designPattern.zomatoExample.managers.RestaurantManager;
import designPattern.zomatoExample.model.Item;
import designPattern.zomatoExample.model.Restaurant;
import designPattern.zomatoExample.model.UserInfo;
import designPattern.zomatoExample.service.Notification;
import designPattern.zomatoExample.service.Payment;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Getter
@Setter
@Slf4j
public class User {
    private final UserInfo userInfo;
    private final CartManager cartManager;
    private final RestaurantManager restaurantManager;
    private final Notification notification;
    private final Payment payment;

    public User(UserInfo userInfo, CartManager cartManager, RestaurantManager restaurantManager, Notification notification, Payment payment) {
        this.userInfo = userInfo;
        this.cartManager = cartManager;
        this.restaurantManager = restaurantManager;
        this.notification = notification;
        this.payment = payment;
    }

    public void searchRestaurant(String customLocation){
        String restaurantLocation =  !customLocation.isEmpty() ? customLocation : userInfo.getLocation();
        List<Restaurant> restaurants = restaurantManager.searchByLocation(restaurantLocation);
        log.info("==============Available restaurants at location {}=============",userInfo.getLocation());
        restaurants.forEach(System.out::println);
    }

    public Restaurant selectRestaurant(String restaurantName){
        Restaurant restaurant = restaurantManager.selectRestaurant(restaurantName);
        cartManager.setRestaurantForTheCart(restaurant);
        return restaurant;
    }

    public void addToCart(Item item){
       cartManager.addItemToCart(item);
    }

    public void doCheckOut(){
        payment.pay(this, cartManager.getTotalPrice());
        cartManager.clearTheCart();
    }
}
