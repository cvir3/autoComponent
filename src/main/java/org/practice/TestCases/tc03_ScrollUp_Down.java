package org.practice.TestCases;
import org.practice.Functions.fun_ScrollUp_Down;
import org.practice.Utilities.baseClass;
import org.testng.annotations.Test;
import java.io.IOException;

public class tc03_ScrollUp_Down extends baseClass {
    @Test
    public void Test003_ScrollPage() throws InterruptedException, IOException{
        fun_ScrollUp_Down scroll = new fun_ScrollUp_Down(webDriver);
        scroll.scrollUp_Down();
        scroll.teraDown();
    }
}
