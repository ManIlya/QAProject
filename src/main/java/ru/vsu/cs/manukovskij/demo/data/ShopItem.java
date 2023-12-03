package ru.vsu.cs.manukovskij.demo.data;

import  com.fasterxml.jackson.annotation.JsonProperty;

public class ShopItem {
    @JsonProperty("id")
    private int id;
    @JsonProperty("checked")
    private boolean checked;
    @JsonProperty("message")
    private String message;


    public ShopItem(int id, boolean checked, String message) {
        this.id = id;
        this.checked = checked;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
