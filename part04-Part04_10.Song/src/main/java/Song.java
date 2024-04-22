public class Song {
    private String name;
    private int length;
    public Song(String songName, int songLength){
        this.name = songName;
        this.length = songLength;
    }
    public String name(){
        return name;
    }
    public int length(){
        return length;
    }

}
