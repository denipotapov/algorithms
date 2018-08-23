package Data;

public class Matrix {

    // vector dot product
    public static double dot(double[] x, double[] y) {

        double dotProduct = 0;

        for (int i = 0; i < x.length; i++) {
            dotProduct += x[i] * y[i];
        }
        return dotProduct;
    }

    // matrix-matrix product
    public static double[][] mult(double[][] a, double[][] b) throws IllegalArgumentException{
        if (a[0].length != b.length) {
            throw new IllegalArgumentException("Matrices must be of size (n x m) and (m x p)");
        }

        double[][] mult = new double[a.length][b[0].length];

        for (int i = 0; i < mult.length; i++)
            for (int j = 0; j < mult[0].length; j++)
                for (int m = 0; m < a[0].length; m++) {
                    mult[i][j] += a[i][m] * b[m][j];
                }

        return mult;

    }


    // transpose
    public static double[][] transpose(double[][] a) {
        double[][] transposed = new double[a[0].length][a.length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++) {
                //transposed[i][j] = a[j][i];
            }

        return transposed;

    }
//
//    // matrix-vector product
//    public static double[] mult(double[][] a, double[] x) {
//
//    }
//
//    // vector-matrix product
//    public static double[] mult(double[] y, double[][] a) {
//
//    }
}
