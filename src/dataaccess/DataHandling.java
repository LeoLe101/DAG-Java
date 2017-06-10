/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess;

import domain.Course;
import dataaccess.AbstractGraph;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Son Tran
 */
public class DataHandling {

    public static ArrayList<Course> readFile(String fileName) throws FileNotFoundException, IOException {
        File file = new File(fileName);
        Course newCourse = null;
        int counter = 0;
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String data = reader.readLine();
        ArrayList<Course> result = new ArrayList<>();
        while (!data.equals("")) {
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
            data = reader.readLine();
        }
        return result;
    }
    
    public static UnweightedGraph<Course> getGraphCourse(List<Course> courses){
        ArrayList<Edge> edges = new ArrayList<>();
        UnweightedGraph<Course> result;
        for (int i = 0; i < courses.size(); i++) {
            for (Integer num : courses.get(i).prerequisites) {
                if (num != -1) {
                    edges.add(new Edge(num, i));
                }               
            }
        }
        result = new UnweightedGraph<>(courses, edges);
        return result;
    }
    
}
