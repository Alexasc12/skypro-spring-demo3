package pro.sky.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Collections;

@RestController
@RequestMapping("/order")
public class StoreController {


    @GetMapping("/add")
    public void add(@RequestParam("id") List<Integer> ids) {

    }
    @GetMapping("/get")
    public Collection<Item> get() {

    }
}
