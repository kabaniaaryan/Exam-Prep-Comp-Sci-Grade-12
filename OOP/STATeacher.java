package OOP;

public class STATeacher extends STAHero{
    //Properties
    int intPatienceLevel;
    public int intEmployeeNumber;

    //Overridng Methods
    public void talk(){
        System.out.println("I am talking as a teacher BLAH BLAH");

        //increasing experiecne
        this.intExperiecne += 1;
        
    }

    public void walk(String strDirection){
        System.out.println("Walking this way: "+strDirection);
        //increasing experiecne
        this.intExperiecne += 1;
    }

    //Teacher methods
    public void teach(){
        if(this.intPatienceLevel <= 3){
            System.out.println("I teach poorly");
        }else if(this.intPatienceLevel > 3 && this.intPatienceLevel <= 6){
            System.out.println("I am an alright teacher");
        }else if(this.intPatienceLevel > 6){
            System.out.println("I am a superb teacher");
        }
        //increasing experiecne
        this.intExperiecne += 1;
    }

    public int meditate(){
        this.intPatienceLevel += 1;

        //increasing experiecne
        this.intExperiecne += 1;

        return this.intExperiecne;
    }

    //Constructor
    public STATeacher(String strName, int intPL, int intEN){
        super(strName);
        this.intPatienceLevel = intPL;
        this.intEmployeeNumber = intEN;
    }
}
