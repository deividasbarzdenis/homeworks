package generics.uzd2;

public class Conifer<T> implements Tree<T> {

    @Override
    public void has() {
        System.out.println(getClass().getSimpleName()+" has needles");
    }


}
