package io.github.maxdistructo.create;

import net.minecraft.item.ItemAxe;

public class CreateAxe extends ItemAxe{
        protected CreateAxe(String MODID, String unlocalizedName,String modID, ToolMaterial material){
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName(MODID + ":" + modID + "." + unlocalizedName);
}
}
