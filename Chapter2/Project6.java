
public class Project6{
  public static int scale =5;
  public static void main (String[] args){
    needle();
    tophalf();
    lowhalf();
    needle();
    thick();
    tophalf();
  }
  public static void needle(){
    for (int i=1; i<=scale;i++){
      for (int j=1; j<=scale*3;j++){
        System.out.print(" ");
      }
      System.out.println("||");
    }
  }
  public static void tophalf(){
    for(int i=1; i<=scale;i++){
      for (int j=1; j<=(scale*3)-(3*i);j++){
          System.out.print(" ");
        }
        System.out.print("__/");
        for(int j=1;j<=3*(i-1);j++){
          System.out.print(":");
        }
        System.out.print("||");
        for(int j=1;j<=3*(i-1);j++){
          System.out.print(":");
        }
        System.out.println("\\__");
    }
    System.out.print("|");
    for(int i=1; i<=scale*6;i++){
      System.out.print("\"");
    }
    System.out.println("|");
  }
  public static void lowhalf() {
    for(int i=1; i<=scale;i++){
      for(int j=1; j<=2*(i-1);j++){
        System.out.print(" ");
      }
      System.out.print("\\_");
      for(int j=1; j<=(scale*3)+1-(2*i);j++){
        System.out.print("/\\");
      }
      System.out.println("_/");
    }
  }
  public static void thick(){
    for(int i=1;i<=scale*4;i++){
      for(int j=1;j<=(3*scale-3);j++){
        System.out.print(" ");
      }
      System.out.println("|%%||%%|");
    }
  }

  
}