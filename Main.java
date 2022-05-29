import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        // Task 1: Incrementer
        
        System.out.println("Task 1: Incrementer");
        System.out.println("Введите несколько цифр через пробел");
        Scanner sc1 = new Scanner(System.in);
        String[] as = sc.nextLine().split(" ");
        int a[] = new int[as.length];
        for (int i = 0; i < as.length; i++) {
            a[i] = Integer.parseInt(as[i]);
        }
        int b[] = new int[as.length];
        b = Incrementer.incrementer(a);
        System.out.println("Измененный массив цифр:");
        for (int i = 0; i < as.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        System.out.println();
        
        // Task 2: A Rule of Divisibility by 7
        
        System.out.println("Task 2: A Rule of Divisibility by 7");
        System.out.println("Введите натуральное число");
        long n = sc.nextLong();
        long[] c = DivSeven.seven(n);
        System.out.println("Последнее число m и количество шагов:");
        for (int i = 0; i < as.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
        System.out.println();
  
    }
    
    // Task 1: Incrementer
    
    public static class Incrementer 
    {
       public static int[] incrementer(int[] numbers) 
        {
           if (numbers.length == 0) return numbers;
           for(int i = 0; i < numbers.length; i++) 
           {
             numbers[i] = (numbers[i] + i + 1) % 10;
           }
           return numbers;
       }
    }
    
    // Task 2: A Rule of Divisibility by 7
    
    public static class DivSeven 
    {
        public static long[] seven(long m) 
        {
            long[] res = new long[2];
            long i = 0;
            while(m > 99)
            {
                m = (m/10) - 2*(m%10);
                i += 1;
            }
            res[0] = m;
            res[1] = i;
            return res;
        }
    }

}
