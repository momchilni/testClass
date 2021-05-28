/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinamichnistrtest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Svetoslava
 */
public class Vtora {

    public static void A(Stack<Integer> stack, int n) {

        int purvo = 1;
        int vtoro = 1;
        stack.add(1);
        for (int i = 0; i < n - 1; i++) {
            int temp = vtoro;
            vtoro = purvo + vtoro;
            purvo = temp;
            stack.add(purvo);
        }
    }

    public static void B(Stack<Integer> stack, Queue<Integer> opashka) {
    
         int j = 2;
        for (int i = 0; i <= stack.size(); i++) {
            if (j < stack.size()) {
                opashka.offer(stack.get(i) + stack.get(j));
                j++;
            }
        }
    }

    public static void C(LinkedList<Integer> list, Stack<Integer> stack, Queue<Integer> opashka) {
        while (!stack.empty()) {
            list.add(0, stack.pop());
        }
        while (!opashka.isEmpty()) {
            list.add(opashka.poll());
        }
    }

    public static void D(LinkedList<Integer> list) {
        int length = list.size();
        for (int i = 0; i < length; i++) {

            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Queue<Integer> opashka = new LinkedList<Integer>();
        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            A(stack, n);
            System.out.println(stack);
            B(stack, opashka);
            System.out.println(opashka);
            C(list, stack, opashka);
            D(list);
            System.out.println(list);
        }
    }
}
