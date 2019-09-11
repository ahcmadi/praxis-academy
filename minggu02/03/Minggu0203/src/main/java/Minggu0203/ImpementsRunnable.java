/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu0203;

/**
 *
 * @author achmadi
 * @source https://www.vogella.com/tutorials/JavaConcurrency/article.html#concurrency
 */
public class ImpementsRunnable implements Runnable{
    private final long countUntil;

    ImpementsRunnable(long countUntil) {
        this.countUntil = countUntil;
    }

    @Override
    public  void run() {
        long sum = 0;
        for (long i = 1; i < countUntil; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
     public static void main(String[] args) {
        // TODO code application logic here
        long c =10;
        ImpementsRunnable newImplementsRunnable = new ImpementsRunnable(c);
        newImplementsRunnable.run();
         System.out.println("test me");
    }
}
