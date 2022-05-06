package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BishopBlackTest {


    @Test
    public void whenExistPosition() {
        BishopBlack test = new BishopBlack(Cell.A1);
        System.out.println(test);
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

        Cell dest = Cell.G5;
        BishopBlack test = new BishopBlack(dest);
        System.out.println(test.way(dest));


    }


}