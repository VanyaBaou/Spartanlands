package com.vanyabaou.spartanlands;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(
        modid = Spartanlands.MOD_ID,
        name = Spartanlands.MOD_NAME,
        version = Spartanlands.VERSION,
        dependencies = Spartanlands.DEPENDENCIES,
        acceptedMinecraftVersions = Spartanlands.MCVERSION
)
public class Spartanlands {

    public static final String MOD_ID = "spartanlands";
    public static final String MOD_NAME = "Spartanlands";
    public static final String VERSION = "1.4.0-1.0";
    public static final String DEPENDENCIES = "required-after:spartanweaponry@[1.4.0,);required-after:thebetweenlands@[1.8.1,)";
    public static final String MCVERSION = "[1.12.2]";

    private static Logger logger;

    @Mod.Instance(MOD_ID)
    public static Spartanlands INSTANCE;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

}
