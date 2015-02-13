package za.ac.cput.Sb;

import org.junit.*;

public class AppTest {
    //execute before class

    //test case
    @Test
    public void test() {

        App app = new App();
        Assert.assertEquals(4, app.times());
    }

}
