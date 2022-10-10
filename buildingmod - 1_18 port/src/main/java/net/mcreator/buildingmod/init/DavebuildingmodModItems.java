
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.buildingmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.buildingmod.item.VocalWarningItem;
import net.mcreator.buildingmod.item.VocalUnauthorizedActivityItem;
import net.mcreator.buildingmod.item.VocalSystemsLoadingItem;
import net.mcreator.buildingmod.item.VocalSecurityBreachItem;
import net.mcreator.buildingmod.item.VocalReactorbreachItem;
import net.mcreator.buildingmod.item.VocalNukeAlertItem;
import net.mcreator.buildingmod.item.VocalLockdownItem;
import net.mcreator.buildingmod.item.VocalLifesystemsFailItem;
import net.mcreator.buildingmod.item.VocalLeaveFacilityItem;
import net.mcreator.buildingmod.item.VocalLabrepairItem;
import net.mcreator.buildingmod.item.VocalExperimentItem;
import net.mcreator.buildingmod.item.VocalEvacuateComplexItem;
import net.mcreator.buildingmod.item.VocalEmptyItem;
import net.mcreator.buildingmod.item.VocalEmergencyExitItem;
import net.mcreator.buildingmod.item.VocalDecontaminationItem;
import net.mcreator.buildingmod.item.VocalDecompressionItem;
import net.mcreator.buildingmod.item.VocalAttentionItem;
import net.mcreator.buildingmod.item.VocalAlertItem;
import net.mcreator.buildingmod.item.SteelIngotItem;
import net.mcreator.buildingmod.item.ParticleCardWaterItem;
import net.mcreator.buildingmod.item.ParticleCardTntItem;
import net.mcreator.buildingmod.item.ParticleCardSteamItem;
import net.mcreator.buildingmod.item.ParticleCardSmokeItem;
import net.mcreator.buildingmod.item.ParticleCardFireItem;
import net.mcreator.buildingmod.item.ParticleCardCampfireItem;
import net.mcreator.buildingmod.item.HelperPaperItem;
import net.mcreator.buildingmod.item.GreenCircuitXpDingItem;
import net.mcreator.buildingmod.item.GreenCircuitTNT1Item;
import net.mcreator.buildingmod.item.GreenCircuitNukeItem;
import net.mcreator.buildingmod.item.GreenCircuitLevelUpItem;
import net.mcreator.buildingmod.item.GreenCircuitItemBurnItem;
import net.mcreator.buildingmod.item.GreenCircuitFireChargeItem;
import net.mcreator.buildingmod.item.GreenCircuitElytraFlyItem;
import net.mcreator.buildingmod.item.GreenCircuitBlazeHurtItem;
import net.mcreator.buildingmod.item.GreenCircuitBatTakeoffItem;
import net.mcreator.buildingmod.item.BasicCircuitItem;
import net.mcreator.buildingmod.item.AdvancedCircuitItem;
import net.mcreator.buildingmod.DavebuildingmodMod;

