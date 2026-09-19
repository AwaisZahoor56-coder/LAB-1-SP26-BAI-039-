class Overload3{
  void enroll(String courseCode){
  System.out.println("Enrolled in course" + courseCode);
}
   void enroll(String courseCode, int section){
   System.out.println("Enrolled in course" + courseCode + "in section" + section);
}
   void enroll (int numericCourseCode) {
   System.out.println("Enrolled in course with numeric code" + numericCourseCode);
} 
}