package ItCity;
import java.util.Scanner;
        
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Birinci ededi daxil edin: ");
        double a=sc.nextDouble();
        System.out.println("Ikinci ededi daxil edin: ");
        double b=sc.nextDouble();
        System.out.println("Yerine yetirmek istediyiniz emeliyyati secin: ");
        String c=sc.next();
        double result=0;
        switch(c){
            case "+":
                result=a+b;
                break;
            case "-":
                result=a-b;
                break;
            case "*":
                result=a*b;
                break;
            case "/":
                if(b!=0){
                    result=a/b;
                    break;
                }
                else{
                    System.out.println("0-a bolmek olmaz!");
                    break;
                }
            case "$":
                result=a*a+b*b;
                break;
            case "#":
                result=Math.sqrt(a)+Math.sqrt(b);
                break;
            case "^":
                double x=1;
                for(int i=0; i<b;i++){
                    x=x*a;
                }
                result=x;
                break;
            case "sin":
                result=Math.sin(a)+Math.cos(b);
                break;
            default:
                System.out.println("Emeliyyat duzgun secilmemisdir!");
        }    
        System.out.println(result);
        main(args);
    }
    
}
