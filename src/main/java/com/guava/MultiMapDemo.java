package com.guava;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import org.apache.commons.lang3.StringUtils;

import java.util.Collection;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkState;

public class MultiMapDemo {
    public static void main(String[] args) {
        Multimap<String, Integer> customersByType = ArrayListMultimap.create();
        customersByType.put("abc", 11);
        customersByType.put("abc", 12);
        customersByType.put("abc", 13);
        customersByType.put("abcd", 14);

        Collection<Integer> abc = customersByType.get("abc");

        for(Integer intValue: abc)
        {
            System.out.println(intValue);
        }

        checkArgument(StringUtils.isBlank("1"),"sf");
        checkState(true,"sdfsdf");
    }
}
