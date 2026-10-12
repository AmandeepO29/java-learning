package toString_method;

public class studenTtoString {
    String name;
    int age;
    String rollNo;
    String house;
    public studenTtoString() {
    }
    public studenTtoString(String name, int age, String rollNo, String house) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.house = house;
    }
    @Override
    public String toString() {
        return "STudents DEtails : :{name :" + name  + " ,  age: " + age  + " , rollNo : " + rollNo + " , house : " + house + " } " ;
    }
    public static void main(String[] args) {
        studenTtoString stu = new studenTtoString("Amandeep " , 20 , "a2400320100168" , "green");
        System.out.println(stu);
    }
}
