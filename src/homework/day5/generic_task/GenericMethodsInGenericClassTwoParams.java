package homework.day5.generic_task;

public class GenericMethodsInGenericClassTwoParams<X, Y> {

    public String genericMethodGenArgs(X xArg1) {
        return "I received 1 arguments of type: " + xArg1.getClass().getSimpleName() + " class";
    }

    public String genericMethodGenArgs(X xArg1, Y yArg1) {
        return "I received 2 arguments of type: " + xArg1.getClass().getSimpleName() + " class and " + yArg1.getClass().getSimpleName() + " class";

    }

    public void genericMethodHalfGenArgs(X xArg1, Y yArg1, String stringAgr) {
        int stringLenghtOfArg = stringAgr.length();
        System.out.println("I got an object of " + xArg1.getClass().getSimpleName() + " class and " + yArg1.getClass().getSimpleName() + " class and string with "  + stringLenghtOfArg + " characters");
    }

    public void genericMethodHalfGenArgs(X xArg1, String stringAgr) {
        int stringLenghtOfArg = stringAgr.length();
        System.out.println("I got an object of " + xArg1.getClass().getSimpleName() + " class and string with "  + stringLenghtOfArg + " characters");
    }



}
