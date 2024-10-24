package testclass;

import org.example.firstpage;
import org.jspecify.annotations.Nullable;
import org.testng.annotations.Test;

public class firsttest extends firstpage {
    @Test
    public void firsttest()

    {
       // initialization();
        String title = driver.getTitle();
        System.out.println(title);
        //teardown();
    }

    @Test
    public void Secondtest()

    {
       // initialization();
        String window = driver.getWindowHandle();
        System.out.println(window);
       // teardown();
    }
}
