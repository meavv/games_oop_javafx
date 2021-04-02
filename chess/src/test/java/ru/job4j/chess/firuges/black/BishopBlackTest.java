package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void position() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Cell rsl = bishopBlack.position();
        Cell excepted = Cell.A1;
        assertEquals(excepted, rsl);
    }

    @Test
    public void copy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Figure bishopBlack1 = bishopBlack.copy(Cell.D4);
        Cell rsl = bishopBlack1.position();
        Cell excepted = Cell.D4;
        assertEquals(excepted, rsl);
    }

    @Test
    public void way() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        String excepted = ("[D2, E3, F4, G5]");
       assertEquals(excepted, Arrays.toString(bishopBlack.way(Cell.G5)));
    }

    @Test
    public void backWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.G5);
        String excepted = ("[F4, E3, D2, C1]");
        assertEquals(excepted, Arrays.toString(bishopBlack.way(Cell.C1)));
    }

    @Test (expected = ImpossibleMoveException.class)
    public void noWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] rsl = bishopBlack.way(Cell.D4);
    }
}