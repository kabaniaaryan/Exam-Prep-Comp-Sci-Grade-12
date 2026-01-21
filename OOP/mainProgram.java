package OOP;

public class mainProgram {
    public static void main(String[] args){
        //Creating teacher 1
        STATeacher cadawas = new STATeacher("cadawas", 10, 6767);

        String strNameC = cadawas.strName;
        System.out.println(strNameC);
        int intENC = cadawas.intEmployeeNumber;
        System.out.println(intENC);
        cadawas.teach();
        cadawas.talk();
        cadawas.walk("backward");
        cadawas.meditate();
        int intPLC = cadawas.intPatienceLevel;
        System.out.println(intPLC);
        int intELC = cadawas.intExperiecne;
        System.out.println(intELC);

        System.out.println("\n\n\n");

        //Creating teacher 2
        STATeacher henin = new STATeacher("henin", 1, 4141);

        String strNameH = henin.strName;
        System.out.println(strNameH);
        int intENH = henin.intEmployeeNumber;
        System.out.println(intENH);
        henin.teach();
        henin.talk();
        henin.walk("forward");
        henin.meditate();
        int intPLH = henin.intPatienceLevel;
        System.out.println(intPLH);
        int intELH = henin.intExperiecne;
        System.out.println(intELH);

        System.out.println("\n\n\n");

        //Creating student 1
        STAStudent aaryan = new STAStudent("aaryan", 99, "sad");

        String strNameA = aaryan.strName;
        System.out.println(strNameA);
        double dblAverageA = aaryan.dblAverage;
        System.out.println(dblAverageA);
        aaryan.study();
        aaryan.walk("left");
        aaryan.talk();
        aaryan.study("Comp sci");
        int intELA = aaryan.intExperiecne;
        System.out.println(intELA);

        System.out.println("\n\n\n");

        //Creating student 2
        STAStudent rayya = new STAStudent("rayya", 100, "happy");

        String strNameR = rayya.strName;
        System.out.println(strNameR);
        double dblAverageR = rayya.dblAverage;
        System.out.println(dblAverageR);
        rayya.study();
        rayya.walk("right");
        rayya.talk();
        rayya.study("biology");
        int intELR = rayya.intExperiecne;
        System.out.println(intELR);
    }
}
