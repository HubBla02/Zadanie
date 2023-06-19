package Zadanie;
public class SampleBlock implements Block{
    private String color;
    private String material;

    public SampleBlock(String color, String material) {
        this.color = color;
        this.material = material;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public String getMaterial() {
        return this.material;
    }
}
