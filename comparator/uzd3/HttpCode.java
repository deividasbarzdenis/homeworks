package comparator.uzd3;

public class HttpCode implements Comparable<HttpCode>{
    ErrorLevels level;

    public HttpCode(ErrorLevels level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "HttpCode{" +
                "level=" + level +
                '}';
    }

    @Override
    public int compareTo(HttpCode o) {
        return level.getLevel()-o.level.getLevel();
    }

}
