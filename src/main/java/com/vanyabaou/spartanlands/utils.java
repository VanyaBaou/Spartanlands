package com.vanyabaou.spartanlands;

import com.oblivioussp.spartanweaponry.api.ToolMaterialEx;
import net.minecraft.item.Item;
import org.apache.commons.lang3.StringUtils;

public class utils {

    public static ToolMaterialEx spartanMatFromToolMat(String name, Item.ToolMaterial material, int color1, int color2){
        return new ToolMaterialEx(
                name,
                "ingot" + StringUtils.capitalize(name),
                Spartanlands.MOD_ID,
                color1,
                color2,
                material.getHarvestLevel(),
                material.getMaxUses(),
                material.getEfficiency(),
                material.getAttackDamage(),
                material.getEnchantability());
    }
}
