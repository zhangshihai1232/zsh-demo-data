package reflact;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by zsh on 2016/9/23.
 */
public class ReflactTest {
    public static void main(String[] args) throws Exception {
//        testConstuct();
//        testMembers();
//        testOneMember();
        testMethod();

    }

    static void testMethod() throws Exception {
        Class c = Class.forName("reflact.Employee");
        Constructor constructor = c.getConstructor(String.class, String.class, Integer.class);
        Object obj = constructor.newInstance("小明", "1234", 12);
        //getDeclaredFields  获取所有属性
        Method method = c.getDeclaredMethod("privateSpeak",String.class);
        method.setAccessible(true);
        method.invoke(obj,"etst");

    }

    static void testMembers() throws Exception {
        Class c = Class.forName("reflact.Employee");
        //getDeclaredFields  获取所有属性
        Field[] fs = c.getDeclaredFields();
        for (Field f : fs) {
            System.out.println(f);
        }

        //getFields  获取属性
        Field[] fs2 = c.getFields();
        for (Field f : fs2) {
            System.out.println(f);
        }
    }

    static void testOneMember() throws Exception {
        Class c = Class.forName("reflact.Employee");
        Constructor constructor = c.getConstructor(String.class, String.class, Integer.class);
        Object obj = constructor.newInstance("小明", "1234", 12);
        Field field = c.getField("name");
        System.out.println(field.get(obj));
    }



    static void testConstuct() throws Exception {
        Class c = Class.forName("reflact.Employee");
        Constructor constructor = c.getConstructor(String.class, String.class, Integer.class);
        Object obj = constructor.newInstance("小明", "1234", 12);
        System.out.println(obj);
    }

}
