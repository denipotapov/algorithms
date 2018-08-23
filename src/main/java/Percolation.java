import Data.Matrix;

import java.util.Arrays;
import java.util.stream.DoubleStream;

public class Percolation {

    public static void main(String[] args) {

//        double dotP;
//        dotP = Matrix.dot(new double[]{-1,4,5}, new double[]{6,4,2});
//        System.out.printf("Result is %f", dotP);

        double[][] a = new double[][]{{1,2},
                                      {4,6},
                                      {7,8},
                                      {2,3}};
        double[][] b = new double[][]{{1,2,3},
                                      {1,5,6}};

        double[][] multRes = Matrix.mult(a,b);
        Arrays.stream(multRes).forEach(x -> {
            DoubleStream.of(x).forEach(s -> System.out.printf("%f ", s));
            System.out.println();
        });

        Arrays.stream(Matrix.transpose(a)).forEach(x -> {
            DoubleStream.of(x).forEach(s -> System.out.printf("%f ", s));
            System.out.println();
        });
    }


}
