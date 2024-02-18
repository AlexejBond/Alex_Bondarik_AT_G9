package homework.day5.generictask;

public class GenericMethodsInGenericClassT<T> {

    public void genericMethodOneGenArg(T someArgument) {
        System.out.println("I am an object of " + someArgument.getClass().getSimpleName() + " class");


    }

    public <X, Y> String genericMethodTwoGenArgs(X xArg, Y yArg) {
        return "We are objects of " + xArg.getClass().getSimpleName() + " class and " + yArg.getClass().getSimpleName() + " class";

    }

    public <X> void genericMethodHalfGenArgs(X xArg, String stringArg) {
        System.out.println("I got an object of " + xArg.getClass().getSimpleName() + " class and string with " + stringArg.length() + " characters");

    }


}
