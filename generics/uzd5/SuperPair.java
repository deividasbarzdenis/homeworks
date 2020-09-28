package generics.uzd5;

public class SuperPair<T1, T2, T3 extends Number>{
    private T1 t1;
    private T2 t2;
    private T3 t3;

    public SuperPair(T1 t1, T2 t2, T3 t3) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
    }
}
/*Sukurkite klasę SuperPair su trimis generic tipais taip, kad trečiasis tipas galėtų būti tik koks nors
Number skaičius. Pirmieji du tipai gali būti bet kokie. Klasė SuperPair turi turėti kontruktorių su
trimis parametrais. Sukurkite kelis tokių porų objektus. Pabandykite trečią parametrą paduoti ne
skaičių*/
