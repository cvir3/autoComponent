package org.practice.TestCases;

import org.practice.Functions.fun_iFrame;
import org.practice.Utilities.baseClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class tc04_iFrame extends  baseClass{

    @Test
    public void Test004_iFrame() throws InterruptedException, IOException{
        fun_iFrame iF = new fun_iFrame(webDriver);
        iF.iFramePage();
        iF.teraDown();
    }
}
