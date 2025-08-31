/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgsModul1;

/**
 *
 * @author imadw
 */
public class Puppy {
    int puppyAge;
    
    public Puppy (String name){
        //this constryctor has one parameter, <i>name</i>.
        System.out.println("Name chosen is :" +name);
    }
    
    public void setAge(int age){
        puppyAge = age;    
    }
    
    public int getAge () {
        System.out.println("Puppy's age is :" + puppyAge);
        return puppyAge;      
    }
    
    public static void main(String [] args){
        /* Object creation */
        Puppy myPuppy = new Puppy ( "tommy" );
        
        /* Call class method to set puppy's age */
        myPuppy.setAge( 2 );
        
        /* Call another class method tp get puppy's age */
        myPuppy.getAge( );
        
        /* You can acces instance variable as folows as well */
        System.out.println("Variable Value :" + myPuppy.puppyAge);
    }
}