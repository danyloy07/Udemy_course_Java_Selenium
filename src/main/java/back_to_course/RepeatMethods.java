package back_to_course;

public class RepeatMethods {  // КЛАСС — шаблон

    public void nothingReturn() {
        System.out.println("Nothing return");
    }

    public String returnMethod() {
        return "Return";
    }

    public static void classMethod() {
        System.out.println("Class Method");
    }

    public static void greet (String text){
        System.out.println("Hello "+ text + " !");
    }

    public static void main(String[] args) {
    RepeatMethods methods = new RepeatMethods();
    methods.nothingReturn();

    String smthReturn = methods.returnMethod();
        System.out.println(smthReturn);

    classMethod();
    greet("Danya");

    Helper method = new Helper();
    method.sayBye();
    }
}
