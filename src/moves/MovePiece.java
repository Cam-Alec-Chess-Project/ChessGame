package moves;

import javax.swing.*;
import java.util.*;


public class MovePiece extends JPanel {
    private int x = -1;
    private int y = -1;
    private Map<Integer,Integer>saveLoc = new HashMap<>(); // ** make private later **
    //Map<Integer, Integer> save = new HashMap<>();

    public Map<Integer, Integer> getSaveLoc() {
        return saveLoc;
    }

    public void movePieceLocation(int x, int y)
    {
        this.x = y;
        this.y = x;
        System.out.println("X location " + x + " Y location " + y);
    }

    //stores the original location of the chess pieces
    public Map<Integer, Integer> savePieceLocation(int x, int y, Map<Integer, Integer>map)
    {
        map = this.saveLoc;
        map.put(x,y);
        System.out.println("Values X:" + x + " Y: " + y + "have been put into the Hashmap");
        System.out.println(saveLoc);
        //saveData();
        return map;
    }

    public void updatePieceLocation(int x, int y, Map<Integer, Integer>map)
    {
        map = this.saveLoc;
        System.out.println(map);
        }
     public Map<Integer, Integer> saveData()
     {
         Map<Integer, Integer>map = new HashMap<Integer,Integer>();
         map = this.saveLoc;
         System.out.println("Save Data Method: " + map);
         return map;
     }

}
