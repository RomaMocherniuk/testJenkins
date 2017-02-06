import org.junit.Assert;
import org.junit.Test;

/**
 * Created by rmochetc on 06.02.2017.
 */
public class HelloWorldTest {

    private HelloWorld helloWorld = new HelloWorld();
    @Test
    public void test1() throws Exception {
        Assert.assertTrue("Hello Jenkins".equals(helloWorld.test()));
    }

}