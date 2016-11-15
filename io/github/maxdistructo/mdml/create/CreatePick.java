package io.github.maxdistructo.create;

import net.minecraft.item.ItemPickaxe;

public class CreatePick extends ItemPickaxe {
        protected CreatePick(String MODID, String unlocalizedName, String modId, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName(MODID + ":" + modId + "." + unlocalizedName);
    }
}
