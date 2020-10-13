package uaslp.enginering.labs;

public class LastNameAscendantComparator implements Comparator{
    public int compare(Object left, Object right){
        Alumno alumnoLeft = (Alumno)left;
        Alumno alumnoRight = (Alumno)right;

        return alumnoRight.getLastName().compareTo(alumnoLeft.getLastName());
    }
}
