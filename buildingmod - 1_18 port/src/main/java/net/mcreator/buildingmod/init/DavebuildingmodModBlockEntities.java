
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.buildingmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.buildingmod.block.entity.VocalsGeneratorBlockEntity;
import net.mcreator.buildingmod.block.entity.SoundGeneratorBlockEntity;
import net.mcreator.buildingmod.block.entity.ParticleGeneratorBlockEntity;
import net.mcreator.buildingmod.DavebuildingmodMod;

public class DavebuildingmodModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES,
			DavebuildingmodMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> SOUND_GENERATOR = register("sound_generator", DavebuildingmodModBlocks.SOUND_GENERATOR,
			SoundGeneratorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PARTICLE_GENERATOR = register("particle_generator",
			DavebuildingmodModBlocks.PARTICLE_GENERATOR, ParticleGeneratorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> VOCALS_GENERATOR = register("vocals_generator", DavebuildingmodModBlocks.VOCALS_GENERATOR,
			VocalsGeneratorBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
