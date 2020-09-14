import java.util.stream.Stream;

public class Mommifier {
    private final String[] CONTINUOUS_OF_VOWELS = {"aa", "ee", "ii", "oo", "uu"};
    private final double MAX_RATE_OF_VOWELS = 0.3;

    public String convert(String string) {
        if (string == null) {
            throw new NullStringException();
        }
        int indexOfContinuousOfVowels = indexOfContinuousOfVowels(string);
        if (indexOfContinuousOfVowels < 0 || numberOfVowels(string) < (string.length() * MAX_RATE_OF_VOWELS)) {
            return string;
        }
        return string.substring(0, indexOfContinuousOfVowels + 1) +
                "mommy" +
                string.substring(indexOfContinuousOfVowels + 1);
    }

    public int indexOfContinuousOfVowels(String string) {
        int index = -1;
        for (String continuousOfVowel : CONTINUOUS_OF_VOWELS) {
            int tempIndex = string.indexOf(continuousOfVowel);
            if (tempIndex < 0) {
                continue;
            }
            if (index < 0) {
                index = tempIndex;
            } else {
                index = Math.min(index, tempIndex);
            }
        }
        return index;
    }

    public int numberOfVowels(String string) {
        final String vowels = "aeiou";
        int sum = 0;
        for (int i = 0; i < string.length(); i++) {
            if (vowels.contains(String.valueOf(string.charAt(i)))) {
                sum++;
            }
        }
        return sum;
    }
}
