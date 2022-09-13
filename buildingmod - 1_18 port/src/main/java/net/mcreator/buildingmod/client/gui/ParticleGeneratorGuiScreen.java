
package net.mcreator.buildingmod.client.gui;

import org.jline.terminal.Size;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.Minecraft;

import net.mcreator.buildingmod.world.inventory.ParticleGeneratorGuiMenu;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class ParticleGeneratorGuiScreen extends AbstractContainerScreen<ParticleGeneratorGuiMenu> {
	private final static HashMap<String, Object> guistate = ParticleGeneratorGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox YOffset;
	EditBox Size;

	public ParticleGeneratorGuiScreen(ParticleGeneratorGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 200;
		this.imageHeight = 194;
	}

	private static final ResourceLocation texture = new ResourceLocation("davebuildingmod:textures/screens/particle_generator_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		YOffset.render(ms, mouseX, mouseY, partialTicks);
		Size.render(ms, mouseX, mouseY, partialTicks);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (YOffset.isFocused())
			return YOffset.keyPressed(key, b, c);
		if (Size.isFocused())
			return Size.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		YOffset.tick();
		Size.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Particle Card", 63, 57, -12829636);
		this.font.draw(poseStack, "Y-Offset", 18, 21, -12829636);
		this.font.draw(poseStack, "Size", 135, 21, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		YOffset = new EditBox(this.font, this.leftPos + 18, this.topPos + 30, 45, 20, new TextComponent(""));
		guistate.put("text:YOffset", YOffset);
		YOffset.setMaxLength(32767);
		this.addWidget(this.YOffset);
		Size = new EditBox(this.font, this.leftPos + 135, this.topPos + 30, 45, 20, new TextComponent(""));
		guistate.put("text:Size", Size);
		Size.setMaxLength(32767);
		this.addWidget(this.Size);
	}
}
