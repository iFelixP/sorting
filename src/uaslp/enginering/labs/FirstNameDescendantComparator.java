package uaslp.enginering.labs;

public class FirstNameDescendantComparator implements Comparator{
    public int compare(Object left, Object right){
        Alumno alumnoLeft = (Alumno)left;
        Alumno alumnoRight = (Alumno)right;

        return alumnoLeft.getFirstName().compareTo(alumnoRight.getFirstName());
    }
}