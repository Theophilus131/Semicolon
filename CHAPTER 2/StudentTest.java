public class StudentTest{
public static void main(String [] args){

Student account1 = new Student("Jane Green", 93.5);
Student account2 = new Student("John Blue", 72.75);


System.out.printf("%s 's letter grade is: %s%n", account1.getname(), account2.getletterGrade());
System.out.printf("%s's letter grade is: %s%n", account2.getname(), account2.getletterGrade());

  



}



}