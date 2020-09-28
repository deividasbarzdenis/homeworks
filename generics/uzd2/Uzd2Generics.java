package generics.uzd2;

import javax.swing.plaf.SpinnerUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Uzd2Generics {


    public static void main(String[] args) {
        List<Birch> birches = Arrays.asList(new Birch(), new Birch(), new Birch());
        birchForest(birches);

        List<Deciduos> deciduous = Arrays.asList(new Deciduos(), new Deciduos(), new Deciduos());
        variuosForest(deciduous);

        List<Tree> trees = Arrays.asList(new Deciduos(), new Oak(), new Pine());
        variuosForest(trees);

        List<Conifer> coniferList = Arrays.asList(new Pine(), new Spruce(), new Juniper());
        variuosForest(trees);
    }
    private static void birchForest(List<Birch> birchList){
        System.out.println("Birches forest:");
        for (Birch birch:birchList){
            birch.has();
        }
        System.out.println("______________________");
    }
    private static void conifersForest(List<? extends Conifer> conifershList){
        System.out.println("Confers forest:");
        for (Conifer conifer:conifershList){
            conifer.has();
        }
        System.out.println("______________________");
    }
    private static void variuosForest(List<? extends Tree> treeList) {
        System.out.println("Variuos forest:");
        for (Tree tree : treeList) {
            tree.has();
        }
        System.out.println("______________________");
    }
}
