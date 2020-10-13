package uaslp.enginering.labs;

public class FirstNameAscendantComparator implements Comparator{
    public int compare(Object left, Object right){
        Alumno alumnoLeft = (Alumno)left;
        Alumno alumnoRight = (Alumno)right;

        return alumnoRight.getFirstName().compareTo(alumnoLeft.getFirstName());
    }
}
