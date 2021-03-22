//bug is allowing comparisons of booleans, should throw type errors
class TestD1{
  public static void main(String[] args) {
      System.out.println(new Test().f());
  }

}

class Test{
  public int f() {
  int result;
  int count;
  boolean x;
  boolean y;

  x = true;
  y = false;

  result = 0;
  count = 1;

  if(x >= y){
    result = result + count;
  }else{
    result = result - count;
  }
  return result;
  }
}
