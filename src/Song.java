import java.util.ArrayList;
public class Song {
    private String title;
    private String artist;
    private ArrayList<String> oldNames;

    public Song(String title, String artist){
        this.title = title;
        this.artist = artist;
        this.oldNames = new ArrayList<String>();
    }

    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }
    public int howMany(ArrayList<String> inputArray){
       int count = 0;
       for (String listener: inputArray){
           listener = listener.toLowerCase();
           boolean found = false;
           for (String name: oldNames){
               if (name.equals(listener)){
                   found = true;
                   break;
               }
           }
           if (!found){
               oldNames.add(listener);
               count++;
           }
       }
       return count;

    }

}
