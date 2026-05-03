package designPattern.zomatoExample.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class Restaurant {
    private String name;
    private List<Item> menu;
    private String location;

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", menu=" + menu +
                ", location='" + location + '\'' +
                '}';
    }
}
