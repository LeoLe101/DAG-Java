/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import dataaccess.*;
import domain.Course;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Son Tran
 */
public class main {
    
    
    public static void main(String[] args){
        UnweightedGraph<Course> graph;
        ArrayList<Course> courseList = null;
        try {
            courseList = DataHandling.readFile("info.txt");
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        graph = DataHandling.getGraphCourse(courseList);
        ArrayList<Integer> sortedGraph;
        
        sortedGraph = graph.topologicalSort();
        for (int i = 0; i < sortedGraph.size(); i++) {
            System.out.println(courseList.get(sortedGraph.get(i)).getCourseName());
        }
        
//        graph.printEdges();
//        System.out.println(graph);
        System.out.println("done");
    }
}
