package tech_a;

public class Accounting extends Program{
    
    private int mark;

    public Accounting(String courseName, int creditHours, boolean regular) {
        super(courseName, creditHours, regular);
        this.mark = 90;
    }

    public Accounting(String courseName, int creditHours, boolean regular, int mark) {
        super(courseName, creditHours, regular);
        this.mark = mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

}
