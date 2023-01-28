package net.HavenCore.HavenCoreDimensions;

@cpw.mods.fml.common.Mod(modid = Mod.MODID, version = Mod.VERSION, name = Mod.NAME)
public class Mod {
    public static final String MODID = "havencoredimensions";
    public static final String VERSION = "1.0";
    public static final String NAME = "HavenCoreDimensions";

    @cpw.mods.fml.common.Mod.Instance(Mod.MODID)
    public static Mod instance;

    @cpw.mods.fml.common.Mod.EventHandler
    public void preInit(cpw.mods.fml.common.event.FMLPreInitializationEvent event) {
        net.HavenCore.HavenCorePublic.World.HavenWorldProvider.RegisterWorldChunkManager();
        net.HavenCore.HavenCorePublic.World.HavenWorldProvider.RegisterWorldProvider();
    }

}
