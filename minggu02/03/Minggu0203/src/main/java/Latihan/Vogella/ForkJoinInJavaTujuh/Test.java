/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan.Vogella.ForkJoinInJavaTujuh;

/**
 *
 * @author achmadi
 * @source https://www.vogella.com/tutorials/JavaConcurrency/article.html#concurrency
 */

import jsr166y.forkjoin.ForkJoinExecutor;
import jsr166y.forkjoin.ForkJoinPool;
import algorithm.Problem;
import algorithm.Solver;

public class Test {

    public static void main(String[] args) {
        Problem test = new Problem();
        // check the number of available processors
        int nThreads = Runtime.getRuntime().availableProcessors();
        System.out.println(nThreads);
        Solver mfj = new Solver(test.getList());
        ForkJoinExecutor pool = new ForkJoinPool(nThreads);
        pool.invoke(mfj);
        long result = mfj.getResult();
        System.out.println("Done. Result: " + result);
        long sum = 0;
        // check if the result was ok
        for (int i = 0; i < test.getList().length; i++) {
            sum += test.getList()[i];
        }
        System.out.println("Done. Result: " + sum);
    }
}