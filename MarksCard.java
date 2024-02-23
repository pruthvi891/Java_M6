import java.util.Scanner;

class MarksCard{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        String  name;
        String usn;
        int m1=78; int m2=67; int m3=87; int m4=67; int m5=56;
        int tm=m1+m2+m3+m4+m5;

        //Total Subjects
        String s1="1. Data Science";
        String s2="2. AIML";
        String s3="3. Java Programming";
        String s4="4. Python Programming";
        String s5="5. Cyber Security";

      String [] sb = {s1, s2, s3, s4, s5};
        int sub = sb.length;



        float perc=(tm*100)/500;
        String grade = (perc>=0 && perc<35)?("F"):
                (perc>= 35&& perc<45)?("C"):
                (perc>= 45&& perc<55)?("C+"):
        (perc>= 55&& perc<65)?("B"):
        (perc>= 65&& perc<75)?("B+"):
        (perc>= 75&& perc<85)?("A"):
        (perc>= 85&& perc<=100)?("A+"):("");

//        System.out.println("Enter your Name:\n");
//        name=sc.nextLine();
        System.out.println("Enter your USN:\n");
        usn= sc.nextLine();
        String val = (usn.length()==10)?(""):("Please enter valid One !");


        System.out.println("Result is Loading...\n");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tVisvesvaraya Technological university, Belagavi".toUpperCase());
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tCambridge Institute of Technology North Campus, Bangalore");
        System.out.println("");
        System.out.println("");
        System.out.print("Name: Pruthviraj Patole");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tDate: 21/02/2024");
        System.out.println("");
        System.out.print("USN: "+usn);
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSection: B");
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tExam: March/April");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.print("Subject");

        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tTotal Marks");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tMarks Obtained");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");


        System.out.println("");
        System.out.println("");

        System.out.println(s1+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t100\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+m1);
        System.out.println(s2+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t100\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+m2);
        System.out.println(s3+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t100\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+m3);
        System.out.println(s4+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t100\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+m4);
        System.out.println(s5+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t100\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+m5);
        System.out.println("");
        System.out.println("");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.print("Total Subjects: "+sub);
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t   Total Marks: "+(sub*100));
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\tTotal Marks Obtained: "+tm);
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("");
        System.out.print("Percentage: "+perc+" %");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tGrade: "+grade);

        System.out.println("");
        System.out.print("Remark: ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSignature:");
    }

}
