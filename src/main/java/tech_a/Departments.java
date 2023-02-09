package tech_a;

public class Departments {
    
    public static void main(String[] args) {

        Accounting accounting = new Accounting("statistics", 4, true);
        System.out.println(accounting.isRegular());

    }

}
