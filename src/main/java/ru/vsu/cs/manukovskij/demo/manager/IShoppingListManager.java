package ru.vsu.cs.manukovskij.demo.manager;

import ru.vsu.cs.manukovskij.demo.data.ShopItem;

import java.util.List;

public interface IShoppingListManager {
    void addItem(ShopItem item);
    void removeItem(int id);
    void checkedItem(ShopItem item);

    List<ShopItem> getItems();

}
