/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se2;
public class LinearSearch{
    public static int linearSearch(int[] arr, int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String a[]){
        int[] a1= {50,20,30,50,70,90,50};
        int key = 50;
        System.out.println(key+" is found at index: "+linearSearch(a1, key));
    }
}