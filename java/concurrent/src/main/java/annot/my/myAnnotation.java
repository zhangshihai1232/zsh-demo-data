package annot.my;

import java.lang.annotation.*;

/**
 * Created by zsh on 2016/9/26.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface myAnnotation {
    String value() default "";
}
