public class Main {
    public static Validate validateNumberphone;
    public static final String[] Test = new String[]{"84-1233232323","23-2323223","23-2323232332","AA-2323232323"};
    public static void main(String[] args) {
        validateNumberphone = new Validate();
        for (String test:
                Test) {
            boolean isvalid = validateNumberphone.validate(test);
            System.out.println(test +"là" + isvalid);
        }

    }
}
