import java.util.*;
class p1{
    public static void print(int r){
        for(int i=1;i<=r;i++){
            for(int z=1;z<=i;z++)
            System.out.print(" ");
            for(int j=r;j>=i;j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void main(String ar[]){
        int row;
        System.out.print("Enter row no : ");
        Scanner sc=new Scanner(System.in);
        row=sc.nextInt();
        print(row);
        sc.close();
    }   
}