import java.util.ArrayList;
public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer>arrList1= new ArrayList<>();
        arrList1.add(1);
        arrList1.add(2);
        arrList1.add(3);

        ArrayList<Integer>arrList2= new ArrayList<>();
        arrList2.add(4);
        arrList2.add(5);
        arrList2.add(6);
        arrList2.add(7);
        arrList2.add(8);
        arrList2.add(9);


        arrList2.addAll(3,arrList1);

        System.out.println("Cac phan tu trong mang la : ");
        for (int number:arrList2) {
            System.out.println(number);
        }
    }
}
