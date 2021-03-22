//>= has lower precedence than &&
class TestD3{
  public static void main(String[] args) {
      System.out.println(new Test().f());
  }

}

class Test{
  public int f() {
  int result;
  int count;
  int w;
  int x;
  int y;
  int z;

  w = 3;
  x = 3;
  y = 1;
  z = 1;

  result = 0;
  count = 1;

  if(x >= y && w >= z){
    result = result + count;
  }else{
    result = result - count;
  }
  return result;
  }
}
