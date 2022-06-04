package com.ramesh.dockspringboot.javapack;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SplitJava {

    public static void main(String[] args) {

        String str = "Hello Ramesh Pongiannan How are you, Welcome Ramesh Pongiannan";

        if(!str.isEmpty()){
            String[] strSplit = str.split("\\s");
            Set<String> setStr = new HashSet<String>(Arrays.asList(strSplit));
            System.out.println(setStr.toString());
            int countStr = 0;
            for(String strSp : setStr){
                countStr++;
            }
            System.out.println("Total count String "+countStr);
        }
    }
}
