package uaslp.enginering.labs;

public class DateMonthDescendantComparator implements Comparator{

    public int compare(Object left, Object right){
        Alumno monthLeft = (Alumno) left;
        Alumno monthRight = (Alumno)right;

        return  monthLeft.getBirthday().getMonth().compareTo(monthRight.getBirthday().getMonth());
    }

}
