/**
 * Write a description of class CollegeStudent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class CollegeStudents {
    private ArrayList<College> collegeArr;

    public CollegeStudents(){
        collegeArr = new ArrayList<College>();
    }

    public void addStudent(College student){
        collegeArr.add(student);
    }

    public void removeStudent(int index){
        collegeArr.remove(index);
    }

    public Student getStudent(int index){
        return collegeArr.get(index);
    }

    public int getTotalStudents(){
        return collegeArr.size();
    }

    public int isFound(String id){
        for(int i = 0; i < collegeArr.size(); i++){
            if(collegeArr.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }

    public int getFullTime(){
        int count = 0;
        for(int i = 0; i < collegeArr.size(); i++){
            if(collegeArr.get(i).getFullTime()){
                count ++;
            }
        }
        return count;
    }

    public String toString(){
        return "";
    }

}
