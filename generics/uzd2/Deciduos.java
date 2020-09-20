package generics.uzd2;

public class Deciduos<T> implements Tree<T> {

    @Override
    public void has() {
        System.out.println(getClass().getSimpleName()+" has a leaves");
    }

}
