package Builder;

/**
 * @class: Main
 * @description:
 * @author: dudg
 * @create: 2020-08-12 16:45
 */
public class Main {

    public static void main(String[] args) {

        Computer computer = new Computer.Builder("Inter", "kingston")
                .setDisplay("great wall")
                .setKeyBoard("dell")
                .setUsbCount(4)
                .builder();

        System.out.println(computer.toString());
    }
}
