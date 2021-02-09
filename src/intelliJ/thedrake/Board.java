package intelliJ.thedrake;

public class Board {

    private int dimension;
    private Tile[] tiles;

    // Konstruktor. Vytvoří čtvercovou hrací desku zadaného rozměru se specefikovanými dlaždicemi.
    // Všechny ostatní dlažice se berou jako prázdné.

    public Board(int dimension, Tile... tiles){
        this.dimension = dimension;
        this.tiles = tiles;
    }

    // Rozměr hrací desky
    public int dimension(){
        return dimension;
    }

//    // Vrací dlaždici na zvolené pozici. Pokud je pozice mimo desku, vyhazuje IllegalArgumentException
//    public Tile tileAt(TilePosition position){
//        return
//    }
//
//    // Ověřuje, že pozice se nachází na hrací desce
//    public boolean contains(TilePosition... positions){
//
//    }

    // Vytváří novou hrací desku s novými dlaždicemi z pole tiles. Všechny ostatní dlaždice zůstávají stejné
    public Board withTiles(Tile... tiles){
        return new Board(dimension(),tiles);
    }
}

