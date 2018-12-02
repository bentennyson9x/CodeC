/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this currentVertexlate file, choose Tools | Templates
 * and open the currentVertexlate in the editor.
 */
package UCS;

import cacproblemvathuattoan2.Temp;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author saint
 */
public class UCS {
    
    PriorityQueue<Vertex> priorityQueue = new PriorityQueue<Vertex>(new Comparator<Vertex>() {
        @Override
        public int compare(Vertex t, Vertex t1) {
            if (t.getDistanceOfVertexToRoot() > t1.getDistanceOfVertexToRoot()) {
                return 1;
            } else if (t.getDistanceOfVertexToRoot() < t1.getDistanceOfVertexToRoot()) {
                return -1;
            }
            return 0;
        }
    });
    boolean approvalVertex[] = new boolean[100];
    Vertex aggregateVertex[] = new Vertex[100];
    int n;
    int noWayToGoVertex = 1000;
    int vertexStart = 1;
    int vertexGoal = 4;
    
    public UCS() {
    }
    
    public int getVertexGoal() {
        return vertexGoal;
    }
    
    public void setVertexGoal(int vertexGoal) {
        this.vertexGoal = vertexGoal;
    }

    public UCS(int n, int vertexStart) {
        this.n = n;
        this.vertexStart = vertexStart;
        Arrays.fill(approvalVertex, false);
    }
    
    public int getVertexStart() {
        return vertexStart;
    }
    
    public void setVertexStart(int vertexStart) {
        this.vertexStart = vertexStart;
    }
    
    public UCS(int n) {
        this.n = n;
    }
    
    public PriorityQueue<Vertex> getPriorityQueue() {
        return priorityQueue;
    }
    
    public void setPriorityQueue(PriorityQueue<Vertex> priorityQueue) {
        this.priorityQueue = priorityQueue;
    }
    
    public Vertex[] getAggregateVertex() {
        return aggregateVertex;
    }
    
    public void setAggregateVertex(Vertex[] aggregateVertex) {
        this.aggregateVertex = aggregateVertex;
    }
    
    public int getN() {
        return n;
    }
    
    public void setN(int n) {
        this.n = n;
    }
    
    public void DocFile() {
        try {
            Scanner s = new Scanner(Paths.get("UCS.txt"), "UTF-8");
            setN(s.nextInt());
            for (int i = 1; i <= n; i++) {
                aggregateVertex[i] = new Vertex(i, n, vertexStart);
                for (int j = 1; j <= n; j++) {
                    aggregateVertex[i].setDistanceOfVertexToAnother(j, s.nextInt());
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(UCS.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    public void DisplayMatrix() {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ": ");
            for (int j = 1; j <= n; j++) {
                System.out.printf("%10d", aggregateVertex[i].getDistanceOfVertexToAnother(j));
            }
            System.out.println("");
        }
    }
    
    private void Init() {
        for (int i = 1; i <= getN(); i++) {
            aggregateVertex[i].distanceOfVertexToRoot = aggregateVertex[vertexStart].getDistanceOfVertexToAnother(i);
        }
    }

    public void UniformCostSearch(int start) {
        Init();
        priorityQueue.add(aggregateVertex[start]);
        while (priorityQueue.isEmpty() != true) {
            Vertex currentVertex = priorityQueue.peek();
            priorityQueue.poll();
            if (currentVertex.getNameOfVertex() == vertexGoal) {
                return;
            }
            approvalVertex[currentVertex.getNameOfVertex()] = true;
            for (int i = 1; i <= getN(); i++) {
                if (approvalVertex[i] == false && currentVertex.getDistanceOfVertexToAnother(i) != noWayToGoVertex && currentVertex.getDistanceOfVertexToAnother(i) != 0) {
                    if (currentVertex.distanceOfVertexToRoot + currentVertex.getDistanceOfVertexToAnother(i) < aggregateVertex[i].distanceOfVertexToRoot) {
                        aggregateVertex[i].setDistanceOfVertexToRoot(currentVertex.distanceOfVertexToRoot + currentVertex.getDistanceOfVertexToAnother(i));
                        aggregateVertex[i].setPrevious(currentVertex.getNameOfVertex());
                    }
                    priorityQueue.add(aggregateVertex[i]);
                    
                }
            }
        }
        System.out.println("");
    }

    public void DisplayRoad() {
        int vertexCurrent = vertexGoal;
        List<Integer> TracesRoad = new ArrayList<>();
        TracesRoad.add(aggregateVertex[vertexCurrent].getNameOfVertex());
        while (aggregateVertex[vertexCurrent].getPrevious() != vertexStart) {
            vertexCurrent = aggregateVertex[vertexCurrent].getPrevious();
            TracesRoad.add(aggregateVertex[vertexCurrent].getNameOfVertex());
        }
        TracesRoad.add(aggregateVertex[vertexCurrent].getPrevious());
        Collections.reverse(TracesRoad);
        System.out.println("\nThe road goes from " + vertexStart + " to " + vertexGoal + " is : ");
        for (int i = 0; i < TracesRoad.size(); i++) {
            if (i != TracesRoad.size() - 1) {
                System.out.print(TracesRoad.get(i) + "-->");
            } else {
                System.out.println(TracesRoad.get(i));
            }
        }
        System.out.println("Distance : " + aggregateVertex[vertexGoal].distanceOfVertexToRoot + " Km");
        
    }
    
    public static void main(String[] args) {
        UCS ucs = new UCS();
        ucs.DocFile();
        ucs.DisplayMatrix();
        ucs.setVertexStart(1);
        ucs.setVertexGoal(5);
        ucs.UniformCostSearch(1);
        ucs.DisplayRoad();
       
    }
    
}
