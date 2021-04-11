package proxy.domain;

public class ProxyImage implements Image {
  String title;
  String path;
  RealImage image;

  public ProxyImage(String title, String path) {
    this.title = title;
    this.path = path;
  }


  @Override
  public void showTitle() {
    System.out.println("(프록시)타이틀: " + title);
  }

  @Override
  public void draw() {
    if (image == null) {
      image = new RealImage(title, path);
    }
    image.draw();
  }
}
