package tugas.bab4;

public class Student {

    private String name;
    private int mark;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setMark(int m) {
        mark = m;
    }

    public int getMark() {
        return mark;
    }
}

class Test {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Enkapsulasi");
        s1.setMark(90);
        System.out.println("s1Name is " + s1.getName());
        System.out.println("s1Mark is " + s1.getMark());
        System.out.println("name dan mark " + s1.getName() + " " + s1.getMark());
    }
}
