package io.github.maxdistructo.register;
import cpw.mods.fml.common.registry.GameRegistry;
import io.github.maxdistructo.Main;
import io.github.maxdistructo.create.*;
import io.github.maxdistructo.loaderMods.modLoader;
import io.github.maxdistructo.materials.ToolMaterials;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
public class RegisterItem{
	public static void registerSword(Item item, String unlocalizedName, Item.ToolMaterial material){
		GameRegistry.registerItem(item = new CreateSword(Main.MODID, modLoader.swords[modLoader.itmCntr], Main.modIDs[modLoader.itmCntr], ToolMaterials.(Main.materials[modLoader.itmCntr])), unlocalizedName);
	}
	public static void registerPick(Item item, String unlocalizedName, Item.ToolMaterial material){
	  		GameRegistry.registerItem(item = new CreatePick(Main.MODID, modLoader.picks[modLoader.itmCntr], Main.modIDs[modLoader.itmCntr], ToolMaterials.(Main.materials[modLoader.itmCntr])), unlocalizedName);
	}
	public static void registerAxe(Item item, String unlocalizedName, Item.ToolMaterial material){
	  		GameRegistry.registerItem(item = new CreateAxe(Main.MODID, modLoader.axes[modLoader.itmCntr], Main.modIDs[modLoader.itmCntr], ToolMaterials.(Main.materials[modLoader.itmCntr])), unlocalizedName);
	}
	public static void registerShovel(Item item, String unlocalizedName, Item.ToolMaterial material){
	  		GameRegistry.registerItem(item = new CreateShovel(Main.MODID, modLoader.shovels[modLoader.itmCntr], Main.modIDs[modLoader.itmCntr], ToolMaterials.(Main.materials[modLoader.itmCntr])), unlocalizedName);
	}
	public static void registerHoe(Item item, String unlocalizedName, Item.ToolMaterial material){
		GameRegistry.registerItem(item = new CreateHoe(Main.MODID, modLoader.hoes[modLoader.itmCntr], Main.modIDs[modLoader.itmCntr], ToolMaterials.(Main.materials[modLoader.itmCntr])), unlocalizedName);
	}
	public static void registerItem(Item item, String unlocalizedName){
  		GameRegistry.registerItem(item = new Item().setUnlocalizedName(unlocalizedName).setCreativeTab(CreativeTabs.tabMisc), unlocalizedName);
	}
	public static void registerFood(Item item, String unlocalizedName){
	  GameRegistry.registerItem(item= new CreateFood(modLoader.foods[modLoader.itmCntr], Main.modIDs[modLoader.itmCntr]),unlocalizedName);
	}
	
}