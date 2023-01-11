/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.util.ArrayList;

class FiveKmRun extends CharityRun{
    String name = "FiveKmRun";
    Park venue;
    FiveKmRun(String dat, int start, Park v){
        
        date = dat;
        venue = v;
        startTime = start;
        entries = new ArrayList<RunEntry>();
    }
    public void addEntry(int n){
        RunEntry run = new RunEntry();
        run.setEventNumber(n);
        entries.add(run);
        
    }

   
      
 }
