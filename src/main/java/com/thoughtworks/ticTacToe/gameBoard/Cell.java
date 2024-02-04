package com.thoughtworks.ticTacToe.gameBoard;

import lombok.Builder;
import lombok.Data;

import java.util.Objects;

@Data
@Builder
public class Cell {
    private int xCoordinate;
    private int yCoordinate;
    @Builder.Default
    private String value="_";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cell cell = (Cell) o;
        return value.equals(cell.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xCoordinate, yCoordinate, value);
    }

}
