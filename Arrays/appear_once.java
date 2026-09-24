public class appear_once{
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4};
        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor^=arr[i];
        }
        System.out.println(xor);
    }
}
// import java.util.HashMap;
// public class Main {
//     public static void main(String[] args) {
//         int[] arr = {4, 1, 2, 1, 2};
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for (int num : arr) {
//             map.put(num, map.getOrDefault(num, 0) + 1);
//         }
//         for (int num : arr) {
//             if (map.get(num) == 1) {
//                 System.out.println(num);
//                 break;
//             }
//         }
//     }
// }
