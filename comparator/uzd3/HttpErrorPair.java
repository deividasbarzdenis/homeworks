package comparator.uzd3;

public class HttpErrorPair implements Comparable<HttpErrorPair>{
    private Object key;
    private HttpCode value;

    public HttpErrorPair(Object key, HttpCode value) {
        this.key = key;
        this.value = value;
    }

    public HttpErrorPair(HttpCodeEnum code500, BadRequestHttpCode internalServerErrorHttpCode) {
    }

    public HttpErrorPair(HttpCodeEnum code500, InternalServerErrorHttpCode internalServerErrorHttpCode) {
    }

    public HttpErrorPair(HttpCodeEnum code404, NotFoundHttpCode notFoundHttpCode) {
    }

    @Override
    public int compareTo(HttpErrorPair o) {
        return value.compareTo(o.value);
    }

    @Override
    public String toString() {
        return "HttpErrorPair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
