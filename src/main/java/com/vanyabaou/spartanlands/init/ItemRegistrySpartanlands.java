package com.vanyabaou.spartanlands.init;

import com.oblivioussp.spartanweaponry.api.SpartanWeaponryAPI;
import com.oblivioussp.spartanweaponry.item.*;
import com.oblivioussp.spartanweaponry.util.ConfigHandler;
import com.vanyabaou.spartanlands.MatConverter;
import com.vanyabaou.spartanlands.Spartanlands;
import com.vanyabaou.spartanlands.integration.*;
import com.vanyabaou.spartanlands.utils;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import thebetweenlands.common.BetweenlandsAPI;
import thebetweenlands.common.item.BLMaterialRegistry;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;


@Mod.EventBusSubscriber
public class ItemRegistrySpartanlands {
    public static final Set<MatConverter> MATERIALS_TO_REGISTER = new HashSet<>();

    public static final String WEEDWOOD = "weedwood";
    public static final String SLIMY_BONE = "slimybone";
    public static final String OCTINE = "octine";
    public static final String VALONITE = "valonite";

    private static final Set<Item> ALL_ITEMS = new HashSet<>();

    static {
        MATERIALS_TO_REGISTER.add(new MatConverter(WEEDWOOD, utils.spartanMatFromToolMat(WEEDWOOD,
                BLMaterialRegistry.TOOL_WEEDWOOD,1971718, 8485189)));
        MATERIALS_TO_REGISTER.add(new MatConverter(SLIMY_BONE, utils.spartanMatFromToolMat(SLIMY_BONE,
                BLMaterialRegistry.TOOL_BONE, 9867904, 1472278)));
        MATERIALS_TO_REGISTER.add(new MatConverter(OCTINE, utils.spartanMatFromToolMat(OCTINE,
                BLMaterialRegistry.TOOL_OCTINE, 16278797, 16762911)));
        MATERIALS_TO_REGISTER.add(new MatConverter(VALONITE, utils.spartanMatFromToolMat(VALONITE,
                BLMaterialRegistry.TOOL_VALONITE, 5650518, 16114165)));
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {

        for (MatConverter mat : MATERIALS_TO_REGISTER){
            if (!ConfigHandler.disableKatana) {
                ItemKatana katana = new BLSWKatana("katana_" + mat.name, mat.material);
                SpartanWeaponryAPI.addItemModelToRegistry(katana, Spartanlands.MOD_ID, "katana_" + mat.name);
                ALL_ITEMS.add(katana);
            }
            if (!ConfigHandler.disableGreatsword) {
                ItemGreatsword greatsword = new BLSWGreatsword("greatsword_" + mat.name, mat.material);
                SpartanWeaponryAPI.addItemModelToRegistry(greatsword, Spartanlands.MOD_ID, "greatsword_" + mat.name);
                ALL_ITEMS.add(greatsword);
            }
            if (!ConfigHandler.disableLongsword) {
                ItemLongsword longsword = new BLSWLongsword("longsword_" + mat.name, mat.material);
                SpartanWeaponryAPI.addItemModelToRegistry(longsword, Spartanlands.MOD_ID, "longsword_" + mat.name);
                ALL_ITEMS.add(longsword);
            }
            if (!ConfigHandler.disableSaber) {
                ItemSaber saber = new BLSWSaber("saber_" + mat.name, mat.material);
                SpartanWeaponryAPI.addItemModelToRegistry(saber, Spartanlands.MOD_ID, "saber_" + mat.name);
                ALL_ITEMS.add(saber);
            }
            if (!ConfigHandler.disableRapier) {
                ItemRapier rapier = new BLSWRapier("rapier_" + mat.name, mat.material);
                SpartanWeaponryAPI.addItemModelToRegistry(rapier, Spartanlands.MOD_ID, "rapier_" + mat.name);
                ALL_ITEMS.add(rapier);
            }
            if (!ConfigHandler.disableDagger) {
                ItemDagger dagger = new BLSWDagger("dagger_" + mat.name, mat.material);
                SpartanWeaponryAPI.addItemModelToRegistry(dagger, Spartanlands.MOD_ID, "dagger_" + mat.name);
                ALL_ITEMS.add(dagger);
            }
            if (!ConfigHandler.disableSpear) {
                ItemSpear spear = new BLSWSpear("spear_" + mat.name, mat.material);
                SpartanWeaponryAPI.addItemModelToRegistry(spear, Spartanlands.MOD_ID, "spear_" + mat.name);
                ALL_ITEMS.add(spear);
            }
            if (!ConfigHandler.disablePike) {
                ItemPike pike = new BLSWPike("pike_" + mat.name, mat.material);
                SpartanWeaponryAPI.addItemModelToRegistry(pike, Spartanlands.MOD_ID, "pike_" + mat.name);
                ALL_ITEMS.add(pike);
            }
            if (!ConfigHandler.disableLance) {
                ItemLance lance = new BLSWLance("lance_" + mat.name, mat.material);
                SpartanWeaponryAPI.addItemModelToRegistry(lance, Spartanlands.MOD_ID, "lance_" + mat.name);
                ALL_ITEMS.add(lance);
            }
            if (!ConfigHandler.disableHalberd) {
                ItemHalberd halberd = new BLSWHalberd("halberd_" + mat.name, mat.material);
                SpartanWeaponryAPI.addItemModelToRegistry(halberd, Spartanlands.MOD_ID, "halberd_" + mat.name);
                ALL_ITEMS.add(halberd);
            }
            if (!ConfigHandler.disableWarhammer) {
                ItemWarhammer warhammer = new BLSWWarhammer("warhammer_" + mat.name, mat.material);
                SpartanWeaponryAPI.addItemModelToRegistry(warhammer, Spartanlands.MOD_ID, "warhammer_" + mat.name);
                ALL_ITEMS.add(warhammer);
            }
            if (!ConfigHandler.disableWarhammer) {
                ItemHammer hammer = new BLSWHammer("hammer_" + mat.name, mat.material);
                SpartanWeaponryAPI.addItemModelToRegistry(hammer, Spartanlands.MOD_ID, "hammer_" + mat.name);
                ALL_ITEMS.add(hammer);
            }
            if (!ConfigHandler.disableThrowingAxe) {
                ItemThrowingAxe throwing_axe = new BLSWThrowingAxe("throwing_axe_" + mat.name, mat.material);
                SpartanWeaponryAPI.addItemModelToRegistry(throwing_axe, Spartanlands.MOD_ID, "throwing_axe_" + mat.name);
                ALL_ITEMS.add(throwing_axe);
            }
            if (!ConfigHandler.disableThrowingKnife) {
                ItemThrowingKnife throwing_knife = new BLSWThrowingKnife("throwing_knife_" + mat.name, mat.material);
                SpartanWeaponryAPI.addItemModelToRegistry(throwing_knife, Spartanlands.MOD_ID, "throwing_knife_" + mat.name);
                ALL_ITEMS.add(throwing_knife);
            }
            if (!ConfigHandler.disableJavelin) {
                ItemJavelin javelin = new BLSWJavelin("javelin_" + mat.name, mat.material);
                SpartanWeaponryAPI.addItemModelToRegistry(javelin, Spartanlands.MOD_ID, "javelin_" + mat.name);
                ALL_ITEMS.add(javelin);
            }
            if (!ConfigHandler.disableGlaive) {
                ItemGlaive glaive = new BLSWGlaive("glaive_" + mat.name, mat.material);
                SpartanWeaponryAPI.addItemModelToRegistry(glaive, Spartanlands.MOD_ID, "glaive_" + mat.name);
                ALL_ITEMS.add(glaive);
            }
            if (!ConfigHandler.disableBoomerang && !ConfigHandler.woodenBoomerangOnly) {
                ItemBoomerang boomerang = new BLSWBoomerang("boomerang_" + mat.name, mat.material);
                SpartanWeaponryAPI.addItemModelToRegistry(boomerang, Spartanlands.MOD_ID, "boomerang_" + mat.name);
                ALL_ITEMS.add(boomerang);
            }
            if (!ConfigHandler.disableMace) {
                ItemMace mace = new BLSWMace("mace_" + mat.name, mat.material);
                SpartanWeaponryAPI.addItemModelToRegistry(mace, Spartanlands.MOD_ID, "mace_" + mat.name);
                ALL_ITEMS.add(mace);
            }
            if (!ConfigHandler.disableBattleaxe) {
                ItemBattleaxe battleaxe = new BLSWBattleaxe("battleaxe_" + mat.name, mat.material);
                SpartanWeaponryAPI.addItemModelToRegistry(battleaxe, Spartanlands.MOD_ID, "battleaxe_" + mat.name);
                ALL_ITEMS.add(battleaxe);
            }
            if (!ConfigHandler.disableLongbow && !ConfigHandler.woodenLongbowOnly) {
                ItemLongbow longbow = new BLSWLongbow("longbow_" + mat.name,  mat.material);
                SpartanWeaponryAPI.addItemModelToRegistry(longbow, Spartanlands.MOD_ID, "longbow_" + mat.name);
                ALL_ITEMS.add(longbow);
            }
            if (!ConfigHandler.disableCrossbow && !ConfigHandler.woodenCrossbowOnly) {
                ItemCrossbow crossbow = new BLSWCrossbow("crossbow_" + mat.name, mat.material);
                SpartanWeaponryAPI.addItemModelToRegistry(crossbow, Spartanlands.MOD_ID, "crossbow_" + mat.name);
                ALL_ITEMS.add(crossbow);
            }
            if (!ConfigHandler.disableParryingDagger) {
                ItemParryingDagger parrying_dagger = new BLSWParryingDagger("parrying_dagger_" + mat.name, mat.material);
                SpartanWeaponryAPI.addItemModelToRegistry(parrying_dagger, Spartanlands.MOD_ID, "parrying_dagger_" + mat.name);
                ALL_ITEMS.add(parrying_dagger);
            }
            if (!ConfigHandler.disableCaestus && mat.name.contains("weedwood"))
            {
                ItemCaestus caestus = new BLSWCaestus("caestus_lurker", mat.material);
                SpartanWeaponryAPI.addItemModelToRegistry(caestus, Spartanlands.MOD_ID, "caestus_lurker");
                ALL_ITEMS.add(caestus);
            }
        }

        for (Item item : ALL_ITEMS){
            event.getRegistry().register(item);
            Predicate<ItemStack> predicate = itemStack -> item.getRegistryName() != null;
            BetweenlandsAPI.getInstance().registerWhitelistedOverworldItem(item.getRegistryName(), predicate);
        }
    }

}
