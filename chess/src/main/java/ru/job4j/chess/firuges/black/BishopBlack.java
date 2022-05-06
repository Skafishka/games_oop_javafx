package ru.job4j.chess.firuges.black;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell ps) {
        position = ps;
    }

    @Override
    public Cell position() {
        return position;
    }

    @Override
    public Cell[] way(Cell dest) {
        int size = Cell.C1.getX() - dest.getX();
        size = Math.abs(size);
        Cell[] steps = new Cell[size];
        int x = Cell.C1.getX();
        int y = Cell.C1.getY();
        int deltaX = x < dest.getX() ? 1 : -1;
        int deltaY = y > position().getY() ? -1 : 1;
        for (int index = 0; index < size; index++) {
            x += deltaX;
            y += deltaY;
            steps[index] = Cell.findBy(x, y);
            System.out.println(steps[index]);
        }
        return steps; /*
        throw new ImpossibleMoveException(
                String.format("Could not way by diagonal from %s to %s", position, dest)
        ); */


    }

    public boolean isDiagonal(Cell source, Cell dest) {
        return false;
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}
