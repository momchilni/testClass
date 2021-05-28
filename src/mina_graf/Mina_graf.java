/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mina_graf;

import java.util.Scanner;

/**
 *
 * @author МомчилИванов
 */
public class Mina_graf {
  
    
int arr[][] = {
        {0, 0, 1, 0, 0, 0, 0, 1},
        {0, 0, 0, 0, 0, 1, 1, 0},
        {1, 0, 0, 0, 1, 0, 0, 1},
        {0, 0, 0, 0, 1, 1, 0, 0},
        {0, 0, 1, 1, 0, 1, 0, 0},
        {0, 1, 0, 1, 0, 0, 1, 0},
        {0, 1, 0, 0, 0, 1, 0, 1},
        {1, 0, 1, 0, 0, 0, 1, 0}
        };


   /* public void insert(){
    Scanner input = new Scanner(System.in);  
        System.out.println("Въведете число от 0 до 7: ");
        int number = input.nextInt();
        int number2 = input.nextInt();
        for(int i=0; i< arr.length-1 ;i++){
            
            for(int j=0; j<arr.length -1; j++){
                if(number >= 0 && number <=7 && number2 >= 0 && number2<=7){
                arr[number][number2] = 1;
                arr[number2][number] = 1;
                }
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
    }*/
    
    /*public void show(){
        System.out.println("Въведете число от 0 до 7: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for(int i = 0; i < arr.length; i++){
                if(number >=0 && number <= 7){
                    if(arr[number][i] == 1){
                        System.out.println(i);
                    }
                
                //System.out.println("");
            }
        }
        
    }*/

/*public void out (){
    System.out.println("Въведете число от 0 до 7: ");
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
        int number2 = input.nextInt();
        for(int i=0; i< arr.length;i++){
            
            for(int j=0; j<arr.length; j++){
                if(number >= 0 && number <=7 && number2 >= 0 && number2<=7){
                arr[number][number2] = 0;
                arr[number2][number] = 0;
                }
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
}*/
public void out_suset(){
    Scanner input = new Scanner(System.in);
    //int number = input.nextInt();
    for(int i = 0; i< arr.length; i++){
        for(int j = 0; j< arr.length; j++){
            System.out.print(arr[i][j]);
        }
        System.out.println("");
    }
}
    public static void main(String[] args) {
        Mina_graf obj = new Mina_graf();
        //obj.insert();
       //obj.show();
        //obj.out();
        obj.out_suset();
        
    }
    
}
