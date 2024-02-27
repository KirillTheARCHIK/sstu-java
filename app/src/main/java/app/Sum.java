package app;

import java.util.ArrayList;
import java.util.List;

import app.utils.Utils;

public class Sum {
    public static void main(String[] args) {
        Utils.clearConsole();
        System.out.println("\n----------------------------PROGRAM STARTED-----------------------------\n");
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.toString());
        System.out.println("\n----------------------------PROGRAM FINISHED----------------------------\n");
    }
}