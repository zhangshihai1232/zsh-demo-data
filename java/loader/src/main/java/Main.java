import sun.misc.Launcher;

import java.net.URL;

/**
 * Created by zsh on 2016/9/29.
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        MyLoader myLoader = new MyLoader();
        Class clazz = myLoader.loadClass("ClassTest");
        System.out.println(clazz.getClassLoader());
    }
}
