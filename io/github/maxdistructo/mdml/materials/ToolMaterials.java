package io.github.maxdistructo.materials;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import io.github.maxdistructo.reader.*;

public class ToolMaterials {
  String materialName;
  int nums[], cntr = 0, strc = 0;
  float str[];
  reader.reader(Main.modIds[1] + "-" + Main.types[1],0,Main.modID);
  reader.reader(Main.modIds[1] + "-" + Main.types[1],1,materialName);
  reader.readerToArray(main.modIDs[1] + "-" + main.materials[1], 2, nums);
  reader.readerToArray(main.modIDs[1] + "-" + main.materials[1], 3, str);
  
  while(!modLoader.modIDs[cntr].equals(null)){
     public static ToolMaterial Main.modID = EnumHelper.addToolMaterial(materialName, nums[cntr], nums[cntr + 1], str[strc], str[strc + 1], nums[cntr + 2]);
     cntr += 3;
     strc += 2;
  }

   
}
