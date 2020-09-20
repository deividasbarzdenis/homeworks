package comparator.uzd3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Uzd3Comparator {
    public static void main(String[] args) {
        List<HttpErrorPair> pairList = new ArrayList<>();
        pairList.add(new HttpErrorPair(HttpCodeEnum.CODE_500, new
                InternalServerErrorHttpCode(ErrorLevels.HIGH)));
        pairList.add(new HttpErrorPair(HttpCodeEnum.CODE_401, new
                BadRequestHttpCode(ErrorLevels.MEDIUM)));
        pairList.add(new HttpErrorPair(HttpCodeEnum.CODE_404, new
                NotFoundHttpCode(ErrorLevels.LOW)));
        pairList.add(new HttpErrorPair(HttpCodeEnum.CODE_403, new
                ForbiddenHttpCode(ErrorLevels.MEDIUM)));

        //System.out.println(pairList);
        Collections.sort(pairList);
        System.out.println(pairList);
    }

}
/*1. Sukurkite enum'ą HttpCodeEnum su reikšmėmis CODE_404 , CODE_401 , CODE_500 ir pan.
2. Sukurkite enum'ą ErrorLevels su reikšmėmis HIGH , LOW , MEDIUM ir pan. Kiekviena
enum'o reikšmė turi turėti kažkokį skaičių, pvz HIGH yra 2 , LOW yra 0 .
3. Sukurkite klasę HttpCode , kuri turi klasės atributą ErrorLevels tipo.
4. Sukurkite keletą HttpCode klasę paveldinčių klasių, tokių kaip NotFoundHttpCode ,
BadRequestHttpCode , InternalServerErrorHttpCode ir pan.
5. Sukurkite klasę HttpErrorPair , kuri turi generics tipo du klasės kintamuosius (key ir value).
Pirmasis gali būti bet kokio tipo, antrasis gali būti tik HttpCode tipo arbą šios klasės vaikinių
klasių tipo.
6. Sukurkite tuščią sąrašą ir į jį įdėkite keletą HttpErrorPair objektų.*/