package Creation_Mode.Prototype;

/**
 * @class: Main
 * @description:
 * @author: dudg
 * @create: 2020-08-12 18:35
 */
public class Main {

    /**
     * 原型模式，基于一个原型实例，创建创建新的实例（克隆）
     * @param args
     */
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(123);
        student.setName("name1");
        student.setScore(100);
//        System.out.println(student.toString());

        Student student2 = (Student) student.clone();
        student2.setId(456);
        System.out.println(student2.toString());
        System.out.println(student.toString());
    }
}
