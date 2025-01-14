/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structures;

/**
 *
 * @author ngenii
 */
public class Bubble {
    public static void main(String[] args){
        
        int num[] = {6,5,2,8,9,4};
        int size = num.length;
        int temp;
        int steps = 0;
        
        for (int j =0; j<size; j++){
            for (int i = 0; i<size-1; i++){
                steps++;
                if (num[i] > num[i+1]){
                    temp = num[i];
                    num[i] = num[i+1];
                    num[i+1] = temp;
                   
                }
                System.out.println();
                
                for(int nu : num){
                    System.out.print(nu);
                }
                
            }
                
        }
        System.out.println("Steps are ; " + steps);
    }
}
