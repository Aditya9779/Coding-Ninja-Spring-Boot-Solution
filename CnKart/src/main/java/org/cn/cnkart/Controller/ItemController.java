package org.cn.cnkart.Controller;

import org.cn.cnkart.Entity.Item;
import org.cn.cnkart.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    ItemService itemService;


    @GetMapping("/id/{id}")
    public Item getItemById(@PathVariable int id) {
        return itemService.getItem(id);
    }

    @PostMapping("/add")
    public void addItem(@RequestBody Item item) {
        itemService.addItemInDb(item);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteItem(@PathVariable int id) {
        itemService.deleteItemInDb(id);
    }

    @PutMapping("/id/{id}")
    public void updateItem(@PathVariable int id, @RequestBody Item item) {
        itemService.updateItemInDb(id, item);
    }
}
