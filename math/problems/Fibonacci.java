package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
 int n1 = 0,n2=1,n3,i,count=39;
 System.out.println(n1+" "+n2);
 for(i = 2; i < count; ++i)
 {
     n3 = n1 + n2;
     System.out.print("" + n3);
     n1 = n2;
     n2 = n3;
 }

    }
}
