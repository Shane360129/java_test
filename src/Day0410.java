import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Day0410 {
    //    public static void main(String[] args) {
//        MyData<Integer> m = new MyData<>();
//        m.setObj(10);
//        System.out.println(m.getObj());
//
//        MyData<String> a = new MyData<>();
//        a.setObj("oxox");
//        System.out.println(a.getObj());
//
//        MyData<Double> b = new MyData<>();
//        b.setObj(10.2);
//        System.out.println(b.getObj());   //物件(Oject)比對是比對記憶體位置
//
//        var w = a.getObj();
//        System.out.println(w);
//
//
//    }
//}
//            public static void main(String[] args) {
//                Scanner sc = new Scanner(System.in);
//                System.out.println("請輸入菱形邊長：");
//                int n = sc.nextInt();
//
//                for (int i = 0; i <= n; i++) {
//                    for (int j = 0; j <= n - i; j++) {
//                        System.out.print(" ");
//                    }
//                    for (int k = 1; k <= i; k++) {
//                        System.out.print("* ");
//                    }
//                    System.out.println();
//                }
//                for (int i = n - 1; i >= 0; i--) {
//                    for (int j = 0; j <= n - i; j++) {
//                        System.out.print(" ");
//                    }
//                    for (int k = 1; k <= i; k++) {
//                        System.out.print("* ");
//                    }
//                    System.out.println();
//                }
//            }
//}
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(100, "蘋果");
        map.put(30, "香蕉");
        map.put(50, "芒果");
        map.put(25, "西瓜");
        System.out.println("最便宜的水果是：" + map.get(map.firstKey()) + " " + "價格是：" + map.firstKey());
        System.out.println("最貴的水果是：" + map.get(map.lastKey()) + " " +"價格是：" + map.lastKey());

        for (Entry<Integer, String> item : map.entrySet()) {
            System.out.println(item.getKey());
            System.out.println(item.getValue());
        }
    }
}

