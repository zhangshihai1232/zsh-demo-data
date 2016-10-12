package annot.my;

import java.lang.annotation.Annotation;

/**
 * Created by zsh on 2016/9/26.
 */
public class Main {
    public static void main(String[] args) {
        for (Annotation annotation : Sun.class.getAnnotations()) {
            System.out.println(annotation);
        }
    }
}
