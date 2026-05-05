package designPattern.zomatoExample.managers;

import designPattern.zomatoExample.model.Restaurant;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
public class RestaurantManager {
    private final List<Restaurant> restaurants;

    public RestaurantManager(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    public List<Restaurant> searchByLocation(String location){
        log.info("searching restaurants for location {}", location);
        return restaurants.stream().filter(restaurant -> restaurant.getLocation().equals(location)).collect(Collectors.toList());
    }

    public Restaurant selectRestaurant(String restaurantName){
        log.info("user selected the restaurant {}", restaurantName);
        Optional<Restaurant> selectedRestaurant = restaurants.stream().filter(restaurant -> restaurant.getName().equals(restaurantName)).findFirst();
        return selectedRestaurant.orElseThrow(()->new UnsupportedOperationException("Please select the valid restaurant selected restaurant is not present..."));
    }

    /*addRestaurant , removeRestaurant etc...*/
}
