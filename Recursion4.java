import java.util.Scanner;

public class Recursion4 {
    // Method-1 to swap an array by taking double parameter
    static int[] arr = { 1, 2, 3, 4, 5 };

    static void Print(int l, int r) {
        if (l >= r) {
            return;
        }
        // for swap
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        Print(l + 1, r - 1);
    }

    // Method-2 to swap an array by taking single parameter
    static int[] arr2 = { 1, 2, 3, 4, 6 };
    static int n = arr2.length;

    static void Print(int l) {
        if (l >= n / 2) {
            return;
        }
        // for swap
        int tem = arr2[l];
        arr2[l] = arr2[n - l - 1];
        arr2[n - l - 1] = tem;
        Print(l + 1);
    }
    
    // To check given String is Palindrome
    static String st = "madam";
    static boolean Printbool(int i,int l){
    if(i>=l/2){
    return true;
    }
    if(st.charAt(i)!=st.charAt(l-i-1)){
    return false;
    }
    return Printbool(i+1,l);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // By using simple java method
        int [] arr = {1,2,3,4,5};
        int N = arr.length;
        int l = Math.floorDiv(N,2);
        int tem;
        for(int i=0;i<l;i++){
        tem = arr[i];
        arr[i]=arr[N-i-1];
        arr[N-i-1] = tem;
        }
        for(int element: arr){
        System.out.print(element + " ");
        }
        System.out.println();
        
        // Method-1
        int r = arr.length;
        Print(0, r - 1);
        for (int i = 0; i < r; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        // Method-2
        Print(0);
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        
        //  To check given String is Palindrome
        int k = st.length();
        System.out.println(Printbool(0,k));
        sc.close();
    }
}