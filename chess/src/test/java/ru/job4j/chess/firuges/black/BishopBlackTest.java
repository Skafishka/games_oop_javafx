package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import java.util.Arrays;

public class BishopBlackTest {

    @Test
    public void whenExistPosition() {
        BishopBlack test = new BishopBlack(Cell.A1);
        assertThat(test.position(), is(Cell.A1));
    }

    @Test
    public void whenCopy() {
        BishopBlack test = new BishopBlack(Cell.A2);
        test.copy(Cell.A2);
        assertThat(test.position(), is(Cell.A2));
    }

    @Test
    public void whenWay() {
        Figure bishopBlack = new BishopBlack(Cell.C1);
        Cell[] whenWay = bishopBlack.way(Cell.G5);
        assertThat(Arrays.toString(whenWay), is("[D2, E3, F4, G5]"));
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenNonDiagonal() {
        Figure bishopBlack = new BishopBlack(Cell.C2);
        Cell[] whenWay = bishopBlack.way(Cell.G5);
    }
}