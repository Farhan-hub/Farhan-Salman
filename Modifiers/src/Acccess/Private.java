/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acccess;

/**
 *
 * @author Farhan
 */
public class Private {
  private String fname = "Farhan Salman Al";
  private String lname = "Farhan";
  private String email = "alfarisi891@gmail.com";
  private int age = 24;
  
  public static void main(String[] args) {
    Private myObj = new Private();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
  }
}    

