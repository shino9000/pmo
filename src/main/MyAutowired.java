package main;

import java.lang.annotation.*;

/**
 * Created by xxx on 2018/4/19.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAutowired {
    String value() default  "";
}
