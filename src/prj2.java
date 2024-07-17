import java.util.Scanner;
public class prj2 {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

  System.out.println("Enter amount");
  int amount = sc.nextInt();

  int thousands = 0;
  int fivehundreds = 0;
  int hundreds = 0;
  int fifties = 0;
  int twentys = 0;
  int tens = 0;
  int fives = 0;

  if (amount >= 1000){
      thousands = amount / 1000;
      amount = amount % 1000;
      System.out.println("1000*"+thousands);
  }
  if (amount >= 500){
      fivehundreds = amount / 500;
      amount  = amount % 500;
      System.out.println("500*"+fivehundreds);
  }

  if (amount >= 100){
      hundreds = amount / 100;
      amount = amount%100;
      System.out.println("100*"+hundreds);
  }
   if (amount >= 50){
       fifties = amount /50;
       amount = amount%50;
       System.out.println("50*"+fifties);
   }
    if (amount >= 20){
        twentys = amount / 20;
        amount = amount%20;
        System.out.println("20*"+twentys);
    }
      if (amount >= 10){
          tens = amount / 10;
          amount = amount%10;
          System.out.println("10*"+tens);
      }
      if (amount >= 5){
          fives = amount / 5;
          amount = amount%5;
          System.out.println("5*"+fives);
      }
    }
}
