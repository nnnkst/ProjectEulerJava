package ProjectEuler;

public class Euler002 {
    public static void Solution()
    {
        int a = 1;
        int b = 2;
        int c = a + b ;
        int sum = b;
        while(c < 4000000)
        {
            a = b;
            b = c;
            c = a + b;
            if(c%2 == 0) {
                sum += c;
            }
        }
//        return sum;
        System.out.print(sum);
    }
}
