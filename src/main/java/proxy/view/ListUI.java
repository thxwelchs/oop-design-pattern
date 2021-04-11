package proxy.view;

import java.util.List;
import proxy.domain.Image;

public class ListUI {
  List<Image> images;

  public ListUI(List<Image> images) {
    this.images = images;
  }

  public void onScroll(int start, int end) {
    for(int i = start; i <= end; i++) {
      Image image = images.get(i);
      image.showTitle();
    }
  }

  public void onHover(int n) {
    if(n >= images.size() || n < 0) return;
    Image image = images.get(n);
    image.draw();
  }
}
