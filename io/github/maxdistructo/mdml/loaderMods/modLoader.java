package io.github.maxdistructo.loaderMods;

import io.github.maxdistructo.Main;
import io.github.maxdistructo.reader.ReaderArray;
import io.github.maxdistructo.reader.reader;
import net.minecraft.item.Item;
import io.github.maxdistructo.materials.ToolMaterials;
import io.github.maxdistructo.register.RegisterItem;

public class modLoader{
  public static void init(){
    //Modname, Read config, Implement all items
    int cntr = 0;
    int itmCntr = 0;
   while(!Main.modIDs[cntr].equals(null)) {
       String modID = Main.modIDs[cntr];
       String version = Main.versions[cntr];
       String type = Main.files[cntr];
       String dev = Main.devs[cntr];
       String modName = null;
       String[] swords = null;
       String[] picks = null;
       String[] axes = null;
       String[] hoes = null;
       String[] shovels = null;
       String[] items = null;
       String[] foods = null;
       Item[] swordsI = null;
       Item[] picksI = null;
       Item[] axesI = null;
       Item[] hoesI = null;
       Item[] shovelsI = null;
       Item[] itemsI = null;
       Item[] foodsI = null;
       String[] craftings = null; //Still deciding what to do here
       Item[] craftitems = null; //Still deciding what to do here
       Integer[] craftnum = null; // Still deciding what to do here
       Item[] smeltIn = null;
       Item[] smeltOut = null;
       Float[] craftItemDef = null;
       //String[] oreDict = null;
       reader.reader(modID + "-" + version + type, 0, modName);
       ReaderArray.ReaderArray("/config/" + dev + modID + "-" + version + type, 1, swords);
       ReaderArray.ReaderArray(modID + "-" + version + type, 2, picks);
       ReaderArray.ReaderArray(modID + "-" + version + type, 3, shovels);
       ReaderArray.ReaderArray(modID + "-" + version + type, 4, axes);
       ReaderArray.ReaderArray(modID + "-" + version + type, 5, hoes);
       ReaderArray.ReaderArray(modID + "-" + version + type, 6, items);
       ReaderArray.ReaderArray(modID + "-" + version + type, 7, foods);
       ReaderArray.ItemArray(modID + "-" + version + type, 2, picksI);
       ReaderArray.ItemArray(modID + "-" + version + type, 3, shovelsI);
       ReaderArray.ItemArray(modID + "-" + version + type, 4, axesI);
       ReaderArray.ItemArray(modID + "-" + version + type, 5, hoesI);
       ReaderArray.ItemArray(modID + "-" + version + type, 6, itemsI);
       ReaderArray.ItemArray(modID + "-" + version + type, 7, foodsI);
       //ReaderArray.ReaderArray(modID + "-" + version + type, 8, craftings);
       //ReaderArray.ItemArray(modID + "-" + version + type, 9, craftitems);
       //ReaderArray.IntArray(modID + "-" + version + type, 10, craftnum);
       //ReaderArray.CharArray(modID + "-" + version + type, 11, craftItemDef);
       ReaderArray.ItemArray(modID + "-" + version + type, 12, smeltIn);
       ReaderArray.ItemArray(modID + "-" + version + type, 13, smeltOut);
       //ReaderArray.ReaderArray(modID + "-" + version + type, 14, oreDict);

       if (!swords[itmCntr].equals(null)) {
           RegisterItem.registerSword(swordsI[itmCntr], swords[itmCntr], ToolMaterials. (Main.materials[itmCntr]));
           itmCntr++;
       } else {
           System.out.println("All Swords for Mod " + modID + "Loaded");
           itmCntr = 0;
       }
       if (!picks[itmCntr].equals(null)) {
           RegisterItem.registerPick(picksI[itmCntr], picks[itmCntr], ToolMaterials. (Main.materials[itmCntr]));
       } else {
           System.out.println("All Pickaxes for Mod " + modID + "Loaded");
           itmCntr = 0;
       }
       if (!shovels[itmCntr].equals(null)) { //Not Set Up Create Shovel
           RegisterItem.registerShovel(shovelsI[itmCntr], shovels[itmCntr], ToolMaterials. (Main.materials[itmCntr]));
       } else {
           System.out.println("All Shovels for Mod " + modID + "Loaded");
           itmCntr = 0;
       }
       if (!axes[itmCntr].equals(null)) {
           RegisterItem.registerAxe(axesI[itmCntr], axes[itmCntr], ToolMaterials. (Main.materials[itmCntr]));
       } else {
           System.out.println("All Axes for Mod " + modID + "Loaded");
           itmCntr = 0;
       }
       if (!hoes[itmCntr].equals(null)) { //Not Set Up Create Hoe
           RegisterItem.registerHoe(hoesI[itmCntr], hoes[itmCntr], ToolMaterials. (Main.materials[itmCntr]));
       } else {
           System.out.println("All Hoes for Mod " + modID + "Loaded");
           itmCntr = 0;
       }
       if (!items[itmCntr].equals(null)) { //Not Set Up Create Axe
           RegisterItem.registerItem(itemsI[itmCntr], items[itmCntr]);
       } else {
           System.out.println("All Items for Mod " + modID + "Loaded");
           itmCntr = 0;
       }
       if (!foods[itmCntr].equals(null)) { //Not Set Up Create Axe
           RegisterItem.registerFood(foodsI[itmCntr], foods[itmCntr]);
       } else {
           System.out.println("All Food for Mod " + modID + "Loaded");
           itmCntr = 0;
       }

       cntr++;
   }
  }
}