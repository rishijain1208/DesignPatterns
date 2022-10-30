package Pens.Pen;

import Pens.Ink;
import Pens.Nib;
import Pens.WriteStrategy.IWriteStrategy;

public class FountainPen extends Pen{

    public FountainPen(IWriteStrategy writeStrategy)
    {
        super(writeStrategy);
    }
    private Ink ink;

    private Nib nib;

    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public Nib getNib() {
        return nib;
    }

    public void setNib(Nib nib) {
        this.nib = nib;
    }

    @Override
    public void write() {

    }
}
