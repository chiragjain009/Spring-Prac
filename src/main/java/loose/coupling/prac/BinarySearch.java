package loose.coupling.prac;

public class BinarySearch {
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
