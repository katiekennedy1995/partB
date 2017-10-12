package partB;

import java.util.ArrayList;
import java.util.Date;

import org.joda.time.DateTime;

import registrationSystem.courseProgramme;
import registrationSystem.module;
import registrationSystem.student;


public class College {
	
	public ArrayList<student> students = new ArrayList<student>();
	public ArrayList<module> modules = new ArrayList<module>();
	public ArrayList<courseProgramme> courses = new ArrayList<courseProgramme>();
	
	//suppressWarnings for Date of Birth
 @SuppressWarnings("deprecation")
public void CollegeArrays(){
	 
	 //Date of Birth for Students
	 Date DOB1 = new Date(1995,10,11);
	 Date DOB2 = new Date(1995,11,12);
	 Date DOB3 = new Date(1994,12,14);
	 Date DOB4 = new Date(1994,10,11);
	
	 //Populating the student array
	 student s1 = new student("Katie", "18", DOB1, 14373416,  "kk95");
	 students.add(s1);
	 student s2 = new student("Cian", "18", DOB2, 14345416,  "cb95");
	 students.add(s2);
	 student s3 = new student("Ciara", "19", DOB3, 14323426,  "ca94");
	 students.add(s3);
	 student s4 = new student("Eoghan", "19", DOB4, 14335616,  "eg94");
	 students.add(s4);
 
	//populatiing the module array
	module m1 = new module("Data Mining", 123);
 	modules.add(m1);
	module m2 = new module("Software", 132);
 	modules.add(m2);
	module m3 = new module("Programming", 211);
 	modules.add(m3);
	module m4 = new module("Graphics", 432);
 	modules.add(m4);
 	
 	m1.student(s1);
 	m1.student(s4);
 	m2.student(s2);
 	m3.student(s2);
 	m4.student(s3);
 	
 	DateTime startDate1 = new DateTime(2005, 2, 3, 2, 0, 0, 0);
 	DateTime endDate1 = new DateTime(2009, 3, 2, 10, 0, 0, 0);
 	courseProgramme course1 = new courseProgramme("CS&IT", startDate1, endDate1);
 	
 	DateTime startDate2 = new DateTime(2006, 4, 5, 2, 0, 0, 0);
 	DateTime endDate2 = new DateTime(2010, 6, 2, 11, 0, 0, 0);
 	courseProgramme course2 = new courseProgramme("ARTS-IT", startDate2, endDate2);
    course1.setModuleList(modules);
    modules.remove(2);
    course2.setModuleList(modules);
    courses.add(course1);
    courses.add(course2);
 }
 
 public void print(){
	 for(courseProgramme CourseList : courses ){
		 System.out.println("\n " + "The Course is: " + CourseList.getName() + " ");
		 for(module ModuleList : CourseList.getModuleList()){
			 System.out.println("Your Modules are: " + ModuleList.getName());
			 System.out.println("Students taking this module are: ");
			 for(student StudentList :ModuleList.getStudents()){
				 System.out.println(StudentList.getName() );
			 }
		 }
	 }
 }

}