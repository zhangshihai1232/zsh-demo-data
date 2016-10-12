package annot;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Created by zsh on 2016/9/23.
 */
@Target(ElementType.TYPE)
public @interface Table {
    public String tableName() default "className";
}
