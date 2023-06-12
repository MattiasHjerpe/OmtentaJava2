package org.example;

public class TrippelForLoop {

    //Trippelfoorloop
    public static void forLoopen() {
        for (int i = 1; i <= 2; i++){
            for (int j = 1; j <= 2; j++){
                for (int k = 1; k <= 2; k+=2){
                    System.out.print("*");
                    System.out.print("!");
                }
            }
            System.out.print("?");
        }
    }
}
