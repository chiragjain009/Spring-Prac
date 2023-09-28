package loose.coupling.prac.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {


    // basically if u have mutiple implements in interface and u autowired that so u have to tell which they should take
    // option 1 @primary in any one implements
    //option 2 @Qualifier("{ANY_NAME}") in any one implements and autowired position
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
