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
public class Selection {
    public static void main(String[] args){
        int nums[] = {1,6,5,7,2,8,9,4};
        int size = nums.length;
        int minIndex = 0;
        int temp;
        
        for(int j=0; j<size; j++){
            minIndex = j;
            for(int i=j+1; i<size; i++){
                if(nums[i] < nums[minIndex]){
                    minIndex = i;
                }
            }
            
            temp = nums[j];
            nums[j] = nums[minIndex];
            nums[minIndex] = temp;
            System.out.println();
            
            for (int num : nums){
                System.out.print(num);
            }
            
        }
        
        System.out.println(minIndex);
        
        
        
    }
}
