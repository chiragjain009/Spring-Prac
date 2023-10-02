package com.spring.basics.springbasics;
import com.spring.basics.springbasics.stub.framework.testing.prac.DataService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.spring.basics.springbasics.stub.framework.testing.prac.GetLargestVal;

import static org.junit.jupiter.api.Assertions.assertEquals;

//problem with stub its difficult with multiple data

//mockito framework have two option -stub ,mock
//this class practise with stub
@SpringBootTest
public class GetLargestValTestswithstub {
    @Test
    void test(){

        GetLargestVal getLargestVal=new GetLargestVal(new SampleDatastub());
        int res=getLargestVal.get();
        System.out.println(res);
        assertEquals(8,res);

    }
}
class SampleDatastub implements DataService {

    @Override
    public int[] getData() {
        return new int[] {1,2,8};
    }
}
