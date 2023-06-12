package org.example;

public class TestaArray {

    public static void start() {
        int[] arr = {1, 2, 3};

        //Skickar in värden från arrayen och kollar om det går att ändra på dem
        testaArray(arr[0], arr[1], arr[2]);
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);

        //Skickar in hela arrayen och kollar om det går att ändra på den
        testaArray(arr);
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
    }

    private static void testaArray(int x, int y, int z) {
        int temp = x;
        x = y;
        y = temp;
    }

    private static void testaArray(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}
