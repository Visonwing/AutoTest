package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }

    @Test
    public void testCase02(){
        System.out.println("这是测试用例2");
    }

    @BeforeMethod
    public void  beforeMethod(){
        System.out.println("BeforeMethod这是在测试方法之前运行的");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod这是在测试方法之后运行的");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass这是在类运行之前运行的方法");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterclass这是在类运行之后运行的方法");
    }

    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("BeforeSuite测试套件");
    }

    @AfterSuite
    public void AfterSuite(){
        System.out.println("AfterSuite测试套件");
    }
}