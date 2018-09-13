import java.util.Scanner;
public class BMI2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double weight;
        double height;
        double bmi;

        System.out.print("Enter your weight (kilogram) => ");
        weight = sc.nextDouble();

        System.out.print("Enter your height (meter) => ");
        height = sc.nextDouble();

        bmi = weight/(height*height);
        System.out.println("Your BMI is "+bmi);
		System.out.print("Status ");

        if (bmi < 18.5 ) 
			{System.out.println("Underweight : Under 18.5");}
        else if (bmi >= 18.5 && bmi < 25) 
			{System.out.println("Normal : 18.5-24.9");}
        else if (bmi >= 25 && bmi < 30) 
			{System.out.println("Overweight : 25-29.9");}
        else if (bmi >= 30) 
			{System.out.println("Obese : 30 or over");}
     }
    }