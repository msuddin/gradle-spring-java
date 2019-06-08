import bean.HelloWorld;
import config.HelloWorldConfiguration;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.hamcrest.CoreMatchers.is;

public class HelloWorldTest {

    private ApplicationContext context;

    @Before
    public void setUp() {
        context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
    }

    @Test
    public void shouldGetCorrectHelloWorldMessage() {
        // Given
        final String testMessage = "This is a test";

        // When
        HelloWorld helloWorld = context.getBean(HelloWorld.class);
        helloWorld.setMessage(testMessage);

        // Then
        Assert.assertThat(helloWorld.getMessage(), is(testMessage));
    }
}
