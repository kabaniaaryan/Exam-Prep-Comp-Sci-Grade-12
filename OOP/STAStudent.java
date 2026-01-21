package OOP;

public class STAStudent extends STAHero{
    //Properties
    public double dblAverage;
    private String strMood;

    //Methods
    //Overriding methods
    public void talk(){
        System.out.println("I am talking blah blah");

        //increasing experiecne
        this.intExperiecne += 1;
        
    }

    public void walk(String strDirection){
        System.out.println("Walking this way: "+strDirection);
        //increasing experiecne
        this.intExperiecne += 1;
    }

    //Student methods
    public void study(){
        if(this.strMood == "sad"){
            System.out.println("too sad to study");
        }else{
            System.out.println("studying");
        }

        //increasing experiecne
        this.intExperiecne += 1;
    }

    public void study(String strUnit){
        System.out.println("I am studying: "+strUnit);
        //increasing experiecne
        this.intExperiecne += 1;
    }

    //Constructor
    public STAStudent(String strName, double dblAvg, String strMood){
        super(strName);

        this.dblAverage = dblAvg;
        this.strMood = strMood;
    }
}
