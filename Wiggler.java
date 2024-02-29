class Wiggler {

  private int x, y;
  
  Wiggler() {
    x = y = 150;
  }

  void wiggle() {
    x+=(int)(Math.random() * 5 - 2.5);
  }

  void setX (int x_) {
    x = x_;
  }

  int getX () {
    return x;
  }

  void setY (int y_) {
    y = y_;
  }

  int getY () {
    return y;
  }
}
