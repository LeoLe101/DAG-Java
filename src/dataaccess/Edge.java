/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess;

/**
 *
 * @author Son Tran
 */
public class Edge {
    public int u; // Starting vertex of the edge
    public int v; // Ending vertex of the edge
    
    /** Construct an edge for (u, v) */
    public Edge(int u, int v) {
      this.u = u;
      this.v = v;
    }
    
    public boolean equals(Object o) {
      return u == ((Edge)o).u && v == ((Edge)o).v; 
    }
  }
