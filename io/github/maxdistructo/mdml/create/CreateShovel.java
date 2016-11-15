package io.github.maxdistructo.create;

import net.minecraft.item.ItemSpade;

public class CreateShovel extends ItemSpade{
        public CreateShovel(String MODID, String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName(MODID + ":" + unlocalizedName);
    }
}
