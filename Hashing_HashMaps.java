/*
        -> Internally a HashMap is an "Array of LinkedLists".

        -> Hashing refers to the process of generating a fixed-size output from an input of variable size
        using the mathematical formulas known as hash functions.
        This technique determines an index or location for the storage of an item in a data structure.
 */

package com.company.DataStructures;
import java.util.*;

public class Hashing_HashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

//               Key       Value
        map.put("India", 1300000000);
        map.put("China", 1800000000);
        map.put("Indonesia", 133000000);
        map.put("Shri lanka", 13000000);

        map.put("China", 2000000000); // Update the same key

        map.remove("Indonesia"); // Remove the element

//        System.out.println(map);

//======================================================================================================================
////  Printing the HashMap using loop

//        for(Map.Entry<String, Integer> e : map.entrySet()) {
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }

//======================================================================================================================
////  Value of the key

//        System.out.println(map.get("India"));
//        System.out.println(map.get("Indonesia"));

//======================================================================================================================
////  Check for some key value in your HashMaps

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the element you want to search for: ");
//        String a= sc.nextLine();
//
//        if(map.containsKey(a)){
//            System.out.println("HashMap contains this element.");
//        } else {
//            System.out.println("HashMap does not contain this element.");
//        }
//======================================================================================================================

    }
}
