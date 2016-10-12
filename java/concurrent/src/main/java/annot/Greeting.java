package annot;

import java.lang.annotation.Inherited;

/**
 * Created by zsh on 2016/9/23.
 */
@Inherited
public @interface Greeting {
    public enum FontColor{ BULE,RED,GREEN};
    String name();
    FontColor fontColor() default FontColor.GREEN;
}
