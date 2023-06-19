package Zadanie;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Wall implements Structure {
    private List<Block> blocks;

    public Wall(List<Block> blocks) {
        this.blocks = blocks;
    }


    @Override
    public Optional<Block> findBlockByColor(String color) {
        return blocks.stream()
                .filter(block -> block.getColor().equals(color))
                .findFirst();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        List<Block> correctMaterial = new ArrayList<>();
        for(Block block: blocks){
            if(block.getMaterial().equals(material)){
                correctMaterial.add(block);
            }
        }
        return correctMaterial;
    }

    @Override
    public int count() {
        return blocks.size();
    }
}
