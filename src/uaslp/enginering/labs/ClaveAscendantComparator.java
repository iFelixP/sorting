package uaslp.enginering.labs;

public class ClaveAscendantComparator implements Comparator{

    public int compare(Object left, Object right){
        Alumno claveLeft = (Alumno) left;
        Alumno claveRight = (Alumno)right;

        return  claveRight.getClave() - claveLeft.getClave();
    }

}
