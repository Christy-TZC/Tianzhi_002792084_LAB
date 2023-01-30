/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoubleValues;

import java.util.List;
import java.util.Arrays;

/**
 *
 * @author tianzhichen
 */
public class DoubleValues {
    
    private List<Integer> array;
    
    public DoubleValues(List<Integer> array) {
        this.array = array;
    }
    
    public void setValues() {
        for (int i = 0; i < this.array.size(); i++) {
            if (i % 2 == 0) {
                this.array.set(i, this.array.get(i)*2);
            } else {
                this.array.set(i, this.array.get(i)*3);
            }
        }
    }
    
    public List<Integer> getArray() {
        return this.array;
    }    
    
    public static void main(String[] args) {
        List<Integer> test = Arrays.asList(1,2,3,4,5);
        DoubleValues dv = new DoubleValues(test);
        dv.setValues();
        System.out.println(dv.getArray());
    }
    
}
