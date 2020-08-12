package Builder;

/**
 * @class: Computer
 * @description:
 * @author: dudg
 * @create: 2020-08-12 16:32
 */
public class Computer {

    private final String cpu;
    private final String ram;
    private final int usbCount;
    private final String keyboard;
    private final String display;

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", usbCount=" + usbCount +
                ", keyboard='" + keyboard + '\'' +
                ", display='" + display + '\'' +
                '}';
    }

    public Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.usbCount = builder.usbCount;
        this.keyboard = builder.keyboard;
        this.display = builder.display;
    }

    public static class Builder{
        private String cpu;
        private String ram;
        private int usbCount;
        private String keyboard;
        private String display;

        public Builder(String cpu, String ram){
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder setUsbCount(int usbCount) {
            this.usbCount = usbCount;
            return this;
        }

        public Builder setKeyBoard(String keyBoard) {
            this.keyboard = keyBoard;
            return this;
        }

        public Builder setDisplay(String display) {
            this.display = display;
            return this;
        }

        public Computer builder(){
            return new Computer(this);
        }
    }

}
