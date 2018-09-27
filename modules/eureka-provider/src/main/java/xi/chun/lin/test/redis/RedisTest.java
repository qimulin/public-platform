package xi.chun.lin.test.redis;

import java.util.*;

/**
 * Created by Lin.XiChun on 2018/4/13.
 */
public class RedisTest {

    public static void main(String[] args) {
        List tL = new ArrayList<String>();
        int i=1;
        int j=i++;
        System.out.println(j);
        System.out.println(Object[].class);
        Set<Integer> s = new HashSet<Integer>();
        s.add(20);
        s.add(18);
        s.add(23);
        s.add(12);
        s.add(17);
        s.add(5);
        s.add(26);
        s.add(24);
        for (Integer s_one: s) {
            System.out.println(s_one);
        }
    }
}
