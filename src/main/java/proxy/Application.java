package proxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import proxy.domain.Image;
import proxy.domain.ProxyImage;
import proxy.domain.RealImage;
import proxy.view.ListUI;

public class Application {

  public static void main(String[] args) {
    List<Image> images = IntStream
        .range(0, 10)
        .mapToObj((i) -> new ProxyImage("title" + i, "image" + i))
        .collect(Collectors.toList());

    ListUI listUI = new ListUI(images);
    listUI.onScroll(0, images.size() - 1);
    listUI.onHover(5);
    listUI.onHover(9);
  }
}
