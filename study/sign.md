# 对象调用问题

问题：
```java
class User{
     String name;
     Sex gender;
}
class Sex{
     String sex;
}
public class Text{
    public static void main(String[] args) {
        Sex sex =  new Sex();
        sex.sex = "男";
        
        User user = new User();
        user.name = "admin";
        user.gender = sex;
        
        //为什么这里报错
        System.out.println(user.sex);
    }
}
```
回复：对象sex是对象没错，但是他只是一个变量名啊,它不是实例名、
相当于表格中的姓名，性别，你非要吧性别写成男

这个显然不合理，java是强类型的语言，所有的属性都必须定义后才能使用，你现在去调用对象当中不存在的属性

