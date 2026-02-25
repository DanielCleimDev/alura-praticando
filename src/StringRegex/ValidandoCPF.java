package StringRegex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidandoCPF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String string;
        Matcher matcher;

        Pattern pattern = Pattern.compile("^\\d{3}.\\d{3}.\\d{3}-\\d{2}$");

        while (true){
            System.out.println("Digite o CPF no formato 123.456.789-09: ");
            string = sc.nextLine();

            matcher= pattern.matcher(string);

            if(matcher.matches()){
                System.out.printf("CPF %s no formato correto!\n", string);
                break;
            }else{
                System.out.printf("CPF %s não esta no formato correto!\n", string);
            }
        }
        sc.close();
    }
}
