import com.google.common.collect.Lists;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by zsh on 2016/9/29.
 */
public class MyLoader extends ClassLoader {

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        Class clazz = null;
        byte[] classData = getClassData(name);
        if (classData == null) {
            throw new ClassNotFoundException();
        }
        clazz = defineClass(name, classData, 0, classData.length);
        return clazz;
    }

    private byte[] getClassData(String name) {

        ArrayList<Byte> list = new ArrayList();
        try {
            InputStream inputStream = new FileInputStream("D:\\"+name+".class");
            byte[] buf = new byte[10];
            int n;
            while ((n=inputStream.read(buf)) >0 ) {
                for (int i = 0; i < n; i++) {
                    list.add(buf[i]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        int n=list.size();
        byte[] bytes = new byte[n];
        for (int i = 0; i < n; i++) {
            bytes[i]=(byte)list.get(i);
        }
        return bytes;
    }
}
