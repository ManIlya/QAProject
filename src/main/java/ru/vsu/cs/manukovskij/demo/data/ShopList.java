package ru.vsu.cs.manukovskij.demo.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ShopList {
    @JsonProperty("ShopList")
    public List<ShopItem> data;

    public ShopList(List<ShopItem> data) {
        this.data = data;
    }
}
