package project;
public class DrawableTest {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: DrawableTest <size> <shape1> <dimension1> <shape2> <dimension2> ...");
            return;
        }

        int size = Integer.parseInt(args[0]);
        Drawable[] drawables = new Drawable[size];

        int i = 1;
        for (int j = 0; j < size; j++) {
            String shape = args[i++];
            double dimension = Double.parseDouble(args[i++]);

            if (shape.equalsIgnoreCase("circle")) {
                drawables[j] = new Circle(dimension);
            } else if (shape.equalsIgnoreCase("cube")) {
                drawables[j] = new Cube(dimension);
            } else {
                System.out.println("Invalid shape: " + shape);
                return;
            }
        }

        double totalArea = 0;
        for (Drawable drawable : drawables) {
            if (drawable instanceof Shape) {
                totalArea += ((Shape) drawable).getArea();
            }
        }

        System.out.println("Sum of all areas: " + totalArea);
    }
}