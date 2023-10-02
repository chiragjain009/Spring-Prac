package com.spring.basics.springbasics.stub.framework.testing.prac;

public class GetLargestVal {
    private DataService dataService;

    public GetLargestVal(DataService dataService){
        this.dataService=dataService;
    }

    public int get(){
        int[] nums=dataService.getData();
        int largest=Integer.MIN_VALUE;
        for(int i:nums){
            if(i>largest)largest=i;
        }
        return largest;
    }
}

