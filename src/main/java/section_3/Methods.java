package section_3;

public class Methods {
    public void getData(){
        System.out.println("Hello World");
    }

    public String returnMethod(){
        return "Danil";
    }

    public static void staticTest(){
        System.out.println("Static Test");
    }

    public static void main(String[] args) {
        Methods methods = new Methods();
        methods.getData();

        String returnName = methods.returnMethod();
        System.out.println(returnName);

        MethodsCallInNewClass methodsCall = new MethodsCallInNewClass();
        String returnNameFromAnotherClass = methodsCall.returnMethodFromAnotherClass();
        System.out.println(returnNameFromAnotherClass);
        int number = MethodsCallInNewClass.returnInt();
        System.out.println(number);

        staticTest();

    }
}
