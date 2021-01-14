package com.tts;




import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner NumInput = new Scanner(System.in);
        double firstNum = 0;
        double secondNum = 0;
        double result = 0;
        System.out.println("Enter first number: ");
        firstNum = NumInput.nextDouble();
        System.out.println("Enter operator: ");
        String amalgar = NumInput.next();
        if (amalgar == "sin" || amalgar == "cos" || amalgar == "tan" || amalgar == "cot") {
            switch (amalgar) {
                case "sin":
                    result = Math.toRadians(Math.sin(firstNum));
                    break;
                case "cos":
                    result = Math.toRadians(Math.cos(firstNum));
                    break;
                case "tan":
                    result = Math.toRadians(Math.tan(firstNum));
                    break;
                case "cot":
                    result = (Math.toRadians(Math.cos(firstNum)) / Math.toRadians(Math.sin(firstNum)));
                    break;

                default:
                    break;


            }
            System.out.println(Math.toRadians(result));
        } else

            System.out.println("Enter second number: ");
        secondNum = NumInput.nextDouble();
        switch (amalgar) {
            case "+":
                ;
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
            case "/":
                result = firstNum / secondNum;
                break;

            default:
                System.out.println("nemifahmam chi neveeshti");
        }

        System.out.println(result);

        Scanner square = new Scanner(System.in);
        System.out.println("Enter a number:");
        int input = Integer.parseInt(square.nextLine());
        int operation2 = Calculator.square(input);
        System.out.println("The square root is: " + operation2);

//factorial
        Scanner factoral = new Scanner(System.in);
        System.out.println("Enter a number:");
        int input2 = Integer.parseInt(factoral.nextLine());

        int i, fact = 1;
        int number = input2;//It is the number to calculate factorial
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }


        System.out.println("Factorial of " + number + " is: " + fact);
//Sin, cos, tan
        Scanner in = new Scanner(System.in);

        System.out.print("Radain or degree mode?: ");
        String radainOrDegree = in.nextLine();

        if(radainOrDegree.equalsIgnoreCase("degree")){
            System.out.print("Which operation? (sin, cos, tan):");
            String operation = in.nextLine();
            switch(operation){
                case "sin":
                    System.out.print("What number do you want in the sin: ");
                    System.out.println(Math.sin(Math.toRadians(in.nextInt())));
                    break;
                case "cos":
                    System.out.print("What number do you want in the cos: ");
                    System.out.println(Math.cos(Math.toRadians(in.nextInt())));
                    break;
                case "tan":
                    System.out.print("What number do you want in the tan: ");
                    System.out.println(Math.tan(Math.toRadians(in.nextInt())));
                    break;
                default:
                    break;
            }
        } else{
            System.out.print("Which operation? (sin, cos, tan):");
            String operation = in.nextLine();
            switch(operation){
                case "sin":
                    System.out.print("What number do you want in the sin: ");
                    System.out.println(Math.sin(in.nextInt()));
                    break;
                case "cos":
                    System.out.print("What number do you want in the cos: ");
                    System.out.println(Math.cos(in.nextInt()));
                    break;
                case "tan":
                    System.out.print("What number do you want in the tan: ");
                    System.out.println(Math.tan(in.nextInt()));
                    break;
                default:
                    break;
            }
        }
        in.close();



    }
}





