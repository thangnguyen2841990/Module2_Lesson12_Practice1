package com.codegym;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Thắng", 32);
        hashMap.put("Cường", 21);
        hashMap.put("Thủy", 30);
        hashMap.put("Việt", 31);
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Tên sinh viên: " + entry.getKey() + ", Tuổi: " + entry.getValue());
        }
        System.out.println("Săp xếp theo thứ tự A-Z");
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("Tên sinh viên: " + entry.getKey() + ", tuổi: " + entry.getValue());
        }
        System.out.println("Truy xuất value theo key tương ứng");
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Thắng", 32);
        linkedHashMap.put("Cường", 21);
        linkedHashMap.put("Thủy", 30);
        linkedHashMap.put("Việt", 31);
        System.out.println("\nTuổi của sinh viên Thắng là:  " + linkedHashMap.get("Thắng"));

    }
}
