import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        int count=1;
        for(int i=0;i<3;i++){
            ArrayList<Integer>row=new ArrayList<>();
            for(int j=0;j<3;j++){
                row.add(count);
                count++;
            }
            matrix.add(row);
        }
        LinkedList<Integer>stock=new LinkedList<>();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(matrix.get(i).get(j)<5){
                    stock.add(2*matrix.get(i).get(j));
                }
            }
        }
        System.out.println("Original Warehouse Inventory= " + matrix);
        System.out.println("Updated Target Value: "+ stock);
    }
}