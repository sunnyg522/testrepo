package regression;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;
import utils.TestProps;

@ContextConfiguration(locations = {"classpath:/automation-context.xml"})
public class PropsTest extends AbstractTestNGSpringContextTests {

    @Autowired
    TestProps testProps;

    @Test
    public void t(){
        System.out.println(testProps.url);
    }
}
