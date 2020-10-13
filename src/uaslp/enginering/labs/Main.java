package uaslp.enginering.labs;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        Integer[] datos = {3, 2, 6, 3, 1, 8, 5, 4};

        sort(datos, new IntegerAscendantComparator());

        for (int dato : datos) {
            System.out.print(dato + ", ");
        }

        System.out.println();

        sort(datos, new IntegerDescendantComparator());

        for (int dato : datos) {
            System.out.print(dato + ", ");
        }

        System.out.println();

        String[] nombres = {"Hector", "Jocelyn", "Antonio", "Caleb", "Isaías", "José", "Gustavo", "Alain", "Ivan"};

        sort(nombres, new StringAscendantComparator());

        for (String dato : nombres) {
            System.out.print(dato + ", ");
        }

        System.out.println();

        sort(nombres, new StringDescendantComparator());

        for (String dato : nombres) {
            System.out.print(dato + ", ");
        }

        Alumno alumnos[] = {
                new Alumno("Hector", "Hernandez", LocalDate.of(2001, Month.AUGUST, 11), 4723717),
                new Alumno("Jocelyn", "Llamas", LocalDate.of(2001, Month.JULY, 21), 32321),
                new Alumno("Antonio", "Galvan", LocalDate.of(2002, Month.JANUARY, 1), 45365645),
                new Alumno("Francisco", "Solis", LocalDate.of(2001, Month.FEBRUARY, 14), 72436723),
                new Alumno("Caleb", "Solis", LocalDate.of(2001, Month.FEBRUARY, 16), 72436723),
                new Alumno("Arturo", "Llamas", LocalDate.of(2001, Month.JULY, 12), 32321),


        };

        // Ordenar los alumnos por lastName y firstName e imprimir
        System.out.println();
        sort(alumnos,new LastNameAscendantComparator());
        for(int i = 0; i < alumnos.length; i++){
            System.out.print("[" + alumnos[i].getLastName() + "]");
        }

        System.out.println();
        sort(alumnos,new LastNameDescendantComparator());
        for(int i = 0; i < alumnos.length; i++){
            System.out.print("[" + alumnos[i].getLastName() + "]");
        }

        System.out.println();
        sort(alumnos,new FirstNameAscendantComparator());
        for(int i = 0; i < alumnos.length; i++){
            System.out.print("[" + alumnos[i].getFirstName() + "]");
        }

        System.out.println();
        sort(alumnos,new FirstNameDescendantComparator());
        for(int i = 0; i < alumnos.length; i++){
            System.out.print("[" + alumnos[i].getFirstName() + "]");
        }

        // Ordenar por mes de nacimiento y por clave e imprimir

        System.out.println();
        sort(alumnos,new DateMonthAscendantComparator());
        for(int i = 0; i < alumnos.length; i++){
            System.out.print("[" + alumnos[i].getBirthday().getMonth() + "]");
        }

        System.out.println();
        sort(alumnos,new DateMonthDescendantComparator());
        for(int i = 0; i < alumnos.length; i++){
            System.out.print("[" + alumnos[i].getBirthday().getMonth() + "]");
        }

        System.out.println();
        sort(alumnos,new ClaveAscendantComparator());
        for(int i = 0; i < alumnos.length; i++){
            System.out.print("[" + alumnos[i].getClave() + "]");
        }

        System.out.println();
        sort(alumnos,new ClaveDescendantComparator());
        for(int i = 0; i < alumnos.length; i++){
            System.out.print("[" + alumnos[i].getClave() + "]");
        }

    }

    private static void sort(Object[] datos, Comparator comparator) {
        for (int i = 0; i < datos.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (comparator.compare(datos[j], datos[j + 1]) < 0) {
                    Object temp = datos[j];
                    datos[j] = datos[j + 1];
                    datos[j + 1] = temp;
                } else {
                    break;
                }
            }
        }
    }
}
