import java.util.ArrayList;

public class QuickSort implements Sort {
    @Override
    public void sort(ArrayList<Integer> nums) {
        System.out.println("Quick Sort : ");
        nums = qSort(nums, 0, nums.size()-1);
        print(nums);
    }

    // Code Adapted from https://www.geeksforgeeks.org/quick-sort/

    ArrayList<Integer> qSort(ArrayList<Integer> nums, int low, int high){
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(nums, low, high);

            // Recursively sort elements before
            // partition and after partition
            qSort(nums, low, pi-1);
            qSort(nums, pi+1, high);
        }
        return nums;
    }

    int partition(ArrayList<Integer> nums, int low, int high)
    {
        int pivot = nums.get(high);
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than the pivot
            if (nums.get(j) < pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = nums.get(i);
                nums.set(i, nums.get(j));
                nums.set(j, temp);
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = nums.get(i+1);
        nums.set(i+1, nums.get(high));
        nums.set(high, temp);

        return i+1;
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
