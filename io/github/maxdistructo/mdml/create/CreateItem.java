public class CreateItem extends Item{
public CreateItem(String unlocalizedName){
  super();
  this.setHasSubtypes(true);
  this.setUnlocalizedName(unlocalizedName);
  this.setCreativeTab(CreativeTabs.tabMisc);
  Main.unlocalizedName = unlocalizedName;
}
@Override
public void registerIcons(IIconRegister reg){
  for (int i = 0; i < 6; i ++){
    this.icons[i] = reg.registerIcon(Main.MODID + ":multitexture_" + i + "-" + Main.unlocalizedName);
  }
}
  @Override
  public IIcon getIconFromDamage(int meta){
    if (meta > 5)
    meta = 0
    return this.icons[meta];
  }
  @Override
  public void getSubItems(Item item, CreativeTabs tab, List list){
    for (int i = 0; i < 6; i ++){
      
    }
  }
    public static final void init(String tutorialItem, String unlocalizedName, String ModID) {
        public static Item tutorialItem;
        tutorialItem = new Item().setUnlocalizedName(unlocalizedName).setCreativeTab(CreativeTabs.tabMisc).setTextureName(Main.MODID + ":" + ModID + "." + unlocalizedName);
        GameRegistry.registerItem(tutorialItem, unlocalizedName);
    }

}
