package org.practice.TestCases;

import org.practice.Functions.fun_PracticePage;
import org.practice.Utilities.baseClass;
import org.testng.annotations.Test;

import java.io.IOException;

public class tc02_PracticePage extends baseClass {

    @Test
    public void Test002_PracticePage() throws InterruptedException, IOException{
        fun_PracticePage fP = new fun_PracticePage(webDriver);
        fP.practicepage();
//        fP.RadioButton();
//        fP.CheckBox();
        fP.Dropdown();
//        fP.MultiSelect();
//        fP.Alert();
//        fP.teraDown();
    }
}
