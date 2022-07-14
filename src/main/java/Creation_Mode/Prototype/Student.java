package Creation_Mode.Prototype;

/**
 * @class: Student
 * @description: 原型模式，即Prototype，是指创建新对象的时候，根据现有的一个原型来创建。
 * 用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 * @author: dudg
 * @create: 2020-08-12 18:24
 */
public class Student implements Cloneable{

    private int id;
    private String name;
    private int score;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Object clone(){
        Student student = new Student();
        student.id = this.id;
        student.name = this.name;
        student.score = this.score;
        return student;
    }
}
