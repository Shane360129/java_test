
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day0410_1 {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("a", "B", "c","D");  // 只有4個位置，靜態
        for(String item : strList){
            System.out.print(item);
        }
        System.out.println(" ");
        //======================================
        List<String> strList1 = new ArrayList<>(Arrays.asList("a", "B", "c","D"));
        //在動態List裡面先加入4個資料，位置仍為動態，可以再新增
        strList1.add("F");
        strList1.add("W");
        for (String item1 : strList1){
            System.out.print(item1);
        }
    }
}
