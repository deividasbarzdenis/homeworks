package innerClass;

public class City {
    interface Tikslas {
        String readLabel();
    }

    public Tikslas dest(String s) {
        class MyLocalCity implements Tikslas{
            private String label;
            private MyLocalCity(String whereTo){
                label = whereTo;
            }
            @Override
            public String readLabel(){
                return "*"+label+"*";
            }

        }
        return new MyLocalCity(s);
    }

    public static void main(String[] args) {
        City p = new City();
        Tikslas v = p.dest("Vilnius");
        /*MyLocalCity v = p.dest("Kaunas");*/
    }
}
