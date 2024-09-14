package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import main.SimHash;

class ShortStringExceptionTest {

	@Test
    public void shortStringExceptionTest(){
        //测试str.length()<200的情况
        System.out.println(SimHash.getSimHash("计科和软件工程"));
    }

}
