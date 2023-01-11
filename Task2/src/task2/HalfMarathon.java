/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.util.ArrayList;


class HalfMarathon extends CharityRun{
    String name = "HalfMarathon";
    Venue venue;
    HalfMarathon(String dat, int no ,Venue p){
        venue = p;
        date = dat;
        startTime = no;
        entries = new ArrayList<RunEntry>();
    }
    public void addEntry(int n){
        RunEntry run = new RunEntry();
        run.setEventNumber(n);
        entries.add(run);
        
    }
   
  }
