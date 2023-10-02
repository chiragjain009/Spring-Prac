package com.spring.basics.springbasics.loose.coupling.prac.basic;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BinarySearch {
    private static Logger LOGGER= LoggerFactory.getLogger(BinarySearch.class);

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

    @PostConstruct
    public void postConstructor(){
        LOGGER.info("Post Constructor");
    }

    @PreDestroy
    public void preDestroy(){
        LOGGER.info("Pre Destroy");
    }

}
