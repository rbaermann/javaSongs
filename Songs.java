import java.util.HashMap;
import java.util.Set;
public class Songs {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Campfire Song Song", "C-A-M-P-F-I-R-E-S-O-N-G Song, and if you don't think that we can sing it faster then you're wrong, but it will help if you just sing along!");
        trackList.put("Ripped Pants", "Spongebob turned into a clone, and no girl ever wants to get, with a fool who went and, ripped his pants");
        trackList.put("F.U.N. Song", "F stand for Fire, burns down the whole town! U is uranium, bombs! N is for no survivors, when you!...");
        trackList.put("Stripped Sweater", "One with a collar, turtle neck, thats the kind. CAUSE WHEN YOU WEAR THAT... one... special... sweater...");

        System.out.println(trackList.get("Ripped Pants"));

        Set<String> Lyrics = trackList.keySet();
        for(String Track : Lyrics) {
            System.out.println(Track);
            System.out.println(trackList.get(Track));
        }
    }
}