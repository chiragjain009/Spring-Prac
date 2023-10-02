package com.spring.basics.springbasics.loose.coupling.prac.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class BubbleSort implements Sorting {

    public int[] sort(int[] nums){
        System.out.println("Bubble sort is started");
        //implementation of sort
        return nums;
    }
}
