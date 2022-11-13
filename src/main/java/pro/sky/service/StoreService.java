package pro.sky.service;

import org.springframework.stereotype.Service;
import pro.sky.component.Basket;
import pro.sky.model.Item;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@Service
public class StoreService {

    private final Basket basket;
    private Map<Integer,Item> items;


    public StoreService(Basket basket, Map<Integer, Item> item) {
        this. basket = basket;
        this.items = item;
    }
@PostConstruct
public  void init() {
        items = Map.of(
                1, new Item(1,"Смартфон",20000),
                2, new Item(2,"Ноутбук",70000),
                3, new Item(3,"Принтер",18000)
        );
}


public void add(List<Integer> ids) {




}
public Collection<Item> get() {
    return null;
}
}
