/*
 * Copyright (c) 2022
 * For Nix
 */

import static java.lang.System.out;

/**
 * The class shows how the maxArea() method works.
 *
 * @author Alexander Tuleninov
 * @version 01
 */
public class AppContainerWithMostWater {
    public static void main(String[] args) {
        int[] input = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        out.println("maxArea: " + MaxArea.maxArea(input));
        out.println("O(n); O(1)");
    }
}
