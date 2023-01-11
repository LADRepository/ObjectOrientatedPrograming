/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

 class Competitor{
      String name;
      int age;
      int  number;
      public void setAttributes(String Name,int age,int  number){
          name = Name;
          this.age = age;
          this.number= number;
          
      }
      public String getName(){
          return name;
      }
      public int getAge(){
          return age;
      }
 }
