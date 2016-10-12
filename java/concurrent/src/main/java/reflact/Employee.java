package reflact;

import lombok.ToString;

/**
 * Created by zsh on 2016/9/23.
 */
@ToString
public class Employee {
    public String Tag="emp";
    private String name;
    private String tel;
    Integer age;

    public Employee(String name, String tel, Integer age) {
        this.name = name;
        this.tel = tel;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private void privateSpeak(String msg) {
        System.out.println("message "+msg);
    }
}
