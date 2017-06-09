package domain;

import java.util.ArrayList;

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
    public ArrayList<Integer> prerequisites;
    
    public Course(String courseName, int credit, ArrayList<Integer> prerequisites) {
        this.courseName = courseName;
        this.credit = credit;
        this.prerequisites = prerequisites;
    }

    public ArrayList<Integer> getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(ArrayList<Integer> prerequisites) {
        this.prerequisites = prerequisites;
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
        return "Course: " + courseName + "\n Credit: " + credit;
    }
    
    
}
