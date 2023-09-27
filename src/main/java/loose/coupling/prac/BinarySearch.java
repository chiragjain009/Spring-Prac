package loose.coupling.prac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {

    @Autowired
    private Sorting sorting;
    public BinarySearch(Sorting sorting) {
        this.sorting=sorting;
    }

    public int search(int[] nums, int num){
        System.out.println("searching start");
        //sorting
        sorting.sort(nums);
        //implentation for searching

        return 0;//dummy output
    }
}
