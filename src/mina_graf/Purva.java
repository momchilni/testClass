/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinamichnistrtest;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Svetoslava
 */
public class Purva {
    public static boolean possible = false;
    
    public static void DFS(int index, int end, int N, int M, LinkedList<LinkedList<Integer>> graph, boolean[] isVisited, int path){
        if(index >= N)
            return;
        if(index == end && path >= M){
            possible = true;
            return;
        }
        if(isVisited[index])
            return;
        
        isVisited[index] = true;
        
        for (int i = 0; i < graph.get(index).size(); i++) {
            DFS(graph.get(index).get(i), end, N, M, graph, isVisited, path + 1);
        }
        isVisited[index] = false;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt(),
            M = input.nextInt();
        
        LinkedList<LinkedList<Integer>> graph = new LinkedList<LinkedList<Integer>>();
        
        
        for (int i = 0; i < N; i++) {
            graph.add(new LinkedList<Integer>());
        }
        
        for (int i = 0; i < M; i++) {
            int from = input.nextInt(),
                to = input.nextInt();
            from -= 1;
            to -= 1;
            graph.get(from).add(to);
            graph.get(to).add(from);
        }
        
        int start = input.nextInt(),
            end = input.nextInt();
        
        start -= 1;
        
        DFS(start, start, N, M, graph, new boolean[N], 0);
        
        
        System.out.println(possible ? "possible" : "impossible");
    }

    
}