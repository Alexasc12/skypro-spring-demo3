package pro.sky.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.model.Item;

import java.util.ArrayList;
import java.util.Collection;

@Component
@SessionScope
public class Basket {

private final Collection<Item> items;

    public Basket() {
        this.items = new ArrayList<>();
    }
    public void add(Collection<Item> items) {
        this.items.addAll(items);
    }

    public Collection<Item> get() {
        return items;
    }


}
