package domain;

/**
 * This is the domain class that represent a specific 
 * course in the college system
 * 
 * @author Phuc Hong Le
 * @author Son Minh Tran
 * @version 6/7/2017
 */
public class Course {
    
    //fields
    public String courseName;
    public int credit;

    public Course(String courseName, int credit) {
        this.courseName = courseName;
        this.credit = credit;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "Course{" + "courseName=" + courseName + ", credit=" + credit + '}';
    }
    
    
}
