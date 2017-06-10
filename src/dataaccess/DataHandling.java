/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess;

import domain.Course;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Son Tran
 */
public class DataHandling {

    public ArrayList<Course> readFile(String fileName) throws FileNotFoundException, IOException {
        File file = new File(fileName);
        Course newCourse = null;
        int counter = 0;
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String data = reader.readLine();
        ArrayList<Course> result = new ArrayList<>();
        while (data != null) {
            switch(counter % 3){
                case 0:
                    newCourse = new Course();
                    newCourse.setCourseName(data);
                    break;
                case 1:
                    newCourse.setCredit(Integer.parseInt(data));
                    break;
                case 2:
                    String[] temp = data.split("\\s");
                    ArrayList<Integer> prequisite = new ArrayList<>();
                    for (int i = 0; i < temp.length; i++) {
                        prequisite.add(Integer.parseInt(temp[i]));
                    }
                    newCourse.setPrerequisites(prequisite);
                    result.add(newCourse);
                    break;
            }           
            counter++;
        }
        return result;
    }
    
}
