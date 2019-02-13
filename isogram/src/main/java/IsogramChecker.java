import java.util.*;

class IsogramChecker {

    boolean isIsogram(String phrase) {

        phrase = phrase.toLowerCase();
        int len = phrase.length();
        char[] stringToCharArray = phrase.toCharArray();
        Arrays.sort(stringToCharArray);
        for (int i = 0; i < len - 1; i++) {
            if (stringToCharArray[i] == stringToCharArray[i + 1]) {
                if (stringToCharArray[i] == ' ' || stringToCharArray[i] == '-' ) {
                    continue;
                }

                return false;
            }
        }
        return true;
    }
}
