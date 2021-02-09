package  intelliJ.thedrake;


public class Troop {


    private final TroopInfo info;
    private final PlayingSide side;
    private final TroopFace face;


    // Konstruktor
    public Troop(TroopInfo info, PlayingSide side, TroopFace face) {
        this.info = info;
        this.side = side;
        this.face = face;
    }

    // Info o jednotce
    public TroopInfo info(){
        return info;
    }

    // Barva, za kterou jednotka hraje
    public PlayingSide side(){
        return side;
    }

    // Kterou stranou je jednotka otočena nahoru
    public TroopFace face(){
        return face;
    }

    // Pivot té strany, kterou je zrovna jednotka otočena nahoru
    public Offset2D pivot(){
        return info().pivot(face);
    }

    // Vytvoří jednotku, která má stejné vlastnosti jako tato, jen je otočena druhou stranou nahoru.
    public Troop flipped(){
        if(side().equals(PlayingSide.BLUE)){
            return new Troop(info(),PlayingSide.ORANGE,TroopFace.BACK);
        }
        return new Troop(info(),PlayingSide.BLUE,TroopFace.FRONT);
    }
}
