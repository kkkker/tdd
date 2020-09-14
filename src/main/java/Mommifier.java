public class Mommifier {

    public String convert(String string) {
        if (string == null) {
            throw new NullStringException();
        }
        return string;
    }
}
