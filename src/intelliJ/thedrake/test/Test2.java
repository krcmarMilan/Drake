package intelliJ.thedrake.test;

import intelliJ.thedrake.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test2 {
    @Test
    void TroopInfoTest() {
        TroopInfo info = new TroopInfo("Drake", new Offset2D(0, 0));
        assertTrue(info.pivot(TroopFace.FRONT).equalsTo(0, 0));
        assertTrue(info.pivot(TroopFace.BACK).equalsTo(0, 0));

        TroopInfo info2 = new TroopInfo("Drake");
        assertTrue(info2.pivot(TroopFace.FRONT).equalsTo(1, 1));
        assertTrue(info2.pivot(TroopFace.BACK).equalsTo(1, 1));
    }

    @Test
    void tilesTest() {
        TroopInfo drakeInfo = new TroopInfo("Drake");
        Troop drake = new Troop(drakeInfo, PlayingSide.ORANGE, TroopFace.FRONT);

        TilePosition b2 = new TilePosition("b2");
        Tile emptyTile = new EmptyTile(b2);
        assertSame(b2, emptyTile.position());
        assertTrue(emptyTile.acceptsTroop(drake));
        assertFalse(emptyTile.hasTroop());
        //try{ emptyTile.troop(); fail(); } catch(UnsupportedOperationException e) {};

        TilePosition c3 = new TilePosition("c3");
        Tile troopTile = new TroopTile(c3, drake);
        assertSame(c3, troopTile.position());
        assertFalse(troopTile.acceptsTroop(drake));
        assertTrue(troopTile.hasTroop());
        assertSame(drake, troopTile.troop());
    }

}