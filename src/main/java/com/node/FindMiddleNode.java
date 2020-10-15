package com.node;

import java.util.HashMap;
import java.util.Map;

public class FindMiddleNode {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap();
        for (int i = 0; i < 5; i++) {
            map.put(i,i);
        }
        int index = map.size() / 2 + (map.size() % 2 == 0 ? 0 : 1);
        int index2 = map.size() / 2;
        System.out.println(index);
        System.out.println(index2);
        System.out.println(map.get(1));
        String[] ss = new String[100];
        ss[1]="1";
        int is = ss.length;
        System.out.println(is);

    }
}
