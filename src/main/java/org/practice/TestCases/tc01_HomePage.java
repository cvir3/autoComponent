package org.practice.TestCases;

import org.practice.Utilities.baseClass;
import org.practice.Functions.fun_HomePage;
import org.testng.annotations.Test;


import java.io.IOException;

public class tc01_HomePage extends baseClass {

    @Test
    public void TestCase001_HomePage() throws InterruptedException, IOException
    {
        fun_HomePage fH = new fun_HomePage(webDriver);
        fH.homePage();
        fH.teraDown();
    }
}
