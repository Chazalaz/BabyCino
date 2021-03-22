//Return false when x = y
class TestD2{
  public static void main(String[] args) {
      System.out.println(new Test().f());
  }

}

class Test{
  public int f() {
  int result;
  int count;
  int x;
  int y;

  x = 2;
  y = 2;

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
