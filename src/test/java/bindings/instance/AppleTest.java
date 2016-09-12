package bindings.instance;

import static org.junit.Assert.assertEquals;

import com.google.inject.Guice;

import org.junit.Test;

public class AppleTest {

  @Test
  public void test() {
    Apple apple = Guice.createInjector(new FruitModule()).getInstance(Apple.class);
    assertEquals("Check color", "red", apple.getColor());
    assertEquals("Check price", new Double(10.1), apple.getPrice());
    System.out.println(apple);
  }

}
