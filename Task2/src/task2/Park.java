/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;


class Park extends Venue{
       int numChangingFacilities;
       Park(String n, int num){
           name = n;
           numChangingFacilities = num ;
           
       }
       
       public String getName(){
           return name;
       }
       public int getNum(){
           return numChangingFacilities;
       }
       
   }
