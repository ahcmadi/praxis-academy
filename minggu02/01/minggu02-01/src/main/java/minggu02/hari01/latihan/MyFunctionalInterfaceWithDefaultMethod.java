/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miggu01.hari01.latihan;

/**
 *
 * @author achmadi
 */
public interface MyFunctionalInterfaceWithDefaultMethod {
     public void run();

    public default void doIt() {
        System.out.println("doing it");
    }

    public static void doItStatically() {
        System.out.println("doing it statically");
    }
}
