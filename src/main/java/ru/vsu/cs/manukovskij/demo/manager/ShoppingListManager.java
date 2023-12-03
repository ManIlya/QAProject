package ru.vsu.cs.manukovskij.demo.manager;

import ru.vsu.cs.manukovskij.demo.data.ShopItem;

import java.util.List;

public class ShoppingListManager implements IShoppingListManager {
    private final List<ShopItem> items;
    private int itemCounter;

    public ShoppingListManager(List<ShopItem> items) {
        this.items = items;
        itemCounter = selectMaxID()+1;
    }


    private int  selectMaxID(){
        int maxId = 0;
        for (ShopItem item : items){
            maxId = Math.max(maxId, item.getId());
        }
        return maxId;
    }

    @Override
    public void addItem(ShopItem item) {
        item.setId(itemCounter);
        items.addFirst(item);
        itemCounter++;
    }

    @Override
    public void removeItem(int id) {
        items.removeIf(item -> item.getId() == id );
        if(id == itemCounter-1){
            itemCounter--;
        }
    }

    @Override
    public void checkedItem(ShopItem item) {
        items.remove(item);
        item.setChecked(!item.isChecked());
        items.addFirst(item);
    }

    @Override
    public List<ShopItem> getItems() {
        return items;
    }
}