public class DavebuildingmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DavebuildingmodMod.MODID);
	public static final RegistryObject<Item> HELPER_PAPER = REGISTRY.register("helper_paper", () -> new HelperPaperItem());
	public static final RegistryObject<Item> LIGHTOFF = block(DavebuildingmodModBlocks.LIGHTOFF, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> ALARM_LIGHTOFF = block(DavebuildingmodModBlocks.ALARM_LIGHTOFF,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> GREEN_LIGHT_OFF = block(DavebuildingmodModBlocks.GREEN_LIGHT_OFF,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> BLUE_LIGHT_OFF = block(DavebuildingmodModBlocks.BLUE_LIGHT_OFF,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> SOUND_GENERATOR = block(DavebuildingmodModBlocks.SOUND_GENERATOR,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> BASIC_CIRCUIT = REGISTRY.register("basic_circuit", () -> new BasicCircuitItem());
	public static final RegistryObject<Item> GREEN_CIRCUIT_LEVEL_UP = REGISTRY.register("green_circuit_level_up",
			() -> new GreenCircuitLevelUpItem());
	public static final RegistryObject<Item> GREEN_CIRCUIT_XP_DING = REGISTRY.register("green_circuit_xp_ding", () -> new GreenCircuitXpDingItem());
	public static final RegistryObject<Item> GREEN_CIRCUIT_BAT_TAKEOFF = REGISTRY.register("green_circuit_bat_takeoff",
			() -> new GreenCircuitBatTakeoffItem());
	public static final RegistryObject<Item> GREEN_CIRCUIT_ELYTRA_FLY = REGISTRY.register("green_circuit_elytra_fly",
			() -> new GreenCircuitElytraFlyItem());
	public static final RegistryObject<Item> GREEN_CIRCUIT_BLAZE_HURT = REGISTRY.register("green_circuit_blaze_hurt",
			() -> new GreenCircuitBlazeHurtItem());
	public static final RegistryObject<Item> GREEN_CIRCUIT_FIRE_CHARGE = REGISTRY.register("green_circuit_fire_charge",
			() -> new GreenCircuitFireChargeItem());
	public static final RegistryObject<Item> GREEN_CIRCUIT_ITEM_BURN = REGISTRY.register("green_circuit_item_burn",
			() -> new GreenCircuitItemBurnItem());
	public static final RegistryObject<Item> GREEN_CIRCUIT_TNT_1 = REGISTRY.register("green_circuit_tnt_1", () -> new GreenCircuitTNT1Item());
	public static final RegistryObject<Item> GREEN_CIRCUIT_NUKE = REGISTRY.register("green_circuit_nuke", () -> new GreenCircuitNukeItem());
	public static final RegistryObject<Item> PARTICLE_GENERATOR = block(DavebuildingmodModBlocks.PARTICLE_GENERATOR,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> ADVANCED_CIRCUIT = REGISTRY.register("advanced_circuit", () -> new AdvancedCircuitItem());
	public static final RegistryObject<Item> PARTICLE_CARD_TNT = REGISTRY.register("particle_card_tnt", () -> new ParticleCardTntItem());
	public static final RegistryObject<Item> PARTICLE_CARD_FIRE = REGISTRY.register("particle_card_fire", () -> new ParticleCardFireItem());
	public static final RegistryObject<Item> PARTICLE_CARD_CAMPFIRE = REGISTRY.register("particle_card_campfire",
			() -> new ParticleCardCampfireItem());
	public static final RegistryObject<Item> PARTICLE_CARD_SMOKE = REGISTRY.register("particle_card_smoke", () -> new ParticleCardSmokeItem());
	public static final RegistryObject<Item> PARTICLE_CARD_STEAM = REGISTRY.register("particle_card_steam", () -> new ParticleCardSteamItem());
	public static final RegistryObject<Item> PARTICLE_CARD_WATER = REGISTRY.register("particle_card_water", () -> new ParticleCardWaterItem());
	public static final RegistryObject<Item> VOCALS_GENERATOR = block(DavebuildingmodModBlocks.VOCALS_GENERATOR,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> VOCAL_EMPTY = REGISTRY.register("vocal_empty", () -> new VocalEmptyItem());
	public static final RegistryObject<Item> VOCAL_ATTENTION = REGISTRY.register("vocal_attention", () -> new VocalAttentionItem());
	public static final RegistryObject<Item> VOCAL_WARNING = REGISTRY.register("vocal_warning", () -> new VocalWarningItem());
	public static final RegistryObject<Item> VOCAL_ALERT = REGISTRY.register("vocal_alert", () -> new VocalAlertItem());
	public static final RegistryObject<Item> VOCAL_LABREPAIR = REGISTRY.register("vocal_labrepair", () -> new VocalLabrepairItem());
	public static final RegistryObject<Item> VOCAL_EXPERIMENT = REGISTRY.register("vocal_experiment", () -> new VocalExperimentItem());
	public static final RegistryObject<Item> VOCAL_REACTORBREACH = REGISTRY.register("vocal_reactorbreach", () -> new VocalReactorbreachItem());
	public static final RegistryObject<Item> VOCAL_SYSTEMS_LOADING = REGISTRY.register("vocal_systems_loading", () -> new VocalSystemsLoadingItem());
	public static final RegistryObject<Item> VOCAL_DECONTAMINATION = REGISTRY.register("vocal_decontamination", () -> new VocalDecontaminationItem());
	public static final RegistryObject<Item> VOCAL_DECOMPRESSION = REGISTRY.register("vocal_decompression", () -> new VocalDecompressionItem());
	public static final RegistryObject<Item> VOCAL_LOCKDOWN = REGISTRY.register("vocal_lockdown", () -> new VocalLockdownItem());
	public static final RegistryObject<Item> VOCAL_LIFESYSTEMS_FAIL = REGISTRY.register("vocal_lifesystems_fail",
			() -> new VocalLifesystemsFailItem());
	public static final RegistryObject<Item> VOCAL_LEAVE_FACILITY = REGISTRY.register("vocal_leave_facility", () -> new VocalLeaveFacilityItem());
	public static final RegistryObject<Item> VOCAL_UNAUTHORIZED_ACTIVITY = REGISTRY.register("vocal_unauthorized_activity",
			() -> new VocalUnauthorizedActivityItem());
	public static final RegistryObject<Item> VOCAL_EVACUATE_COMPLEX = REGISTRY.register("vocal_evacuate_complex",
			() -> new VocalEvacuateComplexItem());
	public static final RegistryObject<Item> VOCAL_NUKE_ALERT = REGISTRY.register("vocal_nuke_alert", () -> new VocalNukeAlertItem());
	public static final RegistryObject<Item> VOCAL_EMERGENCY_EXIT = REGISTRY.register("vocal_emergency_exit", () -> new VocalEmergencyExitItem());
	public static final RegistryObject<Item> VOCAL_SECURITY_BREACH = REGISTRY.register("vocal_security_breach", () -> new VocalSecurityBreachItem());
	public static final RegistryObject<Item> COPPER_COIL = block(DavebuildingmodModBlocks.COPPER_COIL, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> PC_SETUP = block(DavebuildingmodModBlocks.PC_SETUP, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> SERVER_RACK = block(DavebuildingmodModBlocks.SERVER_RACK, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> COMPUTER_TERMINAL_STEEL = block(DavebuildingmodModBlocks.COMPUTER_TERMINAL_STEEL,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> COMPUTER_TERMINAL = block(DavebuildingmodModBlocks.COMPUTER_TERMINAL,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> ISOLINEAR_FRONT_BLUE = block(DavebuildingmodModBlocks.ISOLINEAR_FRONT_BLUE,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> ISOLINEAR_MIDDLE_BLUE = block(DavebuildingmodModBlocks.ISOLINEAR_MIDDLE_BLUE,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> ISOLINEAR_BACK_BLUE = block(DavebuildingmodModBlocks.ISOLINEAR_BACK_BLUE,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> ISOLINEAR_FRONT_RED = block(DavebuildingmodModBlocks.ISOLINEAR_FRONT_RED,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> ISOLINEAR_MIDDLE_RED = block(DavebuildingmodModBlocks.ISOLINEAR_MIDDLE_RED,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> ISOLINEAR_BACK_RED = block(DavebuildingmodModBlocks.ISOLINEAR_BACK_RED,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> ISOLINEAR_FRONT_GREEN = block(DavebuildingmodModBlocks.ISOLINEAR_FRONT_GREEN,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> ISOLINEAR_MIDDLE_GREEN = block(DavebuildingmodModBlocks.ISOLINEAR_MIDDLE_GREEN,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> ISOLINEAR_BACK_GREEN = block(DavebuildingmodModBlocks.ISOLINEAR_BACK_GREEN,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LABORATORY_BLOCK = block(DavebuildingmodModBlocks.LABORATORY_BLOCK,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> CUT_LABORATORY_BLOCK = block(DavebuildingmodModBlocks.CUT_LABORATORY_BLOCK,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LABORATORY_VENT = block(DavebuildingmodModBlocks.LABORATORY_VENT,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LABORATORY_PANEL = block(DavebuildingmodModBlocks.LABORATORY_PANEL,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LABORATORY_STRIPE = block(DavebuildingmodModBlocks.LABORATORY_STRIPE,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LABORATORY_ROMAN_1 = block(DavebuildingmodModBlocks.LABORATORY_ROMAN_1,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LABORATORY_LEFT_ARROW = block(DavebuildingmodModBlocks.LABORATORY_LEFT_ARROW,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LABORATORY_RIGHT_ARROW = block(DavebuildingmodModBlocks.LABORATORY_RIGHT_ARROW,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LABORATORY_ROMAN_5 = block(DavebuildingmodModBlocks.LABORATORY_ROMAN_5,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LABORATORY_ROMAN_10 = block(DavebuildingmodModBlocks.LABORATORY_ROMAN_10,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> STRIPEDBLOCK = block(DavebuildingmodModBlocks.STRIPEDBLOCK, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> STRIPPEDBLOCK_HORIZONTAL = block(DavebuildingmodModBlocks.STRIPPEDBLOCK_HORIZONTAL,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> STRIPEDBLOCK_MIDDLE = block(DavebuildingmodModBlocks.STRIPEDBLOCK_MIDDLE,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> YELLOW_ARROW_LEFT = block(DavebuildingmodModBlocks.YELLOW_ARROW_LEFT,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> YELLOW_ARROW_RIGHT = block(DavebuildingmodModBlocks.YELLOW_ARROW_RIGHT,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> ALARM_BLOCK = block(DavebuildingmodModBlocks.ALARM_BLOCK, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> RADIATION_BLOCK = block(DavebuildingmodModBlocks.RADIATION_BLOCK,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> BIOHAZARD_BLOCK = block(DavebuildingmodModBlocks.BIOHAZARD_BLOCK,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> DEATH_BLOCK = block(DavebuildingmodModBlocks.DEATH_BLOCK, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> ELECTRICITY_BLOCK = block(DavebuildingmodModBlocks.ELECTRICITY_BLOCK,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> CROSS_BLOCK = block(DavebuildingmodModBlocks.CROSS_BLOCK, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> EXIT_SIGN = block(DavebuildingmodModBlocks.EXIT_SIGN, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> TUNGSTEN_CARBITE = block(DavebuildingmodModBlocks.TUNGSTEN_CARBITE,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> STEEL_INGOT = REGISTRY.register("steel_ingot", () -> new SteelIngotItem());
	public static final RegistryObject<Item> STEEL_BLOCK = block(DavebuildingmodModBlocks.STEEL_BLOCK, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> STEEL_PLATING = block(DavebuildingmodModBlocks.STEEL_PLATING, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> STEEL_PILLAR = block(DavebuildingmodModBlocks.STEEL_PILLAR, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> STEEL_SEEMLESS = block(DavebuildingmodModBlocks.STEEL_SEEMLESS,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> POLISHED_STEEL_PLATING = block(DavebuildingmodModBlocks.POLISHED_STEEL_PLATING,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> STEEL_TILES = block(DavebuildingmodModBlocks.STEEL_TILES, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> STEEL_STAIRS = block(DavebuildingmodModBlocks.STEEL_STAIRS, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> STEEL_SLAB = block(DavebuildingmodModBlocks.STEEL_SLAB, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> STEEL_FRAME = block(DavebuildingmodModBlocks.STEEL_FRAME, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> STEEL_WALL = block(DavebuildingmodModBlocks.STEEL_WALL, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> STEEL_COLOUMN = block(DavebuildingmodModBlocks.STEEL_COLOUMN, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> STEEL_GIRDER = block(DavebuildingmodModBlocks.STEEL_GIRDER, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> STEEL_DOOR = doubleBlock(DavebuildingmodModBlocks.STEEL_DOOR, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> STEEL_TRAPDOOR = block(DavebuildingmodModBlocks.STEEL_TRAPDOOR,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> STEEL_MESH_TRAPDOOR = block(DavebuildingmodModBlocks.STEEL_MESH_TRAPDOOR,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> VENT_STRAIGHT = block(DavebuildingmodModBlocks.VENT_STRAIGHT, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> VENT_L = block(DavebuildingmodModBlocks.VENT_L, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> VENT_L_UP = block(DavebuildingmodModBlocks.VENT_L_UP, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> VENT_L_DOWN = block(DavebuildingmodModBlocks.VENT_L_DOWN, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> WHITE_STEEL_PLATING = block(DavebuildingmodModBlocks.WHITE_STEEL_PLATING,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> WHITE_STEEL_STAIRS = block(DavebuildingmodModBlocks.WHITE_STEEL_STAIRS,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> WHITE_STEEL_SLAB = block(DavebuildingmodModBlocks.WHITE_STEEL_SLAB,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> WHITE_STEEL_TRAPDOOR = block(DavebuildingmodModBlocks.WHITE_STEEL_TRAPDOOR,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> WHITE_STEEL_WALL = block(DavebuildingmodModBlocks.WHITE_STEEL_WALL,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> WHITE_STEEL_TANK = block(DavebuildingmodModBlocks.WHITE_STEEL_TANK,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> WHITE_GILDED_STEEL_TANK = block(DavebuildingmodModBlocks.WHITE_GILDED_STEEL_TANK,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> WHITE_BOILER = block(DavebuildingmodModBlocks.WHITE_BOILER, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> WHITE_GILDED_BOILER = block(DavebuildingmodModBlocks.WHITE_GILDED_BOILER,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> COW_CATCHER_WHITE = block(DavebuildingmodModBlocks.COW_CATCHER_WHITE,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> ORANGE_STEEL_PLATING = block(DavebuildingmodModBlocks.ORANGE_STEEL_PLATING,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> ORANGE_STEEL_STAIRS = block(DavebuildingmodModBlocks.ORANGE_STEEL_STAIRS,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> ORANGE_STEEL_SLAB = block(DavebuildingmodModBlocks.ORANGE_STEEL_SLAB,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> ORANGE_STEEL_TRAPDOOR = block(DavebuildingmodModBlocks.ORANGE_STEEL_TRAPDOOR,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> ORANGE_STEEL_WALL = block(DavebuildingmodModBlocks.ORANGE_STEEL_WALL,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> ORANGE_STEEL_TANK = block(DavebuildingmodModBlocks.ORANGE_STEEL_TANK,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> ORANGE_GILDED_STEEL_TANK = block(DavebuildingmodModBlocks.ORANGE_GILDED_STEEL_TANK,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> ORANGE_BOILER = block(DavebuildingmodModBlocks.ORANGE_BOILER, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> ORANGE_GILDED_BOILER = block(DavebuildingmodModBlocks.ORANGE_GILDED_BOILER,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> COW_CATCHER_ORANGE = block(DavebuildingmodModBlocks.COW_CATCHER_ORANGE,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> MAGENTA_STEEL_PLATING = block(DavebuildingmodModBlocks.MAGENTA_STEEL_PLATING,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> MAGENTA_STEEL_STAIRS = block(DavebuildingmodModBlocks.MAGENTA_STEEL_STAIRS,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> MAGENTA_STEEL_SLAB = block(DavebuildingmodModBlocks.MAGENTA_STEEL_SLAB,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> MAGENTA_STEEL_TRAPDOOR = block(DavebuildingmodModBlocks.MAGENTA_STEEL_TRAPDOOR,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> MAGENTA_STEEL_WALL = block(DavebuildingmodModBlocks.MAGENTA_STEEL_WALL,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> MAGENTA_STEEL_TANK = block(DavebuildingmodModBlocks.MAGENTA_STEEL_TANK,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> MAGENTA_GILDED_STEEL_TANK = block(DavebuildingmodModBlocks.MAGENTA_GILDED_STEEL_TANK,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> MAGENTA_BOILER = block(DavebuildingmodModBlocks.MAGENTA_BOILER,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> MAGENTA_GILDED_BOILER = block(DavebuildingmodModBlocks.MAGENTA_GILDED_BOILER,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> COW_CATCHER_MAGENTA = block(DavebuildingmodModBlocks.COW_CATCHER_MAGENTA,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LIGHT_BLUE_STEEL_PLATING = block(DavebuildingmodModBlocks.LIGHT_BLUE_STEEL_PLATING,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LIGHT_BLUE_STEEL_STAIRS = block(DavebuildingmodModBlocks.LIGHT_BLUE_STEEL_STAIRS,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LIGHT_BLUE_STEEL_SLAB = block(DavebuildingmodModBlocks.LIGHT_BLUE_STEEL_SLAB,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LIGHT_BLUE_STEEL_TRAPDOOR = block(DavebuildingmodModBlocks.LIGHT_BLUE_STEEL_TRAPDOOR,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LIGHT_BLUE_STEEL_WALL = block(DavebuildingmodModBlocks.LIGHT_BLUE_STEEL_WALL,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LIGHT_BLUE_STEEL_TANK = block(DavebuildingmodModBlocks.LIGHT_BLUE_STEEL_TANK,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LIGHT_BLUE_GILDED_STEEL_TANK = block(DavebuildingmodModBlocks.LIGHT_BLUE_GILDED_STEEL_TANK,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LIGHT_BLUE_BOILER = block(DavebuildingmodModBlocks.LIGHT_BLUE_BOILER,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LIGHT_BLUE_GILDED_BOILER = block(DavebuildingmodModBlocks.LIGHT_BLUE_GILDED_BOILER,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> COW_CATCHER_LIGHT_BLUE = block(DavebuildingmodModBlocks.COW_CATCHER_LIGHT_BLUE,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> YELLOW_STEEL_PLATING = block(DavebuildingmodModBlocks.YELLOW_STEEL_PLATING,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> YELLOW_STEEL_STAIRS = block(DavebuildingmodModBlocks.YELLOW_STEEL_STAIRS,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> YELLOW_STEEL_SLAB = block(DavebuildingmodModBlocks.YELLOW_STEEL_SLAB,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> YELLOW_STEEL_TRAPDOOR = block(DavebuildingmodModBlocks.YELLOW_STEEL_TRAPDOOR,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> YELLOW_STEEL_WALL = block(DavebuildingmodModBlocks.YELLOW_STEEL_WALL,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> YELLOW_STEEL_TANK = block(DavebuildingmodModBlocks.YELLOW_STEEL_TANK,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> YELLOW_GILDED_STEEL_TANK = block(DavebuildingmodModBlocks.YELLOW_GILDED_STEEL_TANK,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> YELLOW_BOILER = block(DavebuildingmodModBlocks.YELLOW_BOILER, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> YELLOW_GILDED_BOILER = block(DavebuildingmodModBlocks.YELLOW_GILDED_BOILER,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> COW_CATCHER_YELLOW = block(DavebuildingmodModBlocks.COW_CATCHER_YELLOW,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LIME_STEEL_PLATING = block(DavebuildingmodModBlocks.LIME_STEEL_PLATING,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LIME_STEEL_STAIRS = block(DavebuildingmodModBlocks.LIME_STEEL_STAIRS,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LIME_STEEL_SLAB = block(DavebuildingmodModBlocks.LIME_STEEL_SLAB,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LIME_STEEL_TRAPDOOR = block(DavebuildingmodModBlocks.LIME_STEEL_TRAPDOOR,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LIME_STEEL_WALL = block(DavebuildingmodModBlocks.LIME_STEEL_WALL,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LIME_STEEL_TANK = block(DavebuildingmodModBlocks.LIME_STEEL_TANK,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LIME_GILDED_STEEL_TANK = block(DavebuildingmodModBlocks.LIME_GILDED_STEEL_TANK,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LIME_BOILER = block(DavebuildingmodModBlocks.LIME_BOILER, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LIME_GILDED_BOILER = block(DavebuildingmodModBlocks.LIME_GILDED_BOILER,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> COW_CATCHER_LIME = block(DavebuildingmodModBlocks.COW_CATCHER_LIME,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> PINK_STEEL_PLATING = block(DavebuildingmodModBlocks.PINK_STEEL_PLATING,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> PINK_STEEL_STAIRS = block(DavebuildingmodModBlocks.PINK_STEEL_STAIRS,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> PINK_STEEL_SLAB = block(DavebuildingmodModBlocks.PINK_STEEL_SLAB,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> PINK_STEEL_TRAPDOOR = block(DavebuildingmodModBlocks.PINK_STEEL_TRAPDOOR,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> PINK_STEEL_WALL = block(DavebuildingmodModBlocks.PINK_STEEL_WALL,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> PINK_STEEL_TANK = block(DavebuildingmodModBlocks.PINK_STEEL_TANK,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> PINK_GILDED_STEEL_TANK = block(DavebuildingmodModBlocks.PINK_GILDED_STEEL_TANK,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> PINK_BOILER = block(DavebuildingmodModBlocks.PINK_BOILER, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> PINK_GILDED_BOILER = block(DavebuildingmodModBlocks.PINK_GILDED_BOILER,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> COW_CATCHER_PINK = block(DavebuildingmodModBlocks.COW_CATCHER_PINK,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> GRAY_STEEL_PLATING = block(DavebuildingmodModBlocks.GRAY_STEEL_PLATING,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> GRAY_STEEL_STAIRS = block(DavebuildingmodModBlocks.GRAY_STEEL_STAIRS,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> GRAY_STEEL_SLAB = block(DavebuildingmodModBlocks.GRAY_STEEL_SLAB,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> GRAY_STEEL_TRAPDOOR = block(DavebuildingmodModBlocks.GRAY_STEEL_TRAPDOOR,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> GRAY_STEEL_WALL = block(DavebuildingmodModBlocks.GRAY_STEEL_WALL,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> GRAY_STEEL_TANK = block(DavebuildingmodModBlocks.GRAY_STEEL_TANK,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> GRAY_GILDED_STEEL_TANK = block(DavebuildingmodModBlocks.GRAY_GILDED_STEEL_TANK,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> GRAY_BOILER = block(DavebuildingmodModBlocks.GRAY_BOILER, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> GRAY_GILDED_BOILER = block(DavebuildingmodModBlocks.GRAY_GILDED_BOILER,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> COW_CATCHER_GRAY = block(DavebuildingmodModBlocks.COW_CATCHER_GRAY,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LIGHT_GRAY_STEEL_PLATING = block(DavebuildingmodModBlocks.LIGHT_GRAY_STEEL_PLATING,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LIGHT_GRAY_STEEL_STAIRS = block(DavebuildingmodModBlocks.LIGHT_GRAY_STEEL_STAIRS,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LIGHT_GRAY_STEEL_SLAB = block(DavebuildingmodModBlocks.LIGHT_GRAY_STEEL_SLAB,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LIGHT_GRAY_STEEL_TRAPDOOR = block(DavebuildingmodModBlocks.LIGHT_GRAY_STEEL_TRAPDOOR,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LIGHT_GRAY_STEEL_WALL = block(DavebuildingmodModBlocks.LIGHT_GRAY_STEEL_WALL,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LIGHT_GRAY_STEEL_TANK = block(DavebuildingmodModBlocks.LIGHT_GRAY_STEEL_TANK,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LIGHT_GRAY_GILDED_STEEL_TANK = block(DavebuildingmodModBlocks.LIGHT_GRAY_GILDED_STEEL_TANK,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LIGHT_GRAY_BOILER = block(DavebuildingmodModBlocks.LIGHT_GRAY_BOILER,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LIGHT_GRAY_GILDED_BOILER = block(DavebuildingmodModBlocks.LIGHT_GRAY_GILDED_BOILER,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> COW_CATCHER_LIGHT_GRAY = block(DavebuildingmodModBlocks.COW_CATCHER_LIGHT_GRAY,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> CYAN_STEEL_PLATING = block(DavebuildingmodModBlocks.CYAN_STEEL_PLATING,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> CYAN_STEEL_STAIRS = block(DavebuildingmodModBlocks.CYAN_STEEL_STAIRS,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> CYAN_STEEL_SLAB = block(DavebuildingmodModBlocks.CYAN_STEEL_SLAB,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> CYAN_STEEL_TRAPDOOR = block(DavebuildingmodModBlocks.CYAN_STEEL_TRAPDOOR,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> CYAN_STEEL_WALL = block(DavebuildingmodModBlocks.CYAN_STEEL_WALL,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> CYAN_STEEL_TANK = block(DavebuildingmodModBlocks.CYAN_STEEL_TANK,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> CYAN_GILDED_STEEL_TANK = block(DavebuildingmodModBlocks.CYAN_GILDED_STEEL_TANK,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> CYAN_BOILER = block(DavebuildingmodModBlocks.CYAN_BOILER, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> CYAN_GILDED_BOILER = block(DavebuildingmodModBlocks.CYAN_GILDED_BOILER,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> COW_CATCHER_CYAN = block(DavebuildingmodModBlocks.COW_CATCHER_CYAN,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> PURPLE_STEEL_PLATING = block(DavebuildingmodModBlocks.PURPLE_STEEL_PLATING,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> PURPLE_STEEL_STAIRS = block(DavebuildingmodModBlocks.PURPLE_STEEL_STAIRS,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> PURPLE_STEEL_SLAB = block(DavebuildingmodModBlocks.PURPLE_STEEL_SLAB,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> PURPLE_STEEL_TRAPDOOR = block(DavebuildingmodModBlocks.PURPLE_STEEL_TRAPDOOR,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> PURPLE_STEEL_WALL = block(DavebuildingmodModBlocks.PURPLE_STEEL_WALL,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> PURPLE_STEEL_TANK = block(DavebuildingmodModBlocks.PURPLE_STEEL_TANK,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> PURPLE_GILDED_STEEL_TANK = block(DavebuildingmodModBlocks.PURPLE_GILDED_STEEL_TANK,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> PURPLE_BOILER = block(DavebuildingmodModBlocks.PURPLE_BOILER, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> PURPLE_GILDED_BOILER = block(DavebuildingmodModBlocks.PURPLE_GILDED_BOILER,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> COW_CATCHER_PURPLE = block(DavebuildingmodModBlocks.COW_CATCHER_PURPLE,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> BLUE_STEEL_PLATING = block(DavebuildingmodModBlocks.BLUE_STEEL_PLATING,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> BLUE_STEEL_STAIRS = block(DavebuildingmodModBlocks.BLUE_STEEL_STAIRS,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> BLUE_STEEL_SLAB = block(DavebuildingmodModBlocks.BLUE_STEEL_SLAB,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> BLUE_STEEL_TRAPDOOR = block(DavebuildingmodModBlocks.BLUE_STEEL_TRAPDOOR,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> BLUE_STEEL_WALL = block(DavebuildingmodModBlocks.BLUE_STEEL_WALL,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> BLUE_STEEL_TANK = block(DavebuildingmodModBlocks.BLUE_STEEL_TANK,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> BLUE_GILDED_STEEL_TANK = block(DavebuildingmodModBlocks.BLUE_GILDED_STEEL_TANK,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> BLUE_BOILER = block(DavebuildingmodModBlocks.BLUE_BOILER, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> BLUE_GILDED_BOILER = block(DavebuildingmodModBlocks.BLUE_GILDED_BOILER,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> COW_CATCHER_BLUE = block(DavebuildingmodModBlocks.COW_CATCHER_BLUE,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> BROWN_STEEL_PLATING = block(DavebuildingmodModBlocks.BROWN_STEEL_PLATING,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> BROWN_STEEL_STAIRS = block(DavebuildingmodModBlocks.BROWN_STEEL_STAIRS,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> BROWN_STEEL_SLAB = block(DavebuildingmodModBlocks.BROWN_STEEL_SLAB,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> BROWN_STEEL_TRAPDOOR = block(DavebuildingmodModBlocks.BROWN_STEEL_TRAPDOOR,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> BROWN_STEEL_WALL = block(DavebuildingmodModBlocks.BROWN_STEEL_WALL,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> BROWN_STEEL_TANK = block(DavebuildingmodModBlocks.BROWN_STEEL_TANK,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> BROWN_GILDED_STEEL_TANK = block(DavebuildingmodModBlocks.BROWN_GILDED_STEEL_TANK,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> BROWN_BOILER = block(DavebuildingmodModBlocks.BROWN_BOILER, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> BROWN_GILDED_BOILER = block(DavebuildingmodModBlocks.BROWN_GILDED_BOILER,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> COW_CATCHER_BROWN = block(DavebuildingmodModBlocks.COW_CATCHER_BROWN,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> GREEN_STEEL_PLATING = block(DavebuildingmodModBlocks.GREEN_STEEL_PLATING,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> GREEN_STEEL_STAIRS = block(DavebuildingmodModBlocks.GREEN_STEEL_STAIRS,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> GREEN_STEEL_SLAB = block(DavebuildingmodModBlocks.GREEN_STEEL_SLAB,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> GREEN_STEEL_TRAPDOOR = block(DavebuildingmodModBlocks.GREEN_STEEL_TRAPDOOR,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> GREEN_STEEL_WALL = block(DavebuildingmodModBlocks.GREEN_STEEL_WALL,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> GREEN_STEEL_TANK = block(DavebuildingmodModBlocks.GREEN_STEEL_TANK,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> GREEN_GILDED_STEEL_TANK = block(DavebuildingmodModBlocks.GREEN_GILDED_STEEL_TANK,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> GREEN_BOILER = block(DavebuildingmodModBlocks.GREEN_BOILER, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> GREEN_GILDED_BOILER = block(DavebuildingmodModBlocks.GREEN_GILDED_BOILER,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> COW_CATCHER_GREEN = block(DavebuildingmodModBlocks.COW_CATCHER_GREEN,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> RED_STEEL_PLATING = block(DavebuildingmodModBlocks.RED_STEEL_PLATING,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> RED_STEEL_STAIRS = block(DavebuildingmodModBlocks.RED_STEEL_STAIRS,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> RED_STEEL_SLAB = block(DavebuildingmodModBlocks.RED_STEEL_SLAB,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> RED_STEEL_TRAPDOOR = block(DavebuildingmodModBlocks.RED_STEEL_TRAPDOOR,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> RED_STEEL_WALL = block(DavebuildingmodModBlocks.RED_STEEL_WALL,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> RED_STEEL_TANK = block(DavebuildingmodModBlocks.RED_STEEL_TANK,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> RED_GUILDED_STEEL_TANK = block(DavebuildingmodModBlocks.RED_GUILDED_STEEL_TANK,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> RED_BOILER = block(DavebuildingmodModBlocks.RED_BOILER, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> RED_GUILDED_BOILER = block(DavebuildingmodModBlocks.RED_GUILDED_BOILER,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> COW_CATCHER_RED = block(DavebuildingmodModBlocks.COW_CATCHER_RED,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> BLACK_STEEL_PLATING = block(DavebuildingmodModBlocks.BLACK_STEEL_PLATING,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> BLACK_STEEL_STAIRS = block(DavebuildingmodModBlocks.BLACK_STEEL_STAIRS,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> BLACK_STEEL_SLAB = block(DavebuildingmodModBlocks.BLACK_STEEL_SLAB,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> BLACK_STEEL_TRAPDOOR = block(DavebuildingmodModBlocks.BLACK_STEEL_TRAPDOOR,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> BLACK_STEEL_WALL = block(DavebuildingmodModBlocks.BLACK_STEEL_WALL,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> BLACK_STEEL_TANK = block(DavebuildingmodModBlocks.BLACK_STEEL_TANK,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> BLACK_GUILDER_STEEL_TANK = block(DavebuildingmodModBlocks.BLACK_GUILDER_STEEL_TANK,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> BLACK_BOILER = block(DavebuildingmodModBlocks.BLACK_BOILER, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> BLACK_GUILDED_BOILER = block(DavebuildingmodModBlocks.BLACK_GUILDED_BOILER,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> COW_CATCHER_BLACK = block(DavebuildingmodModBlocks.COW_CATCHER_BLACK,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> CREATE_BOILER = block(DavebuildingmodModBlocks.CREATE_BOILER, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> COPPER_BOILER = block(DavebuildingmodModBlocks.COPPER_BOILER, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> ZINC_BOILER = block(DavebuildingmodModBlocks.ZINC_BOILER, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> BRASS_BOILER = block(DavebuildingmodModBlocks.BRASS_BOILER, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> TRACK_END = block(DavebuildingmodModBlocks.TRACK_END, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> GAUGE_OUTER = block(DavebuildingmodModBlocks.GAUGE_OUTER, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> GAUGE_INNER = block(DavebuildingmodModBlocks.GAUGE_INNER, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> THOMAS_FACE = block(DavebuildingmodModBlocks.THOMAS_FACE, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> ALARM_SIGN = block(DavebuildingmodModBlocks.ALARM_SIGN, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> NO_ENTRY_SIGN = block(DavebuildingmodModBlocks.NO_ENTRY_SIGN, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> ONEWAY_SIGN = block(DavebuildingmodModBlocks.ONEWAY_SIGN, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> ARROW_UP_SIGN = block(DavebuildingmodModBlocks.ARROW_UP_SIGN, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> ARROW_DOWN_SIGN = block(DavebuildingmodModBlocks.ARROW_DOWN_SIGN,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> ARROW_LEFT_SIGN = block(DavebuildingmodModBlocks.ARROW_LEFT_SIGN,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> ARROW_RIGHT_SIGN = block(DavebuildingmodModBlocks.ARROW_RIGHT_SIGN,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> ARROW_RETURN_SIGN = block(DavebuildingmodModBlocks.ARROW_RETURN_SIGN,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> BALLAST = block(DavebuildingmodModBlocks.BALLAST, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> BALLAST_SLAB = block(DavebuildingmodModBlocks.BALLAST_SLAB, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> GRAVEL_SLAB = block(DavebuildingmodModBlocks.GRAVEL_SLAB, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> ROCKY_DIRT = block(DavebuildingmodModBlocks.ROCKY_DIRT, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> ROCKY_DIRT_SLAB = block(DavebuildingmodModBlocks.ROCKY_DIRT_SLAB,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> DIRT_SLAB = block(DavebuildingmodModBlocks.DIRT_SLAB, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> HALF_LUMBER_BORDER = block(DavebuildingmodModBlocks.HALF_LUMBER_BORDER,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> HALF_LUMBER_HORIZONTAL = block(DavebuildingmodModBlocks.HALF_LUMBER_HORIZONTAL,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> HALF_LUMBER_VERTICAL = block(DavebuildingmodModBlocks.HALF_LUMBER_VERTICAL,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> HALF_LUMBER_DIAGONAL_LEFT = block(DavebuildingmodModBlocks.HALF_LUMBER_DIAGONAL_LEFT,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> HALF_LUMBER_DIAGONAL_RIGHT = block(DavebuildingmodModBlocks.HALF_LUMBER_DIAGONAL_RIGHT,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> HALF_LUMBER_BRICK_BORDER = block(DavebuildingmodModBlocks.HALF_LUMBER_BRICK_BORDER,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> HALF_LUMBER_BRICK_HORIZONTAL = block(DavebuildingmodModBlocks.HALF_LUMBER_BRICK_HORIZONTAL,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> HALF_LUMBER_BRICK_VERTICAL = block(DavebuildingmodModBlocks.HALF_LUMBER_BRICK_VERTICAL,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> HALF_LUMBER_BRICK_DIAGONAL_LEFT = block(DavebuildingmodModBlocks.HALF_LUMBER_BRICK_DIAGONAL_LEFT,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> HALF_LUMBER_BRICK_DIAGONAL_RIGHT = block(DavebuildingmodModBlocks.HALF_LUMBER_BRICK_DIAGONAL_RIGHT,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> FULL_LOG_PILE = block(DavebuildingmodModBlocks.FULL_LOG_PILE, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LOG_PILE_1_TOP = block(DavebuildingmodModBlocks.LOG_PILE_1_TOP,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LOG_PILE_2_BOTTOM = block(DavebuildingmodModBlocks.LOG_PILE_2_BOTTOM,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LOG_PILE_2_TOP = block(DavebuildingmodModBlocks.LOG_PILE_2_TOP,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LOG_PILE_1_BOTTOM = block(DavebuildingmodModBlocks.LOG_PILE_1_BOTTOM,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LOG_PALISADE = block(DavebuildingmodModBlocks.LOG_PALISADE, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LOG_PILE_CHAIR = block(DavebuildingmodModBlocks.LOG_PILE_CHAIR,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> BOOK_1 = block(DavebuildingmodModBlocks.BOOK_1, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> BOOK_2 = block(DavebuildingmodModBlocks.BOOK_2, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> SKELETON_1 = block(DavebuildingmodModBlocks.SKELETON_1, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> SKELETON_2 = block(DavebuildingmodModBlocks.SKELETON_2, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> SKELETON_3 = block(DavebuildingmodModBlocks.SKELETON_3, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> SKELETON_4 = block(DavebuildingmodModBlocks.SKELETON_4, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> SKELETON_5 = block(DavebuildingmodModBlocks.SKELETON_5, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> SKELETON_6 = block(DavebuildingmodModBlocks.SKELETON_6, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> WHITE_QUILTED_WOOL = block(DavebuildingmodModBlocks.WHITE_QUILTED_WOOL,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> ORANGE_QUILTED_WOOL = block(DavebuildingmodModBlocks.ORANGE_QUILTED_WOOL,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> MAGENTA_QUILTED_WOOL = block(DavebuildingmodModBlocks.MAGENTA_QUILTED_WOOL,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LIGHT_BLUE_QUILTED_WOOL = block(DavebuildingmodModBlocks.LIGHT_BLUE_QUILTED_WOOL,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> YELLOW_QUILTED_WOOL = block(DavebuildingmodModBlocks.YELLOW_QUILTED_WOOL,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LIME_QUILTED_WOOL = block(DavebuildingmodModBlocks.LIME_QUILTED_WOOL,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> PINK_QUILTED_WOOL = block(DavebuildingmodModBlocks.PINK_QUILTED_WOOL,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> GRAY_QUILTED_WOOL = block(DavebuildingmodModBlocks.GRAY_QUILTED_WOOL,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LIGHT_GRAY_QUILTED_WOOL = block(DavebuildingmodModBlocks.LIGHT_GRAY_QUILTED_WOOL,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> CYAN_QUILTED_WOOL = block(DavebuildingmodModBlocks.CYAN_QUILTED_WOOL,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> PURPLE_QUILTED_WOOL = block(DavebuildingmodModBlocks.PURPLE_QUILTED_WOOL,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> BLUE_QUILTED_WOOL = block(DavebuildingmodModBlocks.BLUE_QUILTED_WOOL,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> BROWN_QUILTED_WOOL = block(DavebuildingmodModBlocks.BROWN_QUILTED_WOOL,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> GREEN_QUILTED_WOOL = block(DavebuildingmodModBlocks.GREEN_QUILTED_WOOL,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> RED_QUILTED_WOOL = block(DavebuildingmodModBlocks.RED_QUILTED_WOOL,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> BLACK_QUILTED_WOOL = block(DavebuildingmodModBlocks.BLACK_QUILTED_WOOL,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> WHITE_CHAIR = block(DavebuildingmodModBlocks.WHITE_CHAIR, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> ORANGE_CHAIR = block(DavebuildingmodModBlocks.ORANGE_CHAIR, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> MAGENTA_CHAIR = block(DavebuildingmodModBlocks.MAGENTA_CHAIR, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LIGHT_BLUE_CHAIR = block(DavebuildingmodModBlocks.LIGHT_BLUE_CHAIR,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> YELLOW_CHAIR = block(DavebuildingmodModBlocks.YELLOW_CHAIR, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LIME_CHAIR = block(DavebuildingmodModBlocks.LIME_CHAIR, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> PINK_CHAIR = block(DavebuildingmodModBlocks.PINK_CHAIR, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> GRAY_CHAIR = block(DavebuildingmodModBlocks.GRAY_CHAIR, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LIGHT_GRAY_CHAIR = block(DavebuildingmodModBlocks.LIGHT_GRAY_CHAIR,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> CYAN_CHAIR = block(DavebuildingmodModBlocks.CYAN_CHAIR, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> PURPLE_CHAIR = block(DavebuildingmodModBlocks.PURPLE_CHAIR, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> BLUE_CHAIR = block(DavebuildingmodModBlocks.BLUE_CHAIR, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> BROWN_CHAIR = block(DavebuildingmodModBlocks.BROWN_CHAIR, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> GREEN_CHAIR = block(DavebuildingmodModBlocks.GREEN_CHAIR, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> RED_CHAIR = block(DavebuildingmodModBlocks.RED_CHAIR, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> BLACK_CHAIR = block(DavebuildingmodModBlocks.BLACK_CHAIR, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> SOFT_AIR = block(DavebuildingmodModBlocks.SOFT_AIR, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> HARD_AIR = block(DavebuildingmodModBlocks.HARD_AIR, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> REINFORCED_GLASS = block(DavebuildingmodModBlocks.REINFORCED_GLASS,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> ONEWAY_STONE = block(DavebuildingmodModBlocks.ONEWAY_STONE, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> ONEWAY_LABORATORY_BLOCK = block(DavebuildingmodModBlocks.ONEWAY_LABORATORY_BLOCK,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> VANTA_BLACK = block(DavebuildingmodModBlocks.VANTA_BLACK, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> STARS = block(DavebuildingmodModBlocks.STARS, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> ULTRA_WHITE = block(DavebuildingmodModBlocks.ULTRA_WHITE, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> GREEN_SCREEN = block(DavebuildingmodModBlocks.GREEN_SCREEN, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> BLUE_SCREEN = block(DavebuildingmodModBlocks.BLUE_SCREEN, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> MAGENTA_SCREEN = block(DavebuildingmodModBlocks.MAGENTA_SCREEN,
			DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> RUBBER_DUCK = block(DavebuildingmodModBlocks.RUBBER_DUCK, DavebuildingmodModTabs.TAB_DAVES_MOD_TAB);
	public static final RegistryObject<Item> LIGHTON = block(DavebuildingmodModBlocks.LIGHTON, null);
	public static final RegistryObject<Item> ALARM_LIGHTON = block(DavebuildingmodModBlocks.ALARM_LIGHTON, null);
	public static final RegistryObject<Item> GREEN_LIGHT_ON = block(DavebuildingmodModBlocks.GREEN_LIGHT_ON, null);
	public static final RegistryObject<Item> BLUE_LIGHT_ON = block(DavebuildingmodModBlocks.BLUE_LIGHT_ON, null);
	public static final RegistryObject<Item> PISS_ON = block(DavebuildingmodModBlocks.PISS_ON, null);
	public static final RegistryObject<Item> PISS_OFF = block(DavebuildingmodModBlocks.PISS_OFF, null);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
