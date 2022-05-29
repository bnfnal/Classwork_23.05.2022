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
  
}

