package comparator.uzd1;

public class Student {
    private String name, surname;
    private int id;

    public Student(String name, String surname, int id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student " + name + " "+surname +
                " id " + id+"\n ";
    }
}
/*Klasė Student turi vardą, pavardę ir
studento numerį. Susikurti klasės su sąrašu objektą ir į jį įdėti nemažiau negu 21 studentą (galima
panaudoti failą people.txt su vardais, pavardėmis ir id iš paskaitos apie failus). Studentus
išrūšiuoti pagal vardą, pagal pavardę ir pagal studento numerį. Po to jau surūšiuotus studentus
suskirstyti į 4 grupes. Kodas turi būti parašytas taip, kad lengvai galėtumėte suskirstyti studentus
ir į kitokį skaičių grupių kuriant JavaStudentGroup objektą. Ignoruoti faktą, kad studentai gali
kartotis, o nepilnos grupės studentus pridėti prie pirmų grupių po vieną*/
