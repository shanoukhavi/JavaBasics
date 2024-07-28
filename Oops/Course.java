class Course {
    static  int maxCapacity=100;
    //only thr maximumm  is i 60 
    String courseName;
    int enrollments;
    String[] enrolledStudents;
    //now o it is iwhen u call the construstor iti is sodne 
    Course(String courseName){
this.courseName=courseName;
this.enrollments=0;
this.enrolledStudents=new String[maxCapacity];
    }

 //=new String[maxCapacity];
    //students can be there mate 
    //hwo cmmany students lean it 60 students mate 
  static int  setMaxCapacity(int maxCapacity)
  {
//thsis i si used for only the instance variable sfor c=static u uus euti using the clas mate 
Course.maxCapacity=maxCapacity;
return Course.maxCapacity;
  }

  void enrollStudent(String studentName){
    enrolledStudents[enrollments]=studentName;
    enrollments++;
  }
  void unenrollStudent()
  {
    //array is the deleletion mate 
    System.out.println("Sturdnet is been remeoved");
    enrollments--;

  }

  //now o go for eenerolled student mate 

}
