import java.util.Scanner;

public class Student_Grade_Calculator{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of subjects : ");
    int Total_Subjects = sc.nextInt();
    int Total_Marks = 0 ;

    for( int i=0; i< Total_Subjects; i++){
      System.out.println("Enter obtained marks in subjects "+ (i+1)+ " : ");
      int marks =sc.nextInt();
      Total_Marks += marks ; 
    }

    int Average_Percenteage = Total_Marks / Total_Subjects ;
    Grade_Calculation g = new Grade_Calculation();

    System.out.println("Total marks is " + Total_Marks );
    System.out.println("Average percentage is " + Average_Percenteage + "%");
    System.out.println("Corresponding grade is " + g.Grade(Average_Percenteage));
  }
} 

class Grade_Calculation{
  public String Grade(int Average_Percenteage){
    int grade = Average_Percenteage /10 ;

    if( grade == 10)
    return "O";
    else if(grade == 9)
    return "E";
    else if(grade == 8)
    return "A+";
    else if(grade == 7)
    return "A";
    else if(grade == 6)
    return "B";
    else if(grade == 5)
    return "C";
    else if(grade == 4)
    return "D";
    else
    return "F";
  }
}