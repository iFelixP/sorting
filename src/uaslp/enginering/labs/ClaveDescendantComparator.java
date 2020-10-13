package uaslp.enginering.labs;

public class ClaveDescendantComparator implements Comparator{

    public int compare(Object left, Object right){
        Alumno claveLeft = (Alumno) left;
        Alumno claveRight = (Alumno)right;

        return  claveLeft.getClave() - claveRight.getClave();
    }

}
