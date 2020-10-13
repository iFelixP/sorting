package uaslp.enginering.labs;

public class LastNameDescendantComparator implements Comparator{
    public int compare(Object left, Object right){
        Alumno alumnoLeft = (Alumno)left;
        Alumno alumnoRight = (Alumno)right;

        return alumnoLeft.getLastName().compareTo(alumnoRight.getLastName());
    }
}