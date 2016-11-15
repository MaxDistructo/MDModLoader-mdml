package io.github.maxdistructo.create;

import net.minecraft.item.ItemHoe;

public class CreateHoe extends ItemHoe{
        public CreateHoe(String MODID, String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName(MODID + ":" + unlocalizedName);
}
}
