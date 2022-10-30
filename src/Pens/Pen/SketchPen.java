package Pens.Pen;

import Pens.Refill;
import Pens.WriteStrategy.IWriteStrategy;

public class SketchPen extends Pen{

    public SketchPen(IWriteStrategy writeStrategy)
    {
        super(writeStrategy);
    }
    private Refill refill;

    public Refill getRefill() {
        return refill;
    }

    public void setRefill(Refill refill) {
        this.refill = refill;
    }

    @Override
    public void write() {

    }
}
