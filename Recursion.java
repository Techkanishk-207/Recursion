import java.util.Scanner;
public class Recursion{
   static void Print(int num){
        if(num>20){
            return;
        }
        System.out.println(num);
        num++;
        Print(num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Print(x);
        sc.close();
    }
}