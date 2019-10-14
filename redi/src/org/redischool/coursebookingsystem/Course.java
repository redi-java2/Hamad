package org.redischool.coursebookingsystem;

class Course {
    int courseId;
    String courseName;
    int openSpaces;
    Student[] studentList;

    Course(int courseId, String courseName, int openSpaces){
        this.courseId = courseId;
        this.courseName = courseName;
        this.openSpaces = openSpaces;
        this.studentList = new Student[openSpaces];
    }

    public String toString(){
        return ("Course Id: " + courseId
                + " Course name: " + courseName
                + " # open spaces: " + openSpaces);
    }

    boolean book(Student student) {
        if (student!=null && openSpaces > 0){
            openSpaces = openSpaces -1;
            return true;
        }
        return false;
    }
    String participantList="";
    public String createParticipantList(Student std){
        if (std != null) {
            participantList = participantList + std.toString() + '\n';
        }
        return participantList;
    }
}
//New Comment for github checking