public abstract class Animal implements IAnimal{
    String name;
    double valueJ;
    double valueS;
    double valueR;
    public boolean jump(double vj){
        return (valueJ>=vj);
    }
    public boolean swim(double vs){
        return (valueS>=vs);
    }
    public boolean run(double vr){
        return (valueR>=vr);
    }
    Animal(String name,  double valueR,double valueJ, double valueS){
        this.name = name;
        this.valueR = valueR;
        this.valueJ = valueJ;
        this.valueS = valueS;
    }
}
