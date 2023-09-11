// 9. Write a program in Java to demonstrate use of final class.
/*Author- Soumitra Das       Date-09/08/23*/

final class Finalclass {
    int a=9;

}
class sub extends Finalclass{
    a=10;
    public static void main(String ar[]){
    System.out.println(a);

  }
}