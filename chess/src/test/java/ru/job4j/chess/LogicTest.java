package ru.job4j.chess;


import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
public class LogicTest {

    @Test(expected = FigureNotFoundException.class)
    public void whenNotFound() throws OccupiedCellException, FigureNotFoundException {
        Logic test = new Logic();
        test.add(new BishopBlack(Cell.C1));
        test.move(Cell.A4, Cell.C8);
    }

    @Test(expected = OccupiedCellException.class)
    public void whenOccupied() throws OccupiedCellException, FigureNotFoundException {
        Logic test = new Logic();
        test.add(new BishopBlack(Cell.C1));
        test.add(new BishopBlack(Cell.D2));
        test.add(new BishopBlack(Cell.E3));
        test.move(Cell.C1, Cell.E3);
        }

    @Test(expected = ImpossibleMoveException.class)
    public void whenImpossibleMove() throws OccupiedCellException, FigureNotFoundException {
        Logic test = new Logic();
        test.add(new BishopBlack(Cell.B1));
        test.move(Cell.B1, Cell.B2);
    }
}