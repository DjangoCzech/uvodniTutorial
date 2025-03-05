public class CreateObjectDemo {
    public static void main(String[] args) {
        //deklarujeme - bod a dva obdelniky
        Point originOne = new Point(23, 94);
        int w = 100;
        int h = 200;
        Rectangle rectOne = new Rectangle(originOne, w, h);
        Rectangle rectTwo = new Rectangle(50, 100);

        //neco vytisknout
        System.out.println("Sirka rectOne" + rectOne.width);
        System.out.println("Vyska rectOne" + rectOne.height);
        System.out.println("Obsah rectOne" + rectOne.getArea());

        rectTwo.origin = originOne;

        System.out.println("Pozice X: rectTwo " + rectTwo.origin.x);
        System.out.println("Pozice Y: rectTwo " + rectTwo.origin.y);

        rectTwo.move(40, 72);
        System.out.println("Pozice X: rectTwo " + rectTwo.origin.x);
        System.out.println("Pozice Y: rectTwo " + rectTwo.origin.y);


    }
}
