package NivelFacil.Array;

public class ArrayMultidimensional {
    static void main(String[] args) {
        int[][] array = new int[3][3];

        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;

        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;

        array[2][0] = 7;
        array[2][1] = 8;
        array[2][2] = 9;

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i][0] + " " + array[i][1] + " " + array[i][2]);
        }
    }
}
