package com.idtech.entity;
// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


import com.idtech.entity.TRexEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class TRexModel<T extends TRexEntity> extends EntityModel<T> {
	private final ModelRenderer Body;
	private final ModelRenderer BodySpike_r1;
	private final ModelRenderer Head;
	private final ModelRenderer BottomJaw;
	private final ModelRenderer LeftUpperArm;
	private final ModelRenderer LeftUpperArm_r1;
	private final ModelRenderer LeftHand;
	private final ModelRenderer HandNail_r1;
	private final ModelRenderer RightUpperArm;
	private final ModelRenderer RightUpperArm_r1;
	private final ModelRenderer RightHand;
	private final ModelRenderer HandNail_r2;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer RightLeg;
	private final ModelRenderer Tail;
	private final ModelRenderer Tail_r1;
	private final ModelRenderer bb_main;
	private final ModelRenderer Waist_r1;

	public TRexModel() {
		textureWidth = 64;
		textureHeight = 64;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 13.0F, -2.0F);
		

		BodySpike_r1 = new ModelRenderer(this);
		BodySpike_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(BodySpike_r1);
		setRotationAngle(BodySpike_r1, -0.5236F, 0.0F, 0.0F);
		BodySpike_r1.setTextureOffset(6, 17).addBox(0.0F, -4.0F, 9.0F, 0.0F, 2.0F, 2.0F, 0.0F, false);
		BodySpike_r1.setTextureOffset(6, 17).addBox(0.0F, -5.0F, 5.0F, 0.0F, 2.0F, 2.0F, 0.0F, false);
		BodySpike_r1.setTextureOffset(6, 17).addBox(0.0F, -5.0F, 2.0F, 0.0F, 2.0F, 2.0F, 0.0F, false);
		BodySpike_r1.setTextureOffset(6, 17).addBox(0.0F, -5.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, false);
		BodySpike_r1.setTextureOffset(6, 17).addBox(-1.0F, -5.0F, -7.0F, 0.0F, 2.0F, 2.0F, 0.0F, false);
		BodySpike_r1.setTextureOffset(6, 17).addBox(0.0F, -5.0F, -7.0F, 0.0F, 2.0F, 2.0F, 0.0F, false);
		BodySpike_r1.setTextureOffset(6, 17).addBox(0.0F, -5.0F, -4.0F, 0.0F, 2.0F, 2.0F, 0.0F, false);
		BodySpike_r1.setTextureOffset(6, 17).addBox(0.0F, -3.0F, 14.0F, 0.0F, 2.0F, 2.0F, 0.0F, false);
		BodySpike_r1.setTextureOffset(6, 17).addBox(-1.0F, -3.0F, 14.0F, 0.0F, 2.0F, 2.0F, 0.0F, false);
		BodySpike_r1.setTextureOffset(6, 17).addBox(-1.0F, -4.0F, 9.0F, 0.0F, 2.0F, 2.0F, 0.0F, false);
		BodySpike_r1.setTextureOffset(6, 17).addBox(-1.0F, -5.0F, 5.0F, 0.0F, 2.0F, 2.0F, 0.0F, false);
		BodySpike_r1.setTextureOffset(6, 17).addBox(-1.0F, -5.0F, 2.0F, 0.0F, 2.0F, 2.0F, 0.0F, false);
		BodySpike_r1.setTextureOffset(6, 17).addBox(-1.0F, -5.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, false);
		BodySpike_r1.setTextureOffset(6, 17).addBox(-1.0F, -5.0F, -4.0F, 0.0F, 2.0F, 2.0F, 0.0F, false);
		BodySpike_r1.setTextureOffset(0, 0).addBox(-5.0F, -3.0F, -6.0F, 9.0F, 5.0F, 7.0F, 0.0F, false);
		BodySpike_r1.setTextureOffset(35, 36).addBox(-2.0F, -3.0F, -8.0F, 3.0F, 4.0F, 2.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -4.0F, -6.0F);
		Body.addChild(Head);
		Head.setTextureOffset(0, 25).addBox(-3.0F, -2.4F, -7.2F, 5.0F, 2.0F, 7.0F, 0.0F, false);
		Head.setTextureOffset(21, 22).addBox(-2.0F, -3.4F, -9.2F, 3.0F, 1.0F, 9.0F, 0.0F, false);
		Head.setTextureOffset(41, 38).addBox(0.0F, -4.4F, -5.2F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		Head.setTextureOffset(24, 41).addBox(-2.0F, -4.4F, -5.2F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		Head.setTextureOffset(0, 16).addBox(-0.4F, -5.4F, -7.2F, 0.0F, 2.0F, 7.0F, 0.0F, true);
		Head.setTextureOffset(35, 18).addBox(-3.0F, -1.4F, -9.2F, 5.0F, 1.0F, 2.0F, 0.0F, false);
		Head.setTextureOffset(25, 0).addBox(-2.0F, -2.4F, -10.2F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		Head.setTextureOffset(14, 23).addBox(-3.0F, -0.4F, -9.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(14, 23).addBox(-1.0F, -0.4F, -9.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(14, 23).addBox(1.0F, -0.4F, -9.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(14, 23).addBox(1.0F, -0.4F, -7.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(14, 23).addBox(1.0F, -0.4F, -5.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(14, 23).addBox(1.0F, -0.4F, -3.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(14, 23).addBox(-3.0F, -0.4F, -3.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(14, 23).addBox(-3.0F, -0.4F, -5.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(14, 23).addBox(-3.0F, -0.4F, -7.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		BottomJaw = new ModelRenderer(this);
		BottomJaw.setRotationPoint(0.0F, 0.0F, -1.0F);
		Head.addChild(BottomJaw);
		BottomJaw.setTextureOffset(20, 12).addBox(-2.0F, 1.6F, -9.2F, 3.0F, 1.0F, 9.0F, 0.0F, false);
		BottomJaw.setTextureOffset(14, 23).addBox(1.0F, -0.4F, -5.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		BottomJaw.setTextureOffset(14, 23).addBox(1.0F, -0.4F, -3.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		BottomJaw.setTextureOffset(14, 23).addBox(1.0F, -0.4F, -1.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		BottomJaw.setTextureOffset(14, 23).addBox(1.0F, -0.4F, -7.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		BottomJaw.setTextureOffset(14, 23).addBox(0.0F, -0.4F, -8.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		BottomJaw.setTextureOffset(14, 23).addBox(-2.0F, -0.4F, -8.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		BottomJaw.setTextureOffset(14, 23).addBox(-3.0F, -0.4F, -7.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		BottomJaw.setTextureOffset(14, 23).addBox(-3.0F, -0.4F, -5.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		BottomJaw.setTextureOffset(14, 23).addBox(-3.0F, -0.4F, -3.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		BottomJaw.setTextureOffset(14, 23).addBox(-3.0F, -0.4F, -1.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		BottomJaw.setTextureOffset(0, 12).addBox(-3.0F, 0.6F, -9.2F, 5.0F, 1.0F, 10.0F, 0.0F, false);

		LeftUpperArm = new ModelRenderer(this);
		LeftUpperArm.setRotationPoint(-6.0F, -2.0F, -3.0F);
		Body.addChild(LeftUpperArm);
		

		LeftUpperArm_r1 = new ModelRenderer(this);
		LeftUpperArm_r1.setRotationPoint(0.0F, 0.0F, 1.0F);
		LeftUpperArm.addChild(LeftUpperArm_r1);
		setRotationAngle(LeftUpperArm_r1, -0.5672F, 0.0F, 0.0F);
		LeftUpperArm_r1.setTextureOffset(20, 12).addBox(-2.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		LeftUpperArm_r1.setTextureOffset(0, 0).addBox(0.0F, -1.0F, -2.0F, 1.0F, 5.0F, 2.0F, 0.0F, false);

		LeftHand = new ModelRenderer(this);
		LeftHand.setRotationPoint(0.0F, 2.0F, -1.0F);
		LeftUpperArm.addChild(LeftHand);
		

		HandNail_r1 = new ModelRenderer(this);
		HandNail_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		LeftHand.addChild(HandNail_r1);
		setRotationAngle(HandNail_r1, -1.4399F, 0.0F, 0.0F);
		HandNail_r1.setTextureOffset(0, 34).addBox(0.0F, 3.3386F, 3.3122F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		HandNail_r1.setTextureOffset(26, 23).addBox(-2.0F, 3.3386F, 3.3122F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		HandNail_r1.setTextureOffset(20, 18).addBox(1.0F, 3.3386F, 1.3122F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		HandNail_r1.setTextureOffset(24, 18).addBox(0.0F, 4.3386F, 2.3122F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		HandNail_r1.setTextureOffset(17, 30).addBox(-2.0F, 4.3386F, 2.3122F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		HandNail_r1.setTextureOffset(0, 19).addBox(-1.0F, 5.3386F, -0.6878F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		HandNail_r1.setTextureOffset(17, 23).addBox(-2.0F, 3.3386F, -0.6878F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		HandNail_r1.setTextureOffset(34, 42).addBox(-1.0F, 0.3386F, -0.6878F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		RightUpperArm = new ModelRenderer(this);
		RightUpperArm.setRotationPoint(5.0F, -2.0F, -3.0F);
		Body.addChild(RightUpperArm);
		

		RightUpperArm_r1 = new ModelRenderer(this);
		RightUpperArm_r1.setRotationPoint(0.0F, 0.0F, 1.0F);
		RightUpperArm.addChild(RightUpperArm_r1);
		setRotationAngle(RightUpperArm_r1, -0.5672F, 0.0F, 0.0F);
		RightUpperArm_r1.setTextureOffset(20, 12).addBox(0.0F, 0.0F, -2.0F, 2.0F, 4.0F, 2.0F, 0.0F, true);
		RightUpperArm_r1.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -2.0F, 1.0F, 5.0F, 2.0F, 0.0F, true);

		RightHand = new ModelRenderer(this);
		RightHand.setRotationPoint(0.0F, 2.0F, -1.0F);
		RightUpperArm.addChild(RightHand);
		

		HandNail_r2 = new ModelRenderer(this);
		HandNail_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		RightHand.addChild(HandNail_r2);
		setRotationAngle(HandNail_r2, -1.4399F, 0.0F, 0.0F);
		HandNail_r2.setTextureOffset(0, 34).addBox(-1.0F, 3.3386F, 3.3122F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		HandNail_r2.setTextureOffset(26, 23).addBox(1.0F, 3.3386F, 3.3122F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		HandNail_r2.setTextureOffset(20, 18).addBox(-2.0F, 3.3386F, 1.3122F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		HandNail_r2.setTextureOffset(24, 18).addBox(-1.0F, 4.3386F, 2.3122F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		HandNail_r2.setTextureOffset(17, 30).addBox(1.0F, 4.3386F, 2.3122F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		HandNail_r2.setTextureOffset(0, 19).addBox(-1.0F, 5.3386F, -0.6878F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		HandNail_r2.setTextureOffset(17, 23).addBox(-1.0F, 3.3386F, -0.6878F, 3.0F, 2.0F, 3.0F, 0.0F, true);
		HandNail_r2.setTextureOffset(34, 42).addBox(-1.0F, 0.3386F, -0.6878F, 2.0F, 3.0F, 2.0F, 0.0F, true);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(-6.0F, 1.0F, 3.0F);
		Body.addChild(LeftLeg);
		LeftLeg.setTextureOffset(14, 41).addBox(0.0F, 5.0F, -1.0F, 3.0F, 4.0F, 2.0F, 0.0F, false);
		LeftLeg.setTextureOffset(0, 34).addBox(-1.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
		LeftLeg.setTextureOffset(36, 22).addBox(0.0F, 9.0F, -2.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		LeftLeg.setTextureOffset(30, 32).addBox(-1.0F, 9.0F, -5.0F, 5.0F, 1.0F, 3.0F, 0.0F, false);
		LeftLeg.setTextureOffset(36, 27).addBox(0.0F, 8.0F, -4.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		LeftLeg.setTextureOffset(17, 28).addBox(-1.0F, 8.0F, -5.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		LeftLeg.setTextureOffset(0, 28).addBox(-1.0F, 9.0F, -7.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		LeftLeg.setTextureOffset(25, 4).addBox(1.0F, 9.0F, -7.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		LeftLeg.setTextureOffset(16, 34).addBox(1.0F, 8.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		LeftLeg.setTextureOffset(12, 34).addBox(3.0F, 8.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		LeftLeg.setTextureOffset(32, 10).addBox(-1.0F, 8.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		LeftLeg.setTextureOffset(0, 25).addBox(3.0F, 9.0F, -7.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		LeftLeg.setTextureOffset(20, 34).addBox(1.0F, 9.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(6.0F, 1.0F, 3.0F);
		Body.addChild(RightLeg);
		RightLeg.setTextureOffset(14, 41).addBox(-3.0F, 5.0F, -1.0F, 3.0F, 4.0F, 2.0F, 0.0F, true);
		RightLeg.setTextureOffset(0, 34).addBox(-3.0F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, true);
		RightLeg.setTextureOffset(36, 22).addBox(-3.0F, 9.0F, -2.0F, 3.0F, 1.0F, 4.0F, 0.0F, true);
		RightLeg.setTextureOffset(30, 32).addBox(-4.0F, 9.0F, -5.0F, 5.0F, 1.0F, 3.0F, 0.0F, true);
		RightLeg.setTextureOffset(36, 27).addBox(-3.0F, 8.0F, -4.0F, 3.0F, 1.0F, 3.0F, 0.0F, true);
		RightLeg.setTextureOffset(17, 28).addBox(-4.0F, 8.0F, -5.0F, 5.0F, 1.0F, 1.0F, 0.0F, true);
		RightLeg.setTextureOffset(0, 28).addBox(0.0F, 9.0F, -7.0F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		RightLeg.setTextureOffset(25, 4).addBox(-2.0F, 9.0F, -7.0F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		RightLeg.setTextureOffset(16, 34).addBox(-2.0F, 8.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		RightLeg.setTextureOffset(12, 34).addBox(-4.0F, 8.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		RightLeg.setTextureOffset(32, 10).addBox(0.0F, 8.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		RightLeg.setTextureOffset(0, 25).addBox(-4.0F, 9.0F, -7.0F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		RightLeg.setTextureOffset(20, 34).addBox(-2.0F, 9.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(0.0F, 2.0F, 6.0F);
		Body.addChild(Tail);
		

		Tail_r1 = new ModelRenderer(this);
		Tail_r1.setRotationPoint(0.0F, -2.0F, -6.0F);
		Tail.addChild(Tail_r1);
		setRotationAngle(Tail_r1, -0.5236F, 0.0F, 0.0F);
		Tail_r1.setTextureOffset(0, 43).addBox(-2.0F, 0.0F, 18.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		Tail_r1.setTextureOffset(35, 10).addBox(-2.0F, -1.0F, 13.0F, 3.0F, 3.0F, 5.0F, 0.0F, false);
		Tail_r1.setTextureOffset(19, 32).addBox(-2.0F, -2.0F, 8.0F, 3.0F, 4.0F, 5.0F, 0.0F, false);
		Tail_r1.setTextureOffset(0, 12).addBox(-2.0F, -3.0F, 6.0F, 3.0F, 5.0F, 2.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		Waist_r1 = new ModelRenderer(this);
		Waist_r1.setRotationPoint(0.0F, -11.0F, -2.0F);
		bb_main.addChild(Waist_r1);
		setRotationAngle(Waist_r1, -0.5236F, 0.0F, 0.0F);
		Waist_r1.setTextureOffset(32, 0).addBox(-3.0F, -3.0F, 1.0F, 5.0F, 5.0F, 5.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		//TODO: Animation System
		//v2: Now with proper group pivots!

		//We do get the entityIn so we can use local state machine vars!!
		//The following should get a smooth consistent motion
		RightUpperArm.rotateAngleX = MathHelper.cos(0.05F * ageInTicks) * 0.5F + 0.5f;
		LeftUpperArm.rotateAngleX = MathHelper.cos(0.05F * ageInTicks) * 0.5F + 0.5f;
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}