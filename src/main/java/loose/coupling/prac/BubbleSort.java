package loose.coupling.prac;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSort implements Sorting {

    public int[] sort(int[] nums){
        System.out.println("Bubble sort is started");
        //implementation of sort
        return nums;
    }
}
