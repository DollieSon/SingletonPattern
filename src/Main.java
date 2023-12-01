// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        SingletonLog Something = SingletonLog.getInstance();
        SingletonLog Anything = SingletonLog.getInstance();
        if(Anything == Something){
            System.out.println("Anything is Something");
        }
        Anything.addElement(99);
        Something.addElement(10);
        Anything.addElement(20);
        Anything.PrintElems();
    }
}