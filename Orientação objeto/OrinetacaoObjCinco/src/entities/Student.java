package entities;

public class Student {
    public String name;
    public Double noteOne;
    public Double noteTwo;
    public Double noteThree;

    public Double finalGrade(){
        return noteOne + noteTwo + noteThree;
    }

    public Double missing(){
        return  100.00 - (noteOne + noteTwo + noteThree) ;
    }

}
