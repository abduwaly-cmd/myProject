package com.myProject.Items;

public class Item {
    private String name;
    Item(String name) { this.name = name; }
    public String getName() { return name; }

    @Override
    public String toString() { return name; }
}
