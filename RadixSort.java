import java.util.ArrayList;
import java.util.List;

public class RadixSort implements Sort {
    @Override
    public void sort(ArrayList<Integer> nums) {

        System.out.println("Radix Sort : ");

        boolean maxLen = false;
        int temp;
        int place = 1;
        int radixNum = 10;
        List<Integer>[] tempBucket = new ArrayList[radixNum];


        for (int i = 0; i < tempBucket.length; i++) {
            tempBucket[i] = new ArrayList<>();
        }

        while (!maxLen) {
            maxLen = true;

            for (Integer i : nums) {
                temp = i / place;
                tempBucket[temp % radixNum].add(i);

                if (maxLen && temp > 0) {
                    maxLen = false;
                }
            }

            int a = 0;
            for (int b = 0; b < radixNum; b++) {

                for (Integer i : tempBucket[b]) {
                    nums.set(a++,i);
                }
                tempBucket[b].clear();
            }
            place *= radixNum;
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
