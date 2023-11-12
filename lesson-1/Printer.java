/**
 * Простой арифметический счетчик, который при делении не учитывает остаток от целых делитей
 */
class Calculator
{
  public int calculate(char op, int a, int b)
  {
    int result = 0;

    switch (op) 
    {
      case '+':
        result = a+b;
        break;
      
      case '-':
        result = a-b;
        break;

      case '*':
        result = a*b;
        break;

      case '/':
        result = a/b;
        break;

      default:
        break;
    }

    return result;
  }
}

public class Printer
{ 
  public static void main(String[] args) 
  { 
    int a = 0;
    char op = ' ';
    int b = 0;

    if (args.length == 0)
    {
      a = 3;
      op = '/';
      b = 7;
    } 
    
    else 
    {
      a = Integer.parseInt(args[0]);
      op = args[1].charAt(0);
      b = Integer.parseInt(args[2]);
    }

    Calculator calculator = new Calculator();
    int result = calculator.calculate(op, a, b);
    System.out.println(result);
  }
}