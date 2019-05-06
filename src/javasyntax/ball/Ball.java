package javasyntax.ball;

public class Ball {

    private String name;
    private String color;

    public Ball(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\n" + name);
        result.append("\n" + color);

        return result.toString();
    }
}
