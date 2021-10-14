package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void position() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
       Cell rez = bishopBlack.position();
        assertThat(rez, is(Cell.A1));
    }

    @Test
    public void copy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Figure copy = bishopBlack.copy(Cell.D4);
        Cell rez = copy.position();
        assertThat(rez, is(Cell.D4));
    }

    @Test
    public void way() {
        BishopBlack position = new BishopBlack(Cell.C1);
        Cell[] rez = position.way(Cell.G5);
        Cell[] expected = new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(rez, is(expected));
    }

    @Test (expected = ImpossibleMoveException.class)
    public void testWay() {
        BishopBlack position = new BishopBlack(Cell.C1);
        Cell[] rez = position.way(Cell.G6);
        Cell[] expected = new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(rez, is(expected));

    }
}