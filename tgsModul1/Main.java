/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgsModul1;

/**
 *
 * @author imadw
 */
public class Main {
   //Static method
    static void myStaticMethod(){
        System.out.println("Static methods can be called without creatung objects");
    }
    //public method 
    public void myPublicMethod (){
        System.out.println("Public methods must be called by creating objects");
    }
    //main method 
    public static void main(String [] args){
        myStaticMethod(); //Call the static method
        //myPublicMethod(); //this would output an error
        
        Main myObj = new Main(); //Create an object of main
        myObj.myPublicMethod(); //Call the public method
    }
}   
  

