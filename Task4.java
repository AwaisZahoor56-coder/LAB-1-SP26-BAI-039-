public class Task4{
   int number;
   String name;
   void changeNumber(int x){
   x = 99;
   } 
   void changeName(Student st){
   st.completedCredits = 99;
   }
   void replaceStudentName(Student st){
   st = new Student();
   st.name = "Abeer";
   }
   public static void main(String[] args) {
   Task4 info = new Task4();
   Student s1 = new Student();
   s1.studentid = "SP26-BAI-039";
   s1.name = "Awais ";
   s1.completedCredits = 16;
   System.out.println(s1.studentid);
   System.out.println(s1.name);
   System.out.println(s1.completedCredits);
   int Number = 29;
   info.changeNumber(Number);
   System.out.println(Number);
   System.out.println(s1.studentid);
   info.changeName(s1);
   info.replaceStudentName(s1);
   System.out.println(s1.name);
   System.out.println(s1.completedCredits);
  }
}
