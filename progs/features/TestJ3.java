//Do not modify x at all
class TestJ3{
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


  return x;
  }
}
