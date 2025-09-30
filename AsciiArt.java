/**
 * CSCD 210 Lab 1 - ASCII Art
 *
 * Replace this comment with your own description of the picture you choose
 * to draw.  Your program should use System.out.println (and optionally
 * System.out.print) to produce a picture made entirely of keyboard
 * characters (ASCII art).
 *
 * See README.md for detailed instructions.
 */
public class AsciiArt {
 public static void drawCone() {
    System.out.println("   /\\");
    System.out.println("  /  \\");
    System.out.println(" /    \\");
}   
public static void main(String[] args) {
    drawCone();
    System.out.println("|      |");
    System.out.println("+------+");
    drawCone();
}
}
