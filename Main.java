/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        
        // Create a sample tuition center with some students and tutors
        TuitionCenter tc1 = new TuitionCenter("Success Tuiton", new HeadMaster("Anna", "680514-08-8874", "Taman Rishah", 15));

        Tutor t1 = new Tutor("Lee", "851030-08-1025", "Taman Indah", "Degree", 3, 2);
        Tutor t2 = new Tutor("Mina", "9207303-08-1135", "Taman Mutiara", "Degree", 4, 3);
        
        List<Integer> scores1 = new ArrayList<>();
        scores1.add(90);
        scores1.add(80);
        scores1.add(70);
        Student s1 = new Student("Farah", "040810-08-2420", "Taman Pengkalan Jaya", 2022, "SMK Convent", scores1);
        
        List<Integer> scores2 = new ArrayList<>();
        scores2.add(85);
        scores2.add(75);
        scores2.add(65);
        Student s2 = new Student("Adam", "040128-08-1116", "Taman Seri Permai", 2022, "SMK Anderson", scores2);
        
        tc1.addTutor(t1);
        tc1.addTutor(t2);
        tc1.addStudent(s1);
        tc1.addStudent(s2);

        // Generate the performance report for the tuition center
        int numStudents = tc1.getStudents().size();
        int numTutors = tc1.getTutors().size();
        double averageMarks = tc1.getAverageMarks();
        System.out.println("Tuition Center: " + tc1.getTutors());
        System.out.println("# Students: " + numStudents);
        System.out.println("# Tutors: " + numTutors);
        System.out.println("Average Marks: " + averageMarks);
    }
}