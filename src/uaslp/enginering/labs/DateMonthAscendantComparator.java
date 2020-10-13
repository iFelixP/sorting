package uaslp.enginering.labs;

import java.time.LocalDate;

public class DateMonthAscendantComparator implements Comparator{

    public int compare(Object left, Object right){
        Alumno monthLeft = (Alumno) left;
        Alumno monthRight = (Alumno)right;

        return  monthRight.getBirthday().getMonth().compareTo(monthLeft.getBirthday().getMonth());
    }

}
