/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Ahsan
 */
public abstract class CharityRun{
      
      String date;
      int startTime;
      List<RunEntry> entries;
      
      abstract public void addEntry(int n);
      
  }
