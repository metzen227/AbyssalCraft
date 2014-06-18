package com.shinoow.abyssalcraft.common.structures.dreadlands.mineshaft;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.gen.structure.StructureStart;

public class StructureDreadlandsMineBStart extends StructureStart
{

    public StructureDreadlandsMineBStart() {}

    @SuppressWarnings("unchecked")
	public StructureDreadlandsMineBStart(World par1World, Random par2Random, int par3, int par4)
    {
        super(par3, par4);
        StructureDreadlandsMineBPieces.Room room = new StructureDreadlandsMineBPieces.Room(0, par2Random, (par3 << 4) + 2, (par4 << 4) + 2);
        this.components.add(room);
        room.buildComponent(room, this.components, par2Random);
        this.updateBoundingBox();
        this.markAvailableHeight(par1World, par2Random, 10);
    }
}