
package data.structures;

public class Arrays {
    
    public static void main(String[] args){
        int nums [] = {1,3,4,5,6,7,8,43,56,98};
        
        int target = 8;
        System.out.println(binarySearch(nums, target));
        
    }
    public static int linearSearch(int num [],int trget){
        
        for (int i = num.length-1; i>0; i--){
            if (num[i] == trget){
                return i;
            }
        }
        return -1;
    }
    
    public static int binarySearch(int num [],int trget){
        
        int start = 0;
        int last = num.length-1;
        
        while (start<=last){
            int mid = (last+start)/2;
            System.out.println(start  + " " + last  + " " + mid);
            if (num[mid] == trget){
                return mid;
            }else if( trget > num[mid]){
                start = mid + 1;
            }else if( trget < num[mid]){
                last = mid - 1;
            }
        }
        return -1;
    }
}
