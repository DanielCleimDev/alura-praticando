package StringRegex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidandoCodigos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Digite um padrão no formato ABC-1234: ");
            String string = sc.nextLine();

            Pattern pattern = Pattern.compile("^[a-zA-Z]{3}-\\d{4}$");
            Matcher matcher = pattern.matcher(string);

            if (matcher.matches()) {
                System.out.printf("Código digitado '%s' corresponde ao formato.", string);
                break;
            }else{
                System.out.printf("Código digitado '%s' não corresponde ao formato.", string);
            }
        }

        sc.close();
    }
}
