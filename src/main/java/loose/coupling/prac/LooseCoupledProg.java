package loose.coupling.prac;

public class LooseCoupledProg {
    //what are the beans?
    //dependecncies of bean
    //where to serach for bean
    public static void main(String[] args) {
        BinarySearch binarySearch=new BinarySearch(new QuickSort());
        int result=binarySearch.search(new int[]{1,2,3},3);

        System.out.println(result);

    }
}
