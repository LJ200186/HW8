/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

import java.util.*;

public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner Input = new Scanner(System.in);
        ArrayList<Integer> Numbers = new ArrayList<>();
        
        System.out.println("How many numbers would you like to sort?");
        int AmountOfNums = Input.nextInt();
        
        System.out.println("Alrighty, each number then click enter.");
        
        for (int i = 0; i < AmountOfNums; i++) {
            Numbers.add(Input.nextInt());
        }
        
        System.out.println("Sorting...");
        
        int Swaps = 1;
        
        while(Swaps != 0){
            Swaps = 0;

            for(int i = 0; i < (Numbers.size()-1); i++) {
                int CurrentNum = Numbers.get(i);
                int NextNum = Numbers.get(i+1);

                if(CurrentNum > NextNum){
                    
                    Swaps++;
                    Numbers.set(i, NextNum);
                    Numbers.set(i+1, CurrentNum);
 
                }
            }
                   
        }
        
        System.out.println(Numbers);
        
        System.out.println("Maximum: " + Numbers.get(Numbers.size()-1));
        System.out.println("Minimum: " + Numbers.get(0));
        
        int Average = getAverage(Numbers);
        System.out.println("Average: " + Average);
        
        
    }
    
    public static Integer getAverage(ArrayList Numbers){
        
        int Average = 0;
        int Total = 0;
        
        for (int i = 0; i < Numbers.size(); i++) {
            Total = Total + ((int) Numbers.get(i));
        }
        
        Average = Total / Numbers.size();
        
        return Average;
    }
    
}
