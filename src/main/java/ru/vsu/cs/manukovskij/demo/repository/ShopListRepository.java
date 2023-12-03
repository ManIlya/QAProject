package ru.vsu.cs.manukovskij.demo.repository;

import ru.vsu.cs.manukovskij.demo.data.ShopList;
import ru.vsu.cs.manukovskij.demo.sevice.JsonService;

import java.io.IOException;
public class ShopListRepository implements IRepository<ShopList>{
    private final JsonService service;
    public ShopListRepository(JsonService service) {
        this.service = service;
    }

    @Override
    public ShopList load(String path) {
        ShopList shopList = null;
        try {
            shopList = service.loadDataFromFile(ShopList.class, path);
        } catch (IOException e) {
            System.err.println("Error loading data from file: " + e.getMessage());
        }
        return shopList;
    }

    @Override
    public void save(String path, ShopList object){
        try {
            service.saveDataToFile(object, path);
        } catch (IOException e) {
            System.err.println("Error save data in file: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
