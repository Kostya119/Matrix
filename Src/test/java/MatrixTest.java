import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    @Test
    void isSquareMatrix_WhenMatrixIsNull_ReturnsFalse() {
        Matrix matrix = new Matrix();
        int[][] nullMatrix = null;

        assertFalse(matrix.isSquareMatrix(nullMatrix));
    }

    @Test
    void isSquareMatrix_WhenMatrixIsSquare_ReturnsTrue() {
        Matrix matrix = new Matrix();
        int[][] squareMatrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        assertTrue(matrix.isSquareMatrix(squareMatrix));
    }

    @Test
    void isSquareMatrix_WhenMatrixIsNotSquare_ReturnsFalse() {
        Matrix matrix = new Matrix();
        int[][] nonSquareMatrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };

        assertFalse(matrix.isSquareMatrix(nonSquareMatrix));
    }

    @Test
    void isSquareMatrix_WhenMatrixIsEmpty_ReturnsTrue() {
        Matrix matrix = new Matrix();
        int[][] emptyMatrix = new int[0][0];

        assertTrue(matrix.isSquareMatrix(emptyMatrix));
    }

    @Test
    void getAverageCountArray_ReturnsCorrectAverage() {
        Matrix matrix = new Matrix();
        int[] array = { 1, 2, 3, 4, 5 };

        double average = matrix.getAverageCountArray(array);
        assertEquals(3.0, average);
    }
}