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
public class InsertionSort {
    public static void main(String[] args){
        
        int nums [] = {3,6,2,1,5,0};
 
        for(int i = 1;i<nums.length;i++){
            int key = nums[i];
            int j = i-1;
            
            while(j>=0&&nums[j]>key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
        for(int num : nums){
            System.out.print(num + " ");
            
        } 
    }
    
}
