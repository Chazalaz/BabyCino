//Allow y to be a boolean expression
class TestJ1{
  public static void main(String[] args) {
      System.out.println(new Test().f());
  }

}

class Test{
  public int f() {

  int x;
  boolean y;

  x = 2;
  y = false;

  x += y;


  return x;
  }
}
