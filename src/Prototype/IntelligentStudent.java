package Prototype;

public class IntelligentStudent extends Student{

    public int iq;

    public IntelligentStudent()
    {

    }

    public IntelligentStudent(IntelligentStudent intelligentStudent)
    {
        super(intelligentStudent);
        this.iq = intelligentStudent.iq;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    @Override
    public IntelligentStudent clone()
    {
        return new IntelligentStudent(this);
    }
}
