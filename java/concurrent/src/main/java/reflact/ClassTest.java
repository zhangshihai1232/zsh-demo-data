package reflact;

/**
 * Created by zsh on 2016/9/23.
 */
public class ClassTest {
    public static void main(String [] args)throws Exception{
        String str1="abc";
        Class cls1=str1.getClass();
        Class cls2=String.class;
        Class cls3=Class.forName("java.lang.String");
        System.out.println(cls1==cls2);
        System.out.println(cls1==cls3);
    }
}
