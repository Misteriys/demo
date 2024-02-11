package calcProg;

import java.io.IOException;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) throws IOException {
        Scanner scan1 = new Scanner(System.in);
        String string1 = scan1.nextLine();
        System.out.println(poisk(string1));
//        String [] array1=string1.split(" ");
//        for(String s:array1){
//            System.out.println(s);
        }
        static String  poisk(String array1 ) throws IOException {
            String [] stAr=array1.split(" ");
            if(stAr.length>3||stAr.length<3){
                throw new IOException("формат математической операции не удовлетворяет заданию - два операнда и один оператор");
            }

            int a=Integer.parseInt(stAr[0]);
            int b=Integer.parseInt(stAr[2]);

            String kluch =stAr[1];
            int otvet=0;
            switch (kluch) {
                case "+":
                    if(a>10 || a<0 || b>10 || b<0){
                        throw new IOException("Числа больше допустимого диапазона. Диапазон от 0 до 10");

                    }
                    otvet = a + b;
                    break;
                    case "-":
                        if(a>10 || a<0 || b>10 || b<0) {
                            throw new IOException("Числа больше допустимого диапазона. Диапазон от 0 до 10");}
                            otvet = a - b;
                            break;

                case "*":
                    if(a>10 || a<0 || b>10 || b<0) {
                        throw new IOException("Числа больше допустимого диапазона. Диапазон от 0 до 10");}
                        otvet = a * b;
                        break;

                case "/":
                    if(a>10 || a<0 || b>10 || b<0) {
                        throw new IOException("Числа больше допустимого диапазона. Диапазон от 0 до 10");}
                        otvet = a / b;
                        break;

                default:
                    throw new IOException("Не математическая строка");

            }
            return String.valueOf(otvet);



        }

        }



