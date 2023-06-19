package Zadanie;
import java.util.List;

public class SampleCompositeBlock implements CompositeBlock{
    private List<Block> blocks;

    public SampleCompositeBlock(List<Block> blocks) {
        this.blocks = blocks;
    }

    // zadanie nie narzuca, skąd wziąć kolor, zatem pobieram kolor elementu numer 1
    @Override
    public String getColor() {
        if (!blocks.isEmpty()){
            return blocks.get(0).getColor();
        }
        return null;
    }

    // to samo co z kolorem
    @Override
    public String getMaterial() {
        if (!blocks.isEmpty()){
            return blocks.get(0).getMaterial();
        }
        return null;
    }

    @Override
    public List<Block> getBlocks() {
        return this.blocks;
    }
}
