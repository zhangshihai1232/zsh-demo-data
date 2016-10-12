package annot.annotationOpertor;

/**
 * Created by zsh on 2016/9/23.
 */
public class Aple {
    @FruitName("Apple")
    public String appleName;

    @FruitColor(fruitColor= FruitColor.Color.RED)
    public String appleColor;

    @FruitProvider(id=1,name="陕西红富士集团",address="陕西省西安市延安路89号红富士大厦")
    public String appleProvider;

    public void setAppleColor(String appleColor) {
        this.appleColor = appleColor;
    }
    public
String getAppleColor() {
        return appleColor;
    }
    public void setAppleName(String appleName) {
        this.appleName = appleName;
    }
    public String getAppleName() {
        return appleName;
    }

    public void setAppleProvider(String appleProvider) {
        this.appleProvider = appleProvider;
    }
    public String getAppleProvider() {
        return appleProvider;
    }

    public void displayName(){
        System.out.println("水果的名字是：苹果");
    }
}
