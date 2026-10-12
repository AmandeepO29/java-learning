package enums;

public class testingEnums {
    static void main(String[] args) {
        for (Day i : Day.values()) {
            System.out.printf("%s : %s\n" , i , i.getType());
        }
    }
}
