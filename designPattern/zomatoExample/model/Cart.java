package designPattern.zomatoExample.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Cart {
    private Restaurant restaurant;
    private List<Item> items = new ArrayList<>();
}
