import java.util.*;

public class Example4
{
    public static void main(String[] args)
    {
       double                 leftOperand, result, rightOperand;
       String                 leftString, operator, rightString;
       String                 input;
       StringTokenizer        tokenizer, expressionTokenizer;
       Scanner in = new Scanner(System.in);

       input = in.nextLine();
       expressionTokenizer = new StringTokenizer(input, " ", false);

       while (expressionTokenizer.hasMoreTokens())
       {
          String expression = expressionTokenizer.nextToken();
          tokenizer = new StringTokenizer(expression, "+-*/", true);

          try
          {
             leftString   = tokenizer.nextToken();
             operator     = tokenizer.nextToken();
             rightString  = tokenizer.nextToken();

             try
             {
                leftOperand  = Double.parseDouble(leftString);
             }
             catch (NumberFormatException nfe)
             {
                System.out.println("Left operand '" + leftString + "' is not a number");
                continue;
             }

             try
             {
                rightOperand = Double.parseDouble(rightString);
             }
             catch (NumberFormatException nfe)
             {
                System.out.println("Right operand '" + rightString + "' is not a number");
                continue;
             }

             if (operator.equals("+"))
                result = leftOperand + rightOperand;
             else if (operator.equals("-"))
                result = leftOperand - rightOperand;
             else if (operator.equals("*"))
                result = leftOperand * rightOperand;
             else if (operator.equals("/"))
             {
                if (rightOperand == 0.0)
                {
                   System.out.println("Cannot divide by 0");
                   continue;
                }
                result = leftOperand / rightOperand;
             }
             else
                result = 0.0;

             System.out.println(expression + " = " + result);
          }
          catch (NoSuchElementException nsee)
          {
             System.out.println("Invalid syntax for expression: " + expression);
          }
       }
    }
}
