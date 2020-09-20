package comparator.uzd1;

import java.util.ArrayList;

public class JavaStudentGroup {
    ArrayList<Student> list;

    public JavaStudentGroup() {
        this.list = new ArrayList<>();
    }

    public void idetiSarasa(Student student) {
        list.add(student);
    }
}
/*Sukurti klasę JavaStudentGroup , kuri turi sąrašą studentų. Klasė Student turi vardą, pavardę ir
studento numerį. Susikurti klasės su sąrašu objektą ir į jį įdėti nemažiau negu 21 studentą (galima
panaudoti failą people.txt su vardais, pavardėmis ir id iš paskaitos apie failus). Studentus
išrūšiuoti pagal vardą, pagal pavardę ir pagal studento numerį. Po to jau surūšiuotus studentus
suskirstyti į 4 grupes. Kodas turi būti parašytas taip, kad lengvai galėtumėte suskirstyti studentus
ir į kitokį skaičių grupių kuriant JavaStudentGroup objektą. Ignoruoti faktą, kad studentai gali
kartotis, o nepilnos grupės studentus pridėti prie pirmų grupių po vieną*/
