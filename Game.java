public class Game{
  public static void showGameTitle(){
        System.out.println(" Welcome to Adventure Quest!");
}
  public static void showGameRules(){
        System.out.println(" Rules:  "+
"\n1 Collect coins" +
"\n2 Avoid obstacles" +
"\n3 Reach the goal");
}
  public static void showGameLoadingScreen(){
          System.out.println(" Loading game... Please wait");
}
public static void main(String[]args){
showGameTitle();
showGameRules();
showGameLoadingScreen();
}
}