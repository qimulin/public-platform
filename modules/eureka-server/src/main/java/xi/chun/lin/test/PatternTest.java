package xi.chun.lin.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Lin.XiChun on 2018/4/10.
 */
public class PatternTest {
    public static void main(String[] args) {
        // 要验证的字符串
        String str = "1212.72%";
        // 邮箱验证规则
//        String regEx = "(0|([1-9]+[0-9]?))+(.[0-9]{2})?(%)?$";
//        String regEx = "(0)+(.[0-9]{2})?(%)?$";
//        String regEx = "([1-9]+[0-9]?)+(.[0-9]{2})?(%)?$";
        String regEx = "(0|(-?[1-9][0-9]{0,2}))(.[0-9]{1,2})?(%)?";
        // 编译正则表达式
        Pattern pattern = Pattern.compile(regEx);
        // 忽略大小写的写法
        // Pattern pat = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        // 字符串是否与正则表达式相匹配
        boolean rs = matcher.matches();
        System.out.println(str);
        System.out.println(rs);
    }
}
