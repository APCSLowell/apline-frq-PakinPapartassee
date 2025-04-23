public class APLine
{
  private int aNum,bNum,cNum;
  private double slope;
  public APLine(int a, int b, int c){
    aNum =a;
    bNum = b;
    cNum = c;
    slope = -(double)aNum/bNum;
  }
  public double getSlope(){
    return slope;
  }
  public boolean isOnline(double x, double y){
    if(((aNum*x)+(bNum*y)+cNum)==0){return true;}
    return false;
  }
}
