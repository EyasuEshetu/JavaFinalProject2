package com.generation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student    extends Person    implements Evaluation
{
    private double average;

    private final List<Course> courses = new ArrayList<>();

    private final Map<String, Course> approvedCourses = new HashMap<>();

    public Student( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );
    }

    public void enrollToCourse( Course course )
    {
        //TODO implement this method
        //check if student is already enrolled

        //if (!student is enrolled)
            // student.enroll(course)
        // else return courses.add(course)

        if(!isAttendingCourse(course.getCode())){
            courses.add(course);
        }
    }

    public void registerApprovedCourse( Course course )
    {
        approvedCourses.put( course.getCode(), course );
    }


    public boolean isAttendingCourse( String courseCode )
    {
        //TODO implement this method
        //if the arraylist courses contains the passed argument return true, if not return false

        for(Course course: courses){
            if (courses.contains(courseCode)) {
                System.out.println("Student is already in course "+ courseCode+"!");
                return true;
            }
        }

        return false;

    }

    @Override
    public double getAverage()
    {
        return average;
    }

    @Override
    public String toString()
    {
        return "Student {" + super.toString() + ","+ courses +"}";
    }
}
