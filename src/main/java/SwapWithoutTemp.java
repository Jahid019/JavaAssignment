//2. Suppose, a=10 and b=20. Now swap the value without a temp variable. Output: a=20, b=10
public class SwapWithoutTemp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int x = a+b;
        a= a+b;  //30
        b= a-b;  //10
        a= a-b;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
