import org.testng.annotations.*;

public class TestTest {

    @Test(invocationCount = 5)
    public void testTest(){
        System.out.println("Hello again!");
    }
}
