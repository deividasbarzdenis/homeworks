package comparator.uzd3;

public class InternalServerErrorHttpCode extends HttpCode{
    public InternalServerErrorHttpCode(ErrorLevels high) {
        super(high);
    }

    @Override
    public String toString() {
        return "InternalServerErrorHttpCode{" +
                "level=" + level +
                '}';
    }
}
