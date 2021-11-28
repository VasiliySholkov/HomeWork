package Povideo.Sortirovka;

import java.util.Arrays;

public class SortirovkaArrayInteger {

    public static void main (String[] args){
        Integer[]array = new Integer[] {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
