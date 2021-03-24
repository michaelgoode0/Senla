package com.company;
import com.company.RandomGenerator;

public class Main {
    public static int maxNumeral(int number){
        int max=0;
        int i;
        do{
            i = number%10;
            if (max < i) {
                max=i;
            }
            number/=10;
        }while(number>0);
        return max;
    }
    public static int firstDigit(int number){
        do{
            number/=10;
        }while(number>9);
        return number;
    }
    public static int connectNumbers(int number1, int number2){
        String s=number1 + "" + number2;
        return Integer.parseInt(s);
    }
    public static int sumFirstDigits(int ...number){
        int sum=0;
        for(int i=0;i<number.length;i++){
            sum+=number[i];
        }
        return sum;
    }
    public static int sumOfTheDigits(int number){
        int sum=0;
        int digit;
        while(number>0){
            digit=number%10;
            sum+=digit;
            number/=10;
        }
        return sum;
    }



    public static void main(String[] args) {
        var generator=new RandomGenerator();
        int number=generator.randomInt();
        int number1=generator.randomInt();
        int number2=generator.randomInt();
        System.out.println("The First number: "+number+"; Highest numeral: "+maxNumeral(number)+";  Sum of Digits: " + sumOfTheDigits(number)+"\n"+
                "The Second number: " +number1 +"\n"+
                "The Third number: "+number2+ "\n"+
                "Sum of firstDigits of numbers: " + sumFirstDigits(firstDigit(number),firstDigit(number1),firstDigit(number2))+"\n"+
                "Difference of connectNumber and simple number " + connectNumbers(number,number1)+ " - "+ number2+ "= "+(connectNumbers(number,number1)-number2));
    }
}
