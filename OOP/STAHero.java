package OOP;

public abstract class STAHero{

    //Properties
    public String strName;
    public int intExperiecne = 0;

    //Methods
    public abstract void talk();
    public abstract void walk(String strDirection);

    //Constructor
    public STAHero(String strName){
        this.strName = strName;
    }
    
}
