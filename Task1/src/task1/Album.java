package task1;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class Album {
    String title;
    String artist;
    int year;
    String sales;
    List<String> tracks;
    
    
    Album(){
    tracks = new ArrayList<String>();
    }

    String getTitle(){
        
      return this.title;  
    }
    
    String getArtist(){
        
        return this.artist;
    }
    
    int getYear(){
        
       return this.year; 
    }
    
    String getSales() {
        
       return this.sales; 
    }
    
    List<String> getTracks(){
        
        return this.tracks;
    }
    
    public static void toString(int a){
        
    }
    
    public static void main(String[] args) {
        List<Album> album = new ArrayList<Album>();
        try {
            //Getting Data from file album.txt
            File myObj = new File("albums.txt");
            Scanner myReader = new Scanner(myObj);
            Album obj = new Album();
            Boolean complete = true;
            while (myReader.hasNextLine()) {   
                String data = myReader.nextLine();
                if(complete){
                    complete = false;
                    String[] info = data.split(":");
                    obj.title = info[1];
                    obj.artist = info[2];
                    obj.year = Integer.parseInt(info[3]);
                    obj.sales = info[4];      
                }else if(Character.isLetter(data.charAt(0)) || Character.isDigit(data.charAt(0))  ) {
                    obj.tracks.add(data);
                }else{
                    album.add(obj);
                    obj = new Album();
                    complete = true;
                }
        }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        Scanner inp = new Scanner(System.in); 

        int i=0;
        do{
           System.out.println("List albums.........1");
           System.out.println("Select album........2");
           System.out.println("Search titles.......3");
           System.out.println("Exit................0");
           System.out.print("Enter choice:>  ");
           //User input
           i = inp.nextInt();
           if (i == 1){
               //Show All Albums
               System.out.println("--------------------------------------------------------------------------------------------------------------");
               System.out.format("| Rank | Title %48s | Artist %20s | Year | Sales |%n","","");
               System.out.println("--------------------------------------------------------------------------------------------------------------");
               int index = 1;
               for(Album a: album){
                   a.listAlbum(index);
                   index++;
               }
               System.out.println("--------------------------------------------------------------------------------------------------------------");
           }
           // List Selected Album
           if ( i == 2){
               System.out.print("Enter album rank from list [1 - 20] :> ");
               int albumRank = inp.nextInt();
               Album a  = album.get(albumRank - 1);
               a.selectAlbum();           
             }
           
            if(i== 3){
                System.out.print("Search word or phrase > ");
                Scanner myObj = new Scanner(System.in);
                String SearchTrack = myObj.nextLine();
                Boolean firstTime = true;
                int count = 1;
                for(Album a: album){   
                    a.searchTrack(SearchTrack);
                }
               
            }
            System.out.println();
           
        }while(i!=0);       
    }
    public void searchTrack(String SearchTrack){
        Boolean firstTime = true;
        int count = 1;
        //Searching the required word pr phrase
        for (String track: this.getTracks()){
            if ( track.toUpperCase().contains(SearchTrack.toUpperCase())){
                if (firstTime){
                    this.formatForSearch();
                    firstTime = false;
                }
                String [] data = track.split("\\s*[()]\\s*");
                System.out.println("Track "+count+". "+data[0]);            
            }
                       
            count++;
        }
        
    }
    public void formatForSearch(){
        //Searching Format
        System.out.println("");
        System.out.println("----");
        System.out.format("Artist%-1s"+"("+(this.getArtist())+")"+" Album%-1s"+"("+(this.getTitle())+")"+"\n","","");
        System.out.println("Matching Song title(s):");
        System.out.println("----");  
                    
    }
    public void selectAlbum(){
        formatForSelection();
        int count =1;
        for(String track: this.getTracks()){
            //Spliting minutes, seconds and Track title
            String [] data = track.split("\\s*[()]\\s*");
            String [] time = data[1].split(":") ;
            //Getting Spaces for displaying output      
            int countDigit = 0, num = count;
            while (num != 0) {
                num /= 10;
                ++countDigit;
            }
            int spaceRank = 3 - countDigit;
            String space= Integer.toString(spaceRank);
                   
            int countTitle = 0;
            int spaceTitleCount = 80 - data[0].length();
            String spaceTitle = Integer.toString(spaceTitleCount);
            //Display output
            System.out.format("|%2s"+(count)
                             +"%"+space+"s|%1s"+(data[0])
                             +"%"+spaceTitle+"s|%2s"+
                             time[0]+"%3s|%2s"+time[1]+
                             "%2s|","","","","","","","","");
            System.out.println();
            count++;
        }
    }
    public void formatForSelection(){
        //Album Details format
        System.out.format("Album Title:%-20s"+(this.getTitle())+"\n","");
        System.out.format("Artist:%-25s"+(this.getArtist())+"\n","");
        System.out.format("Year of release:%-16s"+(this.getYear())+"\n","");
        System.out.format("Sales to date:%-18s"+(this.getSales())+"\n","");
        System.out.println("");
        System.out.println("Track List");
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.format("| No. | Title %73s | Mins | Secs |%n","","");
        System.out.println("-------------------------------------------------------------------------------------------------------");
        
    }
    public void listAlbum(int index){
        
        //Getting Spaces count to show output
        int countDigit = 0, numRank = index;
        while (numRank != 0) {
            numRank /= 10;
            ++countDigit;
        }
        int spaceRank = 4 - countDigit;
        String ssRank= Integer.toString(spaceRank);

        int spaceTitle = 55 - this.getTitle().length();
        String spTitle = Integer.toString(spaceTitle);
                   
                  
        int spaceArtist = 28 - this.getArtist().length();
        String spArtist = Integer.toString(spaceArtist);
                   
             
        int spaceSales = 6 - this.getSales().length();
        String spSales = Integer.toString(spaceSales);
        //Displating Album Details
        System.out.format("|%2s"+(index)
                         +"%"+ssRank+"s|%1s"+(this.getTitle())
                         +"%"+spTitle+"s|%1s"+(this.getArtist())
                         +"%"+spArtist+"s|%1s"+(this.getYear())
                         +" |%1s"+(this.getSales())
                         +"%"+spSales+"s|%n","","","","","","","","","","");
    }
}
