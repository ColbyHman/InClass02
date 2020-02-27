import java.util.ArrayList;

public class BubbleSort implements Sort {

    @Override
    public void sort(ArrayList<Integer> nums) {
        System.out.println("Bubble Sort : ");

        // Code Adapted from https://www.geeksforgeeks.org/bubble-sort/
        int n = nums.size();
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (nums.get(j) > nums.get(j+1))
                {
                    // swap nums[j+1] and nums[i]
                    int temp = nums.get(j);
                    nums.set(j,nums.get(j+1));
                    nums.set(j+1,temp);
                }
        print(nums);
    }

    public void print(ArrayList<Integer> nums){
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i));
            if(i+1 != nums.size()){
                System.out.print(", ");
            }
        }

    }
}
