/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UCS;

/**
 *
 * @author saint
 */
public class Vertex {
    int nameOfVertex;
    int distanceOfVertexToAnother[]= new int [100];
    int previous;
    int distanceOfVertexToRoot;

    public int[] getDistanceOfVertexToAnother() {
        return distanceOfVertexToAnother;
    }

    public void setDistanceOfVertexToAnother(int[] distanceOfVertexToAnother) {
        this.distanceOfVertexToAnother = distanceOfVertexToAnother;
    }

    public int getDistanceOfVertexToRoot() {
        return distanceOfVertexToRoot;
    }

    public void setDistanceOfVertexToRoot(int distanceOfVertexToRoot) {
        this.distanceOfVertexToRoot = distanceOfVertexToRoot;
    }

    public Vertex(int nameOfVertex, int numberOfVertex, int previous) {
        this.nameOfVertex = nameOfVertex;
        this.distanceOfVertexToAnother = new int[numberOfVertex];
        this.previous = previous;
        this.distanceOfVertexToAnother= new int[numberOfVertex+1];
    }

    public int getNameOfVertex() {
        return nameOfVertex;
    }

    public void setNameOfVertex(int nameOfVertex) {
        this.nameOfVertex = nameOfVertex;
    }

    public int getDistanceOfVertexToAnother( int i ) {
        return distanceOfVertexToAnother[i];
    }
    
    public void setDistanceOfVertexToAnother(int i,int value) {
        this.distanceOfVertexToAnother[i] = value;
    }

    public int getPrevious() {
        return previous;
    }

    public void setPrevious(int previous) {
        this.previous = previous;
    }
   
    
}
