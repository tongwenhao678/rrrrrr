package com.test.tongwenhao;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.testng.annotations.*;
import org.w3c.dom.ls.LSOutput;

public class TwgTest1 {
    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testcase1(){
        System.out.println("这是测试用例一");
    }
    @Test
    public void testcase2(){
        System.out.println("这是测试用例二");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod这是在方法之前运行的");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod这是在方法之后执行的");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass这是在类之前运行的方法");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("afterClass这是在类之后运行的方法");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before测试套件");
    }
    @AfterTest
    public void afterSuite(){
        System.out.println("after测试套件");
    }
}
