/*Skapa en lista av ord. Använd reguljära uttryck för plocka ut endast de ord som innehåller
 2 eller fler engelska vokaler (a, e, i, o, u, y)
 */

package question3;

import java.util.List;

public class Question3 {
    public static void main(String[] args) {
        List.of("track","palm","elevator","post","number","star","store","pencil","rich","sunday")
                .stream()
                .filter(word->word.replaceAll("[^aeiouy]","").length()>=2)
                .forEach(System.out::println);
    }
}
