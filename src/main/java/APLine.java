public class APLine
{
  private int aNum,bNum,cNum;
  private int slope;
  public APLine(int a, int b, int c){
    aNum =a;
    bNum = b;
    cNum = c;
    slope = -(double)a/b;
  }
  public double getSlope(){
    return slope;
  }
  public boolean isOnline(int x, int y){
    if(((a*x)+(b*y)+c)==0){return true;}
    return false;
  }
}
