public class Furnace{
  public static void addSmelting(Item in, Item out, int amount, int metadata, Float exp){
    GameRegsitry.addSmelting(in, new ItemStack(out, amount, metadata), exp);
  }
}