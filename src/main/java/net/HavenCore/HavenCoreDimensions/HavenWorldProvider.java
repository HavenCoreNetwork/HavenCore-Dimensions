package net.HavenCore.HavenCoreDimensions;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraftforge.common.DimensionManager;

public class HavenWorldProvider extends WorldProvider {

    private String dimName;

    public HavenWorldProvider() {
        // Called by Forge, followed by setDimension
    }

    public void RegisterWorldChunkManager() {
		this.worldChunkMgr = new WorldChunkManagerHell(BiomeGenBase.sky, 0.1F);
		this.dimensionId = DimensionManager.getNextFreeDimId() + 1;
	}

    public HavenWorldProvider(String dimName){
        this.dimName = dimName;
    }

    /**
     * Returns 'true' if in the "main surface world", but 'false' if in the Nether or End dimensions.
     *
     * @return true, if is surface world
     */
    @Override
    public boolean isSurfaceWorld() {
        return super.isSurfaceWorld();
    }

    /**
     * Returns the dimension's name, e.g. "The End", "Nether", or "Overworld".
     */
    @Override
    public String getDimensionName() {
        return dimName;
    }

    @Override
    public void setDimension(int dim) {
        super.setDimension(dim);
    }


}
