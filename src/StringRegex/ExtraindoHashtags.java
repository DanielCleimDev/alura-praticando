package StringRegex;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtraindoHashtags {
    public static void main(String[] args) {
        String string = "#mundo! Estou aprendendo #Java e #programação";

        Pattern pattern = Pattern.compile("#\\w+");
        Matcher matcher = pattern.matcher(string);

        ArrayList<String> hashtags = new ArrayList<>();

        while (matcher.find()){
            hashtags.add(matcher.group());
        }
        if (hashtags.isEmpty()) {
            System.out.println("Nenhuma hashtag encontrada.");
        } else {
            System.out.println("Hashtags encontradas: " + String.join(", ", hashtags));
        }

    }
}
