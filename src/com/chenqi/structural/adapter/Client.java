package com.chenqi.structural.adapter;

/**
 * @author chen qi
 * @description : test
 * @date: 2021-04-06 16:26
 */
public class Client {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(3);
        if (roundHole.fits(roundPeg)) {
            System.out.printf("Round peg radius %s fit round hole radius %s ", roundPeg.getRadius(), roundHole.getRadius());
            System.out.println();
        }

        SquarePeg smallSquarePeg = new SquarePeg(6);
        SquarePeg largeSquarePeg = new SquarePeg(20);

        SquarePegAdapter smallAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeAdapter = new SquarePegAdapter(largeSquarePeg);
        System.out.printf("Square peg radius %s fit round hole radius %s result:%s", smallAdapter.getRadius(),
                roundHole.getRadius(), roundHole.fits(smallAdapter));
        System.out.println();
        System.out.printf("Square peg radius %s fit round hole radius %s result:%s", largeAdapter.getRadius(),
                roundHole.getRadius(), roundHole.fits(largeAdapter));
    }
}
