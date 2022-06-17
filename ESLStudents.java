import java.util.*;
/**
 * Write a description of class ESL here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class ESLStudents {
    private ArrayList<ESL> eslArr;

    public ESLStudents(){
        eslArr = new ArrayList<ESL>();
    }

    public void addStudent(ESL student){
        eslArr.add(student);
    }

    public void removeStudent(int index){
        eslArr.remove(index);
    }

    public Student getStudent(int index){
        return eslArr.get(index);
    }

    public int getTotalStudents(){
        return eslArr.size();
    }

    public int isFound(String id){
        for(int i = 0; i < eslArr.size(); i++){
            if(eslArr.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }

    public int getStudentLevel(Level level){
        int count = 0;
        for(int i = 0; i < eslArr.size(); i++){
            if(eslArr.get(i).getLevel()==level){
                count ++;
            }
        }
        return count;
    }

    public String toString(){
        return super.toString();
    }

    public static void test(){
        ESLStudents eslStudent = new ESLStudents();
        ESL esl = new ESL("202100002","Soul ","Barry",01,01,1995,Sex.MALE,Level.ESL1A);
        
        
        if(!esl.getId().equals("202100002")){
            throw new IllegalArgumentException("955311043 was expected instead it found" + esl.getId());
        }

        if(esl.getPrice()!=esl.PRICE){
            throw new IllegalArgumentException("25.0 was expected instead it found" + esl.getPrice());
        }

        if(!esl.getLevel().equals("ESL1A")){
            throw new IllegalArgumentException("ESL1A was expected instead it found" + esl.getLevel());
        }

    }    }
