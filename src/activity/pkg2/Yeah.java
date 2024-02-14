/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity.pkg2;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 *
 * @author Student
 */
public class Yeah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] Yeah = {16, 28, 1930, 8, 13};

        System.out.println("Print Array = " + Arrays.toString(Yeah));

        int sum = IntStream.of(Yeah).sum();

        System.out.println("The sum is: " + sum);

        int max = 0;
        max = Math.max(Yeah[0], Math.max(Yeah[1], Math.max(Yeah[2], Math.max(Yeah[3], Yeah[4]))));

        System.out.println("Maximum Value: " + max);

    }

}