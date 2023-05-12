package org.example;

import org.testng.annotations.Test;

public class groups {



        @Test(groups = {"Sanity"})
        public void testcase1() {

            System.out.println("testcase1 ");

        }

        @Test(groups = {"Sanity"})
        public void testcase2() {

            System.out.println("testcase2 ");

        }

        @Test(groups = {"Sanity"})
        public void testcase3() {

            System.out.println("testcase3 ");

        }

        @Test(groups = {"Regression"})
        public void testcase4() {

            System.out.println("testcase4 ");

        }

        @Test(groups = {"Regression"})
        public void testcase5() {

            System.out.println("testcase5");

        }

        @Test(groups = {"Regression"})
        public void testcase6() {

            System.out.println("testcase6");

        }

    }

