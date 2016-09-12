package bindings.instance;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class FruitModule extends AbstractModule {
  @Override
  protected void configure() {
    bind(String.class).annotatedWith(Names.named("color")).toInstance("red");
    bind(Double.class).annotatedWith(Names.named("price")).toInstance(10.1);
  }

}
