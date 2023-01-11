package task2;

import java.util.*;
public class Task2{

    public static void main(String[] args){
       Scanner inp = new Scanner(System.in);
       List<FiveKmRun> run = new ArrayList<FiveKmRun>();
       List<HalfMarathon> hlf = new ArrayList<HalfMarathon>();
       List<Park> prk = new ArrayList<Park>();
       List<Town> tow = new ArrayList<Town>();
       Park p = new Park("Tokyo",6);
       Park p1 = new Park("Almaida",6);
       FiveKmRun five = new FiveKmRun("21-04-21",10,  p);
       five.addEntry(5);
       five.addEntry(9);
       five.addEntry(10);
       FiveKmRun five1 = new FiveKmRun("21-04-22",10,  p1);
       five1.addEntry(6);
       five1.addEntry(5);
       five1.addEntry(12);
       run.add(five);
       run.add(five1);
       Town t = new Town("Mona");
       tow.add(t);
       prk.add(p);
       prk.add(p1);
       HalfMarathon half = new HalfMarathon("21-04-22",9,p);
       HalfMarathon half2 = new HalfMarathon("21-04-22",8,t);
       half.addEntry(5);
       half2.addEntry(8);
       hlf.add(half);
       hlf.add(half2);
       List<Competitor> c = new ArrayList<Competitor>();
       Competitor c1 = new Competitor();
       c1.setAttributes("Abc", 14, 5);
       c.add(c1);
       Competitor c2 = new Competitor();
       c2.setAttributes("XYZ", 14, 6);
       c.add(c2);
       Competitor c3 = new Competitor();
       c3.setAttributes("MNP", 14, 7);
       c.add(c3);
       Competitor c4 = new Competitor();
       c4.setAttributes("XYZ", 14, 8);
       c.add(c4);
       Competitor c5 = new Competitor();
       c5.setAttributes("LOl", 14, 9);
       c.add(c5);
       Competitor c6 = new Competitor();
       c6.setAttributes("JNP", 14, 10);
       c.add(c6);
       Competitor c7 = new Competitor();
       c7.setAttributes("PQE", 14, 11);
       c.add(c7);
       Competitor c8 = new Competitor();
       c8.setAttributes("MLP", 14, 12);
       c.add(c8);
       int i = 0;
       do{
       System.out.println("List Events.........1");
           System.out.println("List Venues........2");
           System.out.println("Search Compettitors Entries.......3");
           System.out.print("Enter choice:>  ");
           System.out.println("Exit................0");
           //User input
           i = inp.nextInt();
           if (i == 1){
               System.out.println("FiveKmEvents  :\n");
               int count = 0;
               for (FiveKmRun f : run){
                   count++;
                   System.out.println(count +".  :"+ " FiveKmRun");
               }
               System.out.println("HalfMarathon Events  :\n");
               int k = count;
               for (HalfMarathon f : hlf){
                   count++;
                   System.out.println(count +".  :"+ " HalfMarathon ");
               }
               System.out.println("Select Event");
               int j = inp.nextInt();
               if (j > k){
                   int select =  j - k;
                   int m = 0;
                   for (HalfMarathon hal : hlf){
                       m++;
                       if (select == m){
                           System.out.println("Event Details  :\n");
                           System.out.println("HalfMarathon Venue:"+ hal.venue.name+ "   No of Enteries  :" + hal.entries.size() +" ");
                           
                       }  
                   }
                   
               }
               else{
                   int m = 1;
                   for (FiveKmRun hal : run){
                       if (j==m){
                           System.out.println("Event Details  :");
                           System.out.println("FiveKmRun Venue:"+ hal.venue.getName()+ "   No of Enteries  :" + hal.entries.size() +" ");
                           System.out.println("No of ChangingFacilities:"+ hal.venue.getNum()+" ");
                           
                       }
                        m++;
                   }
               }
           }
     
           if ( i == 2){
               System.out.println("Venue Details  :\n");
               int count = 0;
               for (Park v  : prk){
                   count++;
                   System.out.println(count +".  :"+ v.name +"   ");
               }
               int k = count ;
               
               for (Town v  : tow){
                   count++;
                   System.out.println(count +".  :"+ v.name +"   ");
               }
            
               System.out.println("Select Venue: ");
               int j = inp.nextInt();
               System.out.println(count +""+ k);
               if (j> k){
               int select = j-k;
                   int m = 0;
                   for (Town v : tow){
                       m++;      
                       if (select == m){
                           System.out.println("Event Details  :\n");
                           System.out.println("Venue:"+ t.getName()+ " ");
                           Boolean flag = false;
                           for (FiveKmRun hal : run){
                               if (hal.venue.name == v.name){
                                   System.out.println("Date:"+ hal.date +" " + " Start Time :" +hal.startTime);
                                   flag = true;
                               }
                           }
                           for (HalfMarathon hal : hlf){
                               if (hal.venue.name == v.name){
                                   System.out.println("Date:"+ hal.date +" " + " Start Time :" +hal.startTime);
                                   flag = true;
                               }
                           }
                           if (flag == false){
                               System.out.println("No Event Taking Place  :");
                           }            
                       }        
                   }
               }
               else{
                   int m = 1;
                   for (Park pr : prk){
                       if (j==m){
                           System.out.println("Venue Details  :");
                           System.out.println("Venue:"+ pr.name+ "   No of Changing Facilities  :" + pr.getNum() +" ");
                           Boolean flag = false;
                           for (FiveKmRun hal : run){
                               if (hal.venue.name == pr.name){
                                   System.out.println("Date:"+ hal.date +" " + " Start Time :" +hal.startTime);
                                   flag = true;
                               }
                           }
                           for (HalfMarathon hal : hlf){
                               if (hal.venue.name == pr.name){
                                   System.out.println("Date:"+ hal.date +" " + " Start Time :" +hal.startTime);
                                   flag = true;
                               }
                           }
                           if (flag == false){
                               System.out.println("No Event Taking Place  :");
                           }
                       }
                        m++;
                   }
               }
           }
            if(i== 3){
                System.out.println("Enter name to Search  :");
                Scanner myObj = new Scanner(System.in);
                String Search = myObj.nextLine();
                for (Competitor co: c){
                    if ( co.getName().toUpperCase().contains(Search.toUpperCase())){
                        System.out.println("Name :" + co.getName() + " Age :"+co.getAge());
                        Boolean flag = false;
                        for (FiveKmRun hal : run){
                               for (RunEntry e: hal.entries){
                                   if(e.eventNumber == co.number){
                                       System.out.println("FiveKmRun :" + hal.date + " :"+ hal.startTime);
                                   }
                               }
                           }
                           for (HalfMarathon hal : hlf){
                               for (RunEntry e: hal.entries){
                                   if(e.eventNumber == co.number){
                                       System.out.println("HalfMarathon :" + hal.date + " :"+ hal.startTime);
                                   }
                               }
                           }
                    }
                }
            }
       }while(i!=0);
        
    }
   
}
