package com.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("123","sdf");
        map.get("123");

        Hashtable hashTable = new Hashtable();
        hashTable.put("123","123123");
        hashTable.get("123");
    }
}
