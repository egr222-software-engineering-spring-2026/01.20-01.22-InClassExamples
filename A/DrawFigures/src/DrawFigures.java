public class DrawFigures {
    public static void main(String[] args) {
        drawDiamond();
        System.out.println();
        drawX();
        System.out.println();
        drawRocket();
    }

    public static void drawDiamond() {
        drawCone();
        drawV();
    }

    public static void drawX() {
        drawV();
        drawCone();
    }

    public static void drawRocket() {
        drawCone();
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
        System.out.println("|United|");
        System.out.println("|States|");
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
        drawCone();
    }

    private static void drawCone() {
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
    }

    private static void drawV() {
        System.out.println(" \\    /");
        System.out.println("  \\  /");
        System.out.println("   \\/");
    }
}