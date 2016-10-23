package com.backend;

/**
 * Created by surverules on 10/15/2016.
 */
public class TortoiseAndHeir extends Thread {
    private int runtime = 0;
    public static boolean won = false;

    public void whoIsWon() {
//        boolean won = false;
        for (runtime = 0; runtime < 200; runtime = runtime + 5) {
            if (runtime == 100) {
                    won = true;
            }
            System.out.println(" At a distance: " + runtime + " Competitor " + currentThread().getName());
            if (won) {
                System.out.println(" Winner Name is: " + currentThread().getName());
                break;
            }
        }
    }


    @Override
    public void run() {
        whoIsWon();
    }
}
