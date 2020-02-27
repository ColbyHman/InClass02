import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/numbers.txt"));
        ArrayList<Integer> nums = new ArrayList<>();
        while(scanner.hasNextInt()) {
            nums.add(scanner.nextInt());
        }

        Application applicationBubble = new Application(new BubbleSort());
        applicationBubble.sortNumbers(nums);

        System.out.println();

        Application applicationQuickSort = new Application(new QuickSort());
        applicationQuickSort.sortNumbers(nums);

        System.out.println();

        Application applicationRadixSort = new Application(new RadixSort());
        applicationRadixSort.sortNumbers(nums);



    }

}
