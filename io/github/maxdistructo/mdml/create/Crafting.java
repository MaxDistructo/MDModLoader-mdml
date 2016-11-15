package io.github.maxdistructo.create
public class Crafting{
  public static void shapedCraftOne(String top, String middle, String bottom, char letter, Item item, Item craft){
    GameRegistry.addRecipe(new ItemStack(craft)),top, middle, bottom, letter, item);
  }
    public static void shapedCraftTwo(String top, String middle, String bottom, char letter, Item item, char letterTwo, Item itemTwo, Item craft){
    GameRegistry.addRecipe(new ItemStack(craft)),top, middle, bottom, letter, item, letterTwo, itemTwo);
  }
    public static void shapedCraftThree(String top, String middle, String bottom, char letter, Item item, char letterTwo, Item itemTwo, char letterThree, Item itemThree, Item craft){
    GameRegistry.addRecipe(new ItemStack(craft)),top, middle, bottom, letter, item, letterTwo, itemTwo, letterThree, itemThree);
  }
  public static void shapedCraftFour(String top, String middle, String bottom, char letter, Item item, char letterTwo, Item itemTwo, char letterThree, Item itemThree, char letterFour, Item itemFour, Item craft){
    GameRegistry.addRecipe(new ItemStack(craft)),top, middle, bottom, letter, item, letterTwo, itemTwo, letterThree, itemThree, letterFour, itemFour);
  }
  public static void shapedCraftFive(String top, String middle, String bottom, char letter, Item item, char letterTwo, Item itemTwo, char letterThree, Item itemThree, char letterFour, Item itemFour, char letterFive, Item itemFive, Item craft){
    GameRegistry.addRecipe(new ItemStack(craft)),top, middle, bottom, letter, item, letterTwo, itemTwo, letterThree, itemThree, letterFour, itemFour, letterFive, itemFive);
}
  public static void shapedCraftSix(String top, String middle, String bottom, char letter, Item item, char letterTwo, Item itemTwo, char letterThree, Item itemThree, char letterFour, Item itemFour, char letterFive, Item itemFive, char letterSix, Item itemSix, Item craft){
    GameRegistry.addRecipe(new ItemStack(craft)),top, middle, bottom, letter, item, letterTwo, itemTwo, letterThree, itemThree, letterFour, itemFour, letterFive, itemFive, letterSix, itemSix);
  }
  public static void shapedCraftSeven(String top, String middle, String bottom, char letter, Item item, char letterTwo, Item itemTwo, char letterThree, Item itemThree, char letterFour, Item itemFour, char letterFive, Item itemFive, char letterSix, Item itemSix, char letterSeven, Item itemSeven, Item craft){
    GameRegistry.addRecipe(new ItemStack(craft)),top, middle, bottom, letter, item, letterTwo, itemTwo, letterThree, itemThree, letterFour, itemFour, letterFive, itemFive, letterSix, itemSix, letterSeven, itemSeven);
  }
  public static void shapedCraftEight(String top, String middle, String bottom, char letter, Item item, char letterTwo, Item itemTwo, char letterThree, Item itemThree, char letterFour, Item itemFour, char letterFive, Item itemFive, char letterSix, Item itemSix, char letterSeven, Item itemSeven, char letterEight, Item itemEight, Item craft){
    GameRegistry.addRecipe(new ItemStack(craft)),top, middle, bottom, letter, item, letterTwo, itemTwo, letterThree, itemThree, letterFour, itemFour, letterFive, itemFive, letterSix, itemSix, letterSeven, itemSeven, letterEight, itemEight);
  }
  static void shapedCraftNine(String top, String middle, String bottom, char letter, Item item, char letterTwo, Item itemTwo, char letterThree, Item itemThree, char letterFour, Item itemFour, char letterFive, Item itemFive, char letterSix, Item itemSix, char letterSeven, Item itemSeven, char letterEight, Item itemEight, char letterNine, Item itemNine, Item craft){
    GameRegistry.addRecipe(new ItemStack(craft)),top, middle, bottom, letter, item, letterTwo, itemTwo, letterThree, itemThree, letterFour, itemFour, letterFive, itemFive, letterSix, itemSix, letterSeven, itemSeven, letterEight, itemEight, letterNine, itemNine);
  }
  public static void shapelessCraftOneIn(Item itemIn, Item itemOut, int amount, int metadata){
    GameRegistry.addShapelessRecipe(new ItemStack(itemOut), new ItemStack(itemIn, amount, metadata));
  }
  public static void shapelessCraftTwoIn(Item itemIn1, Item itemIn2, Item itemOut, int amount1, int amount2, int metadata1, int metadata2){
    GameRegistry.addShapelessRecipe(new ItemStack(itemOut), new ItemStack(itemIn1, amount1, metadata1), new ItemStack(itemIn2, amount2, metadata2));
  }
  public static void shapelessCraftThreeIn(Item itemIn1, Item itemIn2, Item itemIn3, Item itemOut, int amount1, int amount2, int amount3,int metadata1, int metadata2, int metadata3){
    GameRegistry.addShapelessRecipe(new ItemStack(itemOut), new ItemStack(itemIn1, amount1, metadata1), new ItemStack(itemIn2, amount2, metadata2), new ItemStack(itemIn3, amount3, metadata3)));
  }
  public static void shapelessCraftFourIn(Item itemIn1, Item itemIn2, Item itemIn3, Item itemIn4, int metadata1, int metadata2, int metadata3, int metadata4){
    GameRegistry.addShapelessRecipe(new ItemStack(itemOut), new ItemStack(itemIn1, 1, metadata1), new ItemStack(itemIn2, 1, metadata2), new ItemStack(itemIn3, 1, metadata3), new ItemStack(itemIn4, 1, metadata4));
  }
}