package comparator.uzd3;

public class BadRequestHttpCode extends HttpCode{
    public BadRequestHttpCode(ErrorLevels medium) {
        super(medium);
    }

    @Override
    public String toString() {
        return "BadRequestHttpCode{" +
                "level=" + level +
                '}';
    }
}
