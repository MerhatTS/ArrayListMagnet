import java.util.ArrayList;

public class ArrayListMagnet {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add(0, "ноль");
        a.add(1, "один");
        a.add(2, "два");
        a.add(3, "три");
        printAL(a);
        if(a.contains("три")){
            a.add("четыри");
        }
        a.remove(2);
        if (a.indexOf("четыри") != 4){
            a.add(4, "4.2");
        }
        printAL(a);
        printAL(a);
    }

    public static void printAL(ArrayList<String> al){
        for (String element : al){
            System.out.print(element+" ");
        }
        System.out.println(" ");
    }
}