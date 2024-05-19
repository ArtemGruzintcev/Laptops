public class LaptopsGame{
    private String brand;
    private double screenDiagonal;
    private int RAM;
    private int SSD;
    private String processorModel;
    private String os;
    private String videoCardModel;
    private String color;

    public LaptopsGame(String brand, double screenDiagonal, int RAM, int SSD,
                       String processorModel, String os, String videoCardModel, String color) {
        this.brand = brand;
        this.screenDiagonal = screenDiagonal;
        this.RAM = RAM;
        this.SSD = SSD;
        this.processorModel = processorModel;
        this.os = os;
        this.videoCardModel = videoCardModel;
        this.color = color;
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getSSD() {
        return SSD;
    }

    public void setSSD(int SSD) {
        this.SSD = SSD;
    }

    public String getProcessorModel() {
        return processorModel;
    }

    public void setProcessorModel(String processorModel) {
        this.processorModel = processorModel;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getVideoCardModel() {
        return videoCardModel;
    }

    public void setVideoCardModel(String videoCardModel) {
        this.videoCardModel = videoCardModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Игровой ноутбук:  " +
                brand + "\n" +
                "Диагональ экрана (дюйм) - " + screenDiagonal + "\n" +
                "RAM - " + RAM + "\n" +
                "SSD - " + SSD + "\n" +
                "Модель процессора - " + processorModel + "\n" +
                "Операционная система - " + os + "\n" +
                "Модель дискретной видеокарты - " + videoCardModel + "\n" +
                "Цвет - " + color + "\n";
    }
}
