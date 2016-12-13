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
       File config = "/config/" + dev + "/" + modid + "-" + version + ".txt" 
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
       String[] craftTop = null; //Still deciding what to do here
       String[] craftMiddle = null;
       String[] craftBottom = null;
       char[] itemLetter1 = null;
       Item[] craftItems1 = null;
       int[] craftMetaData1 = null;
       char[] itemLetter2 = null;
       Item[] craftItems2 = null;
       int[] craftMetaData2 = null;
       char[] itemLetter3 = null;
       Item[] craftItems3 = null;
       int[] craftMetaData3 = null;
       char[] itemLetter4 = null;
       Item[] craftItems4 = null;
       int[] craftMetaData4 = null;
       char[] itemLetter5 = null;
       Item[] craftItems5 = null;
       int[] craftMetaData5 = null;
       char[] itemLetter6 = null;
       Item[] craftItems6 = null;
       int[] craftMetaData6 = null;
       char[] itemLetter7 = null;
       Item[] craftItems7 = null;
       int[] craftMetaData7 = null;
       char[] itemLetter8 = null;
       Item[] craftItems8 = null;
       int[] craftMetaData8 = null;
       char[] itemLetter9 = null;
       Item[] craftItems9 = null;
       int[] craftMetaData9 = null;
       Item[] shapelessItemIn1 = null;
       int[] shapelessMetadata1 = null;
       int[] shapelessAmount1 = null;
       Item[] shapelessItemIn2 = null;
       int[] shapelessMetadata12 = null;
       int[] shapelessAmount2 = null;
       Item[] shapelessItemIn3 = null;
       int[] shapelessMetadata3 = null;
       int[] shapelessAmount3 = null;
       Item[] shapelessItemIn4 = null;
       int[] shapelessMetadata4 = null;
       int[] shapelessAmount4 = null;
       Item[] shapelessItemOut = null;
       int[] shapelessMetadataOut = null;
       int[] shapelessAmountOut = null;
       Item[] smeltIn = null;
       Item[] smeltOut = null;
       int[] smeltOutAmoutn = null;
       int[] smeltOutMetadata = null;
       float[] smeltExp = null;
     ` Item[] oreDictItems = null;
       Item[] oreDictEntry = null;

       reader.reader(config, 0, modName);
       ReaderArray.ReaderArray(config, 1, swords);
       ReaderArray.ReaderArray(config, 3, picks);
       ReaderArray.ReaderArray(config, 5, shovels);
       ReaderArray.ReaderArray(config, 7, axes);
       ReaderArray.ReaderArray(config, 9, hoes);
       ReaderArray.ReaderArray(config, 11, items);
       ReaderArray.ReaderArray(config, 13, foods);
       ReaderArray.ItemArray(modID + "-" + version + type, 2, picksI);
       ReaderArray.ItemArray(modID + "-" + version + type, 3, shovelsI);
       ReaderArray.ItemArray(modID + "-" + version + type, 4, axesI);
       ReaderArray.ItemArray(modID + "-" + version + type, 5, hoesI);
       ReaderArray.ItemArray(modID + "-" + version + type, 6, itemsI);
       ReaderArray.ItemArray(modID + "-" + version + type, 7, foodsI);
  while(!swords[itmCntr].equals(null) || !picks[itmCntr].equals(null) || !shovels[itmCntr].equals(null) || !axes[itmCntr].equals(null) || !hoes[itmCntr].equals(null) || !items[itmCntr].equals(null) || !foods[itmCntr].equals(null)){
       if (!swords[itmCntr].equals(null)) {
           RegisterItem.registerSword(swordsI[itmCntr], swords[itmCntr], ToolMaterials. (Main.materials[itmCntr]));
           
       } else {
           System.out.println("All Swords for Mod " + modID + "Loaded");
           
       }
       if (!picks[itmCntr].equals(null)) {
           RegisterItem.registerPick(picksI[itmCntr], picks[itmCntr], ToolMaterials. (Main.materials[itmCntr]));
       } else {
           System.out.println("All Pickaxes for Mod " + modID + "Loaded");
           
       }
       if (!shovels[itmCntr].equals(null)) { //Not Set Up Create Shovel
           RegisterItem.registerShovel(shovelsI[itmCntr], shovels[itmCntr], ToolMaterials. (Main.materials[itmCntr]));
       } else {
           System.out.println("All Shovels for Mod " + modID + "Loaded");
          
       }
       if (!axes[itmCntr].equals(null)) {
           RegisterItem.registerAxe(axesI[itmCntr], axes[itmCntr], ToolMaterials. (Main.materials[itmCntr]));
       } else {
           System.out.println("All Axes for Mod " + modID + "Loaded");
           
       }
       if (!hoes[itmCntr].equals(null)) { //Not Set Up Create Hoe
           RegisterItem.registerHoe(hoesI[itmCntr], hoes[itmCntr], ToolMaterials. (Main.materials[itmCntr]));
       } else {
           System.out.println("All Hoes for Mod " + modID + "Loaded");
           
       }
       if (!items[itmCntr].equals(null)) { //Not Set Up Create Axe
           RegisterItem.registerItem(itemsI[itmCntr], items[itmCntr]);
       } else {
           System.out.println("All Items for Mod " + modID + "Loaded");
           
       }
       if (!foods[itmCntr].equals(null)) { //Not Set Up Create Axe
           RegisterItem.registerFood(foodsI[itmCntr], foods[itmCntr]);
       } else {
           System.out.println("All Food for Mod " + modID + "Loaded");
           
       }
    itmCntr++;
  }
     itmCntr = 0;
       cntr++;
   }
  }
}
