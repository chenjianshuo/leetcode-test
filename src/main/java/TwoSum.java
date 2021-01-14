import java.util.HashMap;
import java.util.Map;

/**
 * @description:两数之和
 * @author: chenjianshuo
 * @create: 2021-01-13 16:41
 **/

public class TwoSum {
    public static void main(String[] args) {
       int  target = 9;
       int[] a ={1,2,3,6};
        System.out.println(twoSum1(target,a));
    }

    public static int[] twoSum1(int target,int[] a){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(16);
        for (int i = 0; i < a.length; i++) {
            if(map.containsKey(target - a[i])){
                return new int[]{i, map.get(target - a[i])};
            }
            map.put(a[i],i);
        }
        return new int[]{};
    }
}
