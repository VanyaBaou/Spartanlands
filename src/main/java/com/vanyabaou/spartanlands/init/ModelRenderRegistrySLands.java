package com.vanyabaou.spartanlands.init;

import com.oblivioussp.spartanweaponry.api.SpartanWeaponryAPI;
import com.vanyabaou.spartanlands.Spartanlands;
import net.minecraft.item.Item;


public class ModelRenderRegistrySLands {


    public static void addItemToRegistry(Item item, String modelLoc) {
        SpartanWeaponryAPI.addItemModelToRegistry(
                item, Spartanlands.MOD_ID,
                modelLoc);
    }

}