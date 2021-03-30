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
    public static void Task1(RandomGenerator generator) {
        int number = generator.randomInt();
        System.out.println("Task1"+ "\n"+ "Random number: "+number+"; Highest numeral: "+maxNumeral(number));
    }
    public static void Task2(RandomGenerator generator) {
        int number = generator.randomInt();
        int number1= generator.randomInt();
        int number2 = generator.randomInt();
        System.out.println("Task2"+"\n"+number+"\n"+number1+"\n"+number2+"\n"+"Sum of firstDigits of numbers: " + sumFirstDigits(firstDigit(number),firstDigit(number1),firstDigit(number2)));
    }
    public static void Task3(RandomGenerator generator) {
        int number = generator.randomInt();
        int number1= generator.randomInt();
        int number2 = generator.randomInt();
        int connected=connectNumbers(number,number1);
        System.out.println("Task3"+"\n"+number+"\n"+number1+"\n"+number2+"\n"+"ConnectedNumber: "+connected+" Difference: " +connected + " - "+ number2+ "="+ (connected-number2));
    }
    public static void Task4(RandomGenerator generator) {
        int number = generator.randomInt();
        System.out.println("Task4"+ "\n"+ "Random number: "+number+"; Sum of digits: "+sumOfTheDigits(number));
    }



    public static void main(String[] args) {
        var generator=new RandomGenerator();
        Task1(generator);
        Task2(generator);
        Task3(generator);
        Task4(generator);
    }
}
