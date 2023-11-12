/**
 * Класс выведет на экран все простые числа в промежутке от 1 до 1000, каждое на новой строке
 */
class Answer 
{
  public void printPrimeNums() 
  {
    for(int i = 2; i <= 1000; i++) 
    {
        boolean isPrime = true;

        for(int j = 2; j <= Math.sqrt(i); j++) 
        {
            if (i % j == 0) 
            {
                isPrime = false;
                break;
            }
        }

        if (isPrime) 
        {
            System.out.println(i);
        }
    }
  }
}

public class Printer { 
  public static void main(String[] args) 
  { 
    Answer ans = new Answer();      
    ans.printPrimeNums();
  }
}