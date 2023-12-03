package ru.vsu.cs.manukovskij.demo.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.vsu.cs.manukovskij.demo.data.ShopItem;

import java.util.LinkedList;

class ShoppingListManagerTest {

    @Test
    void addItem() {
        IShoppingListManager shoppingList = new ShoppingListManager(new LinkedList<>());
        ShopItem item = new ShopItem(3, true, "message");
        shoppingList.addItem(item);
        Assertions.assertTrue(shoppingList.getItems().contains(item));
    }

    @Test
    void removeItem() {
        ShopItem item = new ShopItem(3, true, "message");
        IShoppingListManager shoppingList = new ShoppingListManager(new LinkedList<>());
        shoppingList.addItem(item);
        shoppingList.removeItem(item.getId());
        Assertions.assertFalse(shoppingList.getItems().contains(item));

    }

    @Test
    void checkedItem() {
        IShoppingListManager shoppingList = new ShoppingListManager(new LinkedList<>());
        ShopItem item = new ShopItem(3, true, "message");
        shoppingList.addItem(item);
        shoppingList.checkedItem(item);
        Assertions.assertFalse(shoppingList.getItems().getFirst().isChecked());

    }

    @Test
    void getItems() {
        IShoppingListManager shoppingList = new ShoppingListManager(new LinkedList<>());
        shoppingList.addItem(new ShopItem(3, true, "message"));
        shoppingList.addItem(new ShopItem(4, false, "message2"));
        Assertions.assertEquals(2, shoppingList.getItems().size());
    }
}