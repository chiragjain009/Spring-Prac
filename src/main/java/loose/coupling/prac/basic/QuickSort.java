package loose.coupling.prac.basic;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class QuickSort  implements Sorting{
    public int[] sort(int[] nums){
        System.out.println("Quick Sort is started");
        //implementation of sort
        return nums;
    }
}
