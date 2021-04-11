package proxy.domain;

public class RealImage implements Image {
  String title;
  String path;

  @Override
  public void showTitle() {

  }

  public RealImage(String title, String path) {
    this.title = title;
    this.path = path;
  }

  @Override
  public void draw() {
    System.out.print("(리얼)");
    System.out.println(path + "이미지 표시");
  }
}
