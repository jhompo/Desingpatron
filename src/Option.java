public class Option {

    String Text, Value;

    public Option(String f, String last) {
        Text = f;
        Value = last;
    }

    public String toString() {
        return Text ; //+ " - " + Value;
    }

}
