package loose.coupling.prac;

import org.springframework.stereotype.Component;

@Component
public class QuickSort  implements Sorting{
    public int[] sort(int[] nums){
        System.out.println("Quick Sort is started");
        //implementation of sort
        return nums;
    }
}
