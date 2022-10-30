package Pens;

import Pens.Pen.BallPen;
import Pens.Pen.Pen;
import Pens.WriteStrategy.SmoothWriteStrategy;

public class Main {

    public static void main(String[] args) {
        Pen triMax = new BallPen(new SmoothWriteStrategy());
        triMax.write();
    }
}
