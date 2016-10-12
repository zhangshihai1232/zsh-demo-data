package annot.annotationOpertor;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/***********输出结果***************/
public class FruitRun {

    /**
     * @param args
     */
    public static void main(String[] args) {

//        Annotation[] annotations = Aple.class.getAnnotations();
//
//        Field[] fields = Aple.class.getDeclaredFields();
//        for (Field field : fields) {
//            System.out.println("................."+field);
//            for (Annotation annotation : field.getDeclaredAnnotations()) {
//                System.out.println(annotation);
//            }
//
//        }

        Field[] field2s = Aple.class.getDeclaredFields();
        for (Field field : field2s) {
            System.out.println("................."+field);
//            for (Annotation annotation : field.getAnnotations()) {
//                System.out.println(annotation);
//            }
//            for (Annotation annotation : field.getDeclaredAnnotations() {
//                System.out.println(annotation);
//            }
            for (Annotation annotation : field.getAnnotations()) {
                System.out.println(annotation);
            }

        }



    }

}
