/**
 * @Author 1972037 Gabriel Octa Mahardika
 **/
public class OuterClass {

    private String outVar1;
    private String outVar2;
    private final InnerClass INNER_CLASS;

    public OuterClass() {
        INNER_CLASS = new InnerClass();
        INNER_CLASS.var1 = "John";
        INNER_CLASS.setVar2("Doe");
        outVar1 = "Susan";
        outVar2 = "Bones";
    }
    public void showAllVarIncludeInner(){
        System.out.println("Outer class variable");
        System.out.printf("%20s%20s%n",outVar1,outVar2);
        System.out.printf("Inner class variable");
        INNER_CLASS.showAllVar();
    }
    static class InnerClass{
        private String var1;
        private String var2;

        public void setVar1(String var1) {
            this.var1 = var1;
        }

        public void setVar2(String var2) {
            this.var2 = var2;
        }
        public void showAllVar(){
            System.out.println("Inner variable 1: "+ var1);
            System.out.println("Inner variable 2: "+ var2);
        }
    }
}
