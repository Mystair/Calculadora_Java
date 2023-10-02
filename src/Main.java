import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num1, num2, result; 
        String op;
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o primeiro número: (usar ',' para decimais) ");
        num1=in.nextDouble();

        System.out.println("Informe a operação:(+ ,- ,* ,/)");
        op=in.next();

        System.out.println("Informe o segundo número: (usar ',' para decimais) ");
        num2=in.nextDouble();

        switch (op){
            case "+":
                result = num1+num2;
                System.out.println("A soma dos números é: "+result);
                break;

            case "-":
                result = num1-num2;
                System.out.println("A subtração dos números é: "+result);
                break;

            case "*":
                result = num1*num2;
                System.out.println("A multiplicação dos números é: "+result);
                break;

            case "/":
                result = num1/num2;
                System.out.println("A divisão dos números é: "+result);
                break;
        }
        System.exit(0);
    }
}