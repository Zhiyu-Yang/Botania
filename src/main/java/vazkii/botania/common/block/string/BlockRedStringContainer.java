/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 * 
 * Botania is Open Source and distributed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 License
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB)
 * 
 * File Created @ [Nov 14, 2014, 5:29:56 PM (GMT)]
 */
package vazkii.botania.common.block.string;

import net.minecraft.world.World;
import vazkii.botania.common.block.tile.string.TileRedString;
import vazkii.botania.common.block.tile.string.TileRedStringContainer;
import vazkii.botania.common.lib.LibBlockNames;

public class BlockRedStringContainer extends BlockRedString {

	public BlockRedStringContainer() {
		super(LibBlockNames.RED_STRING_CONTAINER);
	}

	@Override
	public TileRedString createNewTileEntity(World world, int meta) {
		return new TileRedStringContainer();
	}

}
