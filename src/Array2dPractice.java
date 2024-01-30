public class Array2dPractice {

    // Declare all methods as static.

    // 1. sumAllCells
    public static int sumAllCells(int[][] array){
        int sum = 0;
        for (int[] row : array){
            for (int col : row){
                sum += col;
            }
        }
        return sum;
    }
    // 2. sumRowN

    public static int sumRowN(int[][] array, int row){
        int sum = 0;
        for (int i = 0; i < array[row].length; i++){
            sum += array[row][i];
        }
        return sum;
    }
    // 3. sumColN

    public static int sumColN(int[][] array, int col){
        int sum = 0;
        for (int[] row : array) {
            sum += row[col];
        }
        return sum;
    }
    // 4. sumAllCellsBetween
    public static int sumAllCellsBetween(int[][] array, int firstRow, int firstCol, int secondRow, int secondCol){
        int sum = 0;

        //if on same row
        if(firstRow == secondRow){
            for(int i = firstCol; i <= secondCol; i++){
                sum += array[firstRow][i];
            }
            return sum;
        }
        //if first cell and second cell on different rows
        else{
            //first row
            for (int i = firstCol; i < array[firstRow].length; i++){
                sum += array[firstRow][i];
            }
            //middle rows between first row and second row
            for (int row = firstRow + 1; row < secondRow; row++){
                sum += sumRowN(array, row);
            }
            //last row
            for (int j = 0; j <= secondCol; j++){
                sum += array[secondRow][j];
            }
        }
        return sum;
    }
}
