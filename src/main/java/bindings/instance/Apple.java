package bindings.instance;

import javax.inject.Inject;
import javax.inject.Named;

public class Apple {
  private final String color;
  private final Double price;

  @Inject
  public Apple(@Named("color") String color, @Named("price") Double price) {
    this.color = color;
    this.price = price;
  }

  public String getColor() {
    return this.color;
  }

  public Double getPrice() {
    return this.price;
  }

  @Override
  public String toString() {
    return "Apple [color=" + color + ", price=" + price + "]";
  }
}
