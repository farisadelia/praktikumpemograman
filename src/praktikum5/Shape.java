/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author Adel
 */
public abstract class Shape {
  protected String shapeName;
  //---------------------------------- 
  //Constructor: Sets up the shape. 
  //----------------------------------
  protected Shape(String name) {
    shapeName = name;
  }
  //----------------------------------------- 
  //Returns the surface area of the shape. 
  //-----------------------------------------
  protected abstract double area();
  //----------------------------------- 
  //Returns the shape as a String. 
  //-----------------------------------
  public String toString() {
    return shapeName;
  }
}
