
/**
 * Write a description of class a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class a
{
    public static void main(String args[]){
    
    
    }
    public boolean oddColSum(int[][] nums,int col){
        int sum =0;
        for(int[] row: nums){
            sum+=row[col];
        }
        if(sum%2==0){
        return false;
        }
        return true;
    }
    public boolean evenRow(int[][] mat, int row){
        for(int num: mat[row]){
         if (num%2==1){
            return false;
            }
        }
        return true;
    }
    public int[] minRow(int[][] nums){
        int min=nums[0][0];
        int minIndex=0;
        for(int i=0; i<nums.length; i++){
            for(int target:nums[i]){
                if(target<min){
                    min=target;
                    minIndex=i;
                }
            }
        }
        return nums[minIndex];
    }
}
