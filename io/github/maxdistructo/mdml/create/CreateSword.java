package io.github.maxdistructo.create;

import net.minecraft.item.ItemSword;

public class CreateSword extends ItemSword{
        public CreateSword(String MODID, String unlocalizedName, String ModId, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName(MODID + ":" + ModId + "." + unlocalizedName);
    }
}
