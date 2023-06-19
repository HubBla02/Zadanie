package Zadanie;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Testy dla klasy, które implementują interfejs "Block"
        SampleBlock block1 = new SampleBlock("brown", "wood");
        SampleBlock block2 = new SampleBlock("brown", "wood");
        SampleBlock block3= new SampleBlock("white", "birchwood");
        List<Block> blocks = new ArrayList<>();
        blocks.add(block1);
        blocks.add(block2);
        blocks.add(block3);
        Wall wall1 = new Wall(blocks);
        System.out.println("Printing tests with Block class:");
        System.out.println(wall1.count());
        System.out.println(wall1.findBlockByColor("white"));
        System.out.println(wall1.findBlocksByMaterial("wood"));

        // Testy dla klasy, które implementują interfejs "CompositeBlock"
        List<Block> birchBlocks = new ArrayList<>();
        birchBlocks.add(block3);
        birchBlocks.add(block3);
        SampleCompositeBlock scb1 = new SampleCompositeBlock(blocks);
        SampleCompositeBlock scb2 = new SampleCompositeBlock(birchBlocks);
        List<Block> SCBlocks = new ArrayList<>();
        SCBlocks.add(scb1);
        SCBlocks.add(scb2);
        Wall wall2 = new Wall(SCBlocks);
        System.out.println("Printing tests with CompositeBlock class:");
        System.out.println(wall2.count());
        System.out.println(wall2.findBlockByColor("white"));
        System.out.println(wall2.findBlocksByMaterial("birchwood"));
    }
}