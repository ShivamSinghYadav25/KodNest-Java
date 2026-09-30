
import java.util.*;

public class studentMarks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks1 = sc.nextInt();
        int marks2 = sc.nextInt();
        int marks3 = sc.nextInt();
        int marks4 = sc.nextInt();
        int marks5 = sc.nextInt();
        int totalMarks = marks1 + marks2 + marks3 + marks4 + marks5;
        double percentage = (totalMarks / 500) * 100;

        boolean valid = (marks1 >=0 && marks1<=100)
                        &&(marks2 >=0 && marks2<=100)
                        &&(marks3 >=0 && marks3<=100)
                        &&(marks4 >=0 && marks4<=100)
                        &&(marks5 >=0 && marks5<=100);

        String res = (percentage <40)?"Fail": (percentage >=40 && percentage <60)?"Pass": (percentage>=60 && percentage <75)?"First Class": "Distinction";
        System.out.println(res);

        String eli= (marks1>=75 && percentage>=85)? "Eligible for Scholarship" :
        (marks2>=75 && percentage>=85)?"Eligible for Scholarship" :
        (marks3>=75 && percentage>=85)?"Eligible for Scholarship" :
        (marks4>=75 && percentage>=85)?"Eligible for Scholarship" :
        (marks5>=75 && percentage>=85)?"Eligible for Scholarship" :
        "Not Eligible for Scholarship";
        
        System.out.println(eli);
        sc.close();
    }
}
