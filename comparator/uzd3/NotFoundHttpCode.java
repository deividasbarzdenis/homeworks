package comparator.uzd3;

public class NotFoundHttpCode extends HttpCode{
    public NotFoundHttpCode(ErrorLevels low) {
        super(low);
    }

    @Override
    public String toString() {
        return "NotFoundHttpCode{" +
                "level=" + level +
                '}';
    }
}
