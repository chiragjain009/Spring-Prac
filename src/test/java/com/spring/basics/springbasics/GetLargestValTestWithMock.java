package com.spring.basics.springbasics;
import com.spring.basics.springbasics.stub.framework.testing.prac.DataService;
import com.spring.basics.springbasics.stub.framework.testing.prac.GetLargestVal;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.OngoingStubbing;

import javax.xml.crypto.Data;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

//mockito framework have two option -stub ,mock
//this class practise with mock
@ExtendWith(MockitoExtension.class)
public class GetLargestValTestWithMock {
    //one way to use mock without annotation
    @Test
    void test(){
        DataService service=mock(DataService.class);
        when(service.getData()).thenReturn(new int[] {1,2,78});
        GetLargestVal getLargestVal=new GetLargestVal(service);
        int res=getLargestVal.get();
        System.out.println(res);
        assertEquals(78,res);

    }

    //one way to use mock with annotation
    @Mock
    private DataService service;
    @InjectMocks
    private GetLargestVal getLargestVal;

    @Test
    void test1(){
        when(service.getData()).thenReturn(new int[] {1,2,78});
        int res=getLargestVal.get();
        System.out.println(res);
        assertEquals(78,res);

    }

    //u can play with list also
    @Test
    void test3(){
        List listMock=mock(List.class);
        when(listMock.size()).thenReturn(5);
        assertEquals(5,listMock.size());

    }

}
