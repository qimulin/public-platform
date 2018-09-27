package xi.chun.lin.annotation;

import java.lang.annotation.*;

/**
 * Created by Lin.XiChun on 2018/7/18.
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Lxcation {
    String val ="1";
    String value();
}
