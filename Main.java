class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();

        Drawing drawing = new Drawing();
        drawing.setShape((triangle));
        drawing.drawShape();

        drawing.setShape(rectangle);
        drawing.drawShape();
    }
}