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
public class ObjectWithNonPureFunction {
     private int value = 0;

    public int add(int nextValue) {
        this.value += nextValue;
        return this.value;
    }
}
