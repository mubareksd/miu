package tech_a;

public class Program {
    
    private String courseName;
    private int creditHours;
    private boolean regular;

    public Program(String courseName, int creditHours, boolean regular) {
        this.courseName = courseName;
        this.creditHours = creditHours;
        this.regular = regular;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public void setRegular(boolean regular) {
        this.regular = regular;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public boolean isRegular() {
        return regular;
    }


}
