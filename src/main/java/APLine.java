public class APLine
{
  private int aNum,bNum,cNum;
  public APLine(int a, int b, int c){
    aNum =a;
    bNum = b;
    cNum = c;
  }
  public double getSlope(){
    return -(double)a/b;
  }
  public boolean isOnline(int x, int y){
    return aNum*x + bNum*y + cNum ==0;
  }
}
