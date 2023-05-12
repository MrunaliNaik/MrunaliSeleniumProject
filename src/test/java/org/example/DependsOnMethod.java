package org.example;

import org.testng.annotations.Test;

public class DependsOnMethod {

    @Test(dependsOnMethods = {"testcase2"})
    public void testcase1() {

        System.out.println("In testcase1 ");

    }

    @Test
    public void testcase2() {

        System.out.println("In testcase2 ");
    }
}
