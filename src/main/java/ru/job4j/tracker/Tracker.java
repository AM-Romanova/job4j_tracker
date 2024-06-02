package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] result = new Item[100];
        int size = 0;
        for (int index = 0; index < result.length; index++) {
            Item name = result[index];
            if (name != null) {
                result[size] = name;
                size++;
            }
        }
        result = Arrays.copyOf(result, size);
        for (int index = 0; index < result.length; index++) {

        }
        return result;
    }

    public Item[] findByName(String key) {
        int size = 0;
        Item[] result = new Item[100];
        for (int index = 0; index < items.length; index++) {
            Item item = items[index];
            if (item.getName().equals(key)) {
                result = items;
            }
        }
        return result;
    }

    public Item findById(int id) {
        Item result = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                result = item;
                break;
            }
        }
        return result;
    }
}