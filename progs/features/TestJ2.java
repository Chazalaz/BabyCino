//Instead of assigning x + y to x, assign y to x
class TestJ1{
  public static void main(String[] args) {
      System.out.println(new Test().f());
  }

}

class Test{
  public int f() {

  int x;
  int y;

  x = 2;
  y = 5;

  x += y;


  return y;
  }
}
