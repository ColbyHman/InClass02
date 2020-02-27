import java.util.ArrayList;

public class Application {

    private Sort sort;
    private ArrayList<Integer> nums;

    public Application(Sort sort){
        this.sort = sort;
    }

    public void sortNumbers(ArrayList<Integer> nums){
        this.sort.sort(nums);
    }

}
