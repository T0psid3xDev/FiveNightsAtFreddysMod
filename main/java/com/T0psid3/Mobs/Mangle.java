package com.T0psid3.Mobs;

import java.util.Random;

import com.T0psid3.ModelMangle;
import com.T0psid3.Mobs.Mangle;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Mangle {
	//this anamatrnoic has no AI
	public static int mobid = 0;
	public Object instance;

    public void load(){}

    public void generateNether(World world, Random random, int chunkX, int chunkZ){}
	public void generateSurface(World world, Random random, int chunkX, int chunkZ){}
	public int addFuel(ItemStack fuel){
		return 0;
	}
	@SideOnly(Side.CLIENT)
	public void registerRenderers(){
		RenderingRegistry.registerEntityRenderingHandler(Mangle.Entitymangle.class, new RenderLiving(new ModelMangle(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("the mangle texture V3.5.png");}});
	}
	public void serverLoad(FMLServerStartingEvent event){}
	@SuppressWarnings("unchecked")
	public void preInit(FMLPreInitializationEvent event){
		int entityID = EntityRegistry.findGlobalUniqueEntityId();
		mobid = entityID;
		EntityRegistry.registerGlobalEntityID(Mangle.Entitymangle.class, "mangle", entityID);
		EntityRegistry.registerModEntity(Mangle.Entitymangle.class, "mangle", entityID, instance, 64, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, (255 << 16) + (255 << 8) + 255, (255 << 16) + (255 << 8) + 255));
		EntityRegistry.addSpawn(Mangle.Entitymangle.class, 20, 3, 30, EnumCreatureType.monster , new BiomeGenBase[]{BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.desert, BiomeGenBase.extremeHills, BiomeGenBase.forest, BiomeGenBase.taiga, BiomeGenBase.swampland, BiomeGenBase.river, BiomeGenBase.frozenOcean, BiomeGenBase.frozenRiver, BiomeGenBase.icePlains, BiomeGenBase.iceMountains, BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore, BiomeGenBase.beach, BiomeGenBase.desertHills, BiomeGenBase.forestHills, BiomeGenBase.taigaHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.jungle, BiomeGenBase.jungleHills, BiomeGenBase.jungleEdge, BiomeGenBase.deepOcean, BiomeGenBase.stoneBeach, BiomeGenBase.coldBeach, BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.roofedForest, BiomeGenBase.coldTaiga, BiomeGenBase.coldTaigaHills, BiomeGenBase.megaTaiga, BiomeGenBase.megaTaigaHills, BiomeGenBase.extremeHillsPlus, BiomeGenBase.savanna, BiomeGenBase.savannaPlateau, BiomeGenBase.mesa, BiomeGenBase.mesaPlateau_F, BiomeGenBase.mesaPlateau});

        
	}

    /*public Entity spawnEntity(int var1, World var2, double var3, double var5, double var7)
    {
        if(var1==mobid)
                return new mcreator_mangle.Entitymangle(var2);
        else
                return null;
    }*/


   public static class Entitymangle extends EntityMob 
	{
		World world = null;
	    public Entitymangle(World var1)
	    {
	        super(var1);
	        world = var1;
	        experienceValue = 5;
	        this.isImmuneToFire = false;
	        addRandomArmor();
        	
	    }

	    

protected void applyEntityAttributes(){
super.applyEntityAttributes();
this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25D);
this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10D);
if(this.getEntityAttribute(SharedMonsterAttributes.attackDamage)!=null)this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(3D);
}


	    

	    
protected void addRandomArmor(){

}



    	public boolean isAIEnabled()
		{
			   return false;
    	}

	    /**
	     * Drop 0-2 items of this living's type
	     */
	    protected void dropFewItems(boolean var1, int var2)
	    {
	        this.entityDropItem(new ItemStack(Items.diamond_chestplate), 0.0F);
	    }

	    /**
	     * Returns the sound this mob makes while it's alive.
	     */
	    protected String getLivingSound()
	    {
	        return "";
	    }

	    /**
	     * Returns the sound this mob makes when it is hurt.
	     */
	    protected String getHurtSound()
	    {
	        return "";
	    }

	    /**
	     * Returns the sound this mob makes on death.
	     */
	    protected String getDeathSound()
	    {
	        return "";
	    }

	    public void onStruckByLightning(EntityLightningBolt entityLightningBolt){
			
		}

		protected void fall(float l){
			super.fall(l);
			
		}

    	public void onCriticalHit(Entity entity2) {
			
		}

		public void onKillEntity(EntityLiving entityLiving){
			
		}

		public boolean interact(EntityPlayer entity2){
			return true;
		}

		public String getEntityName(){
			return "mangle";
		}

	}

	
// Date: 2/18/2015 3:52:47 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX








public static class Modelbonnie extends ModelBase
{
//fields
ModelRenderer Shape2;
ModelRenderer Shape3;
ModelRenderer Shape4;
ModelRenderer Shape5;
ModelRenderer Shape6;
ModelRenderer Shape7;
ModelRenderer Shape8;
ModelRenderer Shape9;
ModelRenderer Shape10;
ModelRenderer Shape11;
ModelRenderer Shape12;
ModelRenderer Shape13;
ModelRenderer Shape14;
ModelRenderer Shape15;
ModelRenderer Shape16;
ModelRenderer Shape17;
ModelRenderer Shape18;
ModelRenderer Shape19;
ModelRenderer Shape20;
ModelRenderer Shape21;
ModelRenderer Shape22;
ModelRenderer Shape23;
ModelRenderer Shape24;
ModelRenderer Shape25;
ModelRenderer Shape26;
ModelRenderer Shape27;
ModelRenderer Shape28;
ModelRenderer Shape29;
ModelRenderer Shape30;
ModelRenderer Shape31;
ModelRenderer Shape32;
ModelRenderer Shape33;
ModelRenderer Shape34;
ModelRenderer Shape35;
ModelRenderer Shape36;
ModelRenderer Shape37;
ModelRenderer Shape38;
ModelRenderer Shape39;
ModelRenderer Shape391;
ModelRenderer Shape40;
ModelRenderer Shape41;
ModelRenderer Shape42;
ModelRenderer Shape43;
ModelRenderer Shape44;
ModelRenderer Shape45;
ModelRenderer Shape46;
ModelRenderer Shape47;
ModelRenderer Shape48;
ModelRenderer Shape49;
ModelRenderer Shape50;
ModelRenderer Shape51;
ModelRenderer Shape52;
ModelRenderer Shape53;
ModelRenderer Shape54;
ModelRenderer Shape55;
ModelRenderer Shape56;
ModelRenderer Shape57;
ModelRenderer Shape58;
ModelRenderer Shape59;
ModelRenderer Shape60;
ModelRenderer Shape61;
ModelRenderer Shape62;
ModelRenderer Shape63;
ModelRenderer Shape64;
ModelRenderer Shape65;
ModelRenderer Shape66;
ModelRenderer Shape67;
ModelRenderer Shape68;
ModelRenderer Shape69;
ModelRenderer Shape70;
ModelRenderer Shape71;
ModelRenderer Shape72;

public Modelbonnie()
{
textureWidth = 128;
textureHeight = 64;

Shape2 = new ModelRenderer(this, 66, 56);
Shape2.addBox(-2F, 0.1F, -5F, 4, 1, 5);
Shape2.setRotationPoint(0F, -3.433333F, 2.733333F);
Shape2.setTextureSize(128, 64);
Shape2.mirror = true;
setRotation(Shape2, 0.122173F, 0F, 0F);
Shape3 = new ModelRenderer(this, 0, 13);
Shape3.addBox(-1.5F, 0.1F, -9F, 3, 1, 4);
Shape3.setRotationPoint(0F, -3.433333F, 2.733333F);
Shape3.setTextureSize(128, 64);
Shape3.mirror = true;
setRotation(Shape3, 0.122173F, 0F, 0F);
Shape4 = new ModelRenderer(this, 50, 44);
Shape4.addBox(-3F, -6F, -4F, 6, 4, 5);
Shape4.setRotationPoint(0F, -2.433333F, 2.733333F);
Shape4.setTextureSize(128, 64);
Shape4.mirror = true;
setRotation(Shape4, 0F, 0F, 0F);
Shape5 = new ModelRenderer(this, 44, 56);
Shape5.addBox(-2.5F, -2F, -2F, 5, 2, 3);
Shape5.setRotationPoint(0F, -2.433333F, 2.7F);
Shape5.setTextureSize(128, 64);
Shape5.mirror = true;
setRotation(Shape5, 0F, 0F, 0F);
Shape6 = new ModelRenderer(this, 50, 38);
Shape6.addBox(-2.5F, -7F, -3.5F, 5, 1, 4);
Shape6.setRotationPoint(0F, -2.433333F, 2.733333F);
Shape6.setTextureSize(128, 64);
Shape6.mirror = true;
setRotation(Shape6, 0F, 0F, 0F);
Shape7 = new ModelRenderer(this, 18, 14);
Shape7.addBox(-2F, -3F, -6F, 4, 2, 2);
Shape7.setRotationPoint(0F, -2.433333F, 2.733333F);
Shape7.setTextureSize(128, 64);
Shape7.mirror = true;
setRotation(Shape7, 0F, 0F, 0F);
Shape8 = new ModelRenderer(this, 36, 20);
Shape8.addBox(-1.5F, -3F, -9F, 3, 2, 3);
Shape8.setRotationPoint(0F, -2.433333F, 2.733333F);
Shape8.setTextureSize(128, 64);
Shape8.mirror = true;
setRotation(Shape8, 0F, 0F, 0F);
Shape9 = new ModelRenderer(this, 36, 17);
Shape9.addBox(-0.5F, -1.5F, -0.5F, 1, 1, 1);
Shape9.setRotationPoint(0F, -4.433333F, -6.266667F);
Shape9.setTextureSize(128, 64);
Shape9.mirror = true;
setRotation(Shape9, -0.3665191F, 0F, 0F);
Shape10 = new ModelRenderer(this, 34, 11);
Shape10.addBox(-1.5F, -5F, -1F, 3, 3, 1);
Shape10.setRotationPoint(-2F, -7.433333F, 2.733333F);
Shape10.setTextureSize(128, 64);
Shape10.mirror = true;
setRotation(Shape10, 0F, 0F, -1.047198F);
Shape11 = new ModelRenderer(this, 34, 11);
Shape11.addBox(-1.5F, -5F, -1F, 3, 3, 1);
Shape11.setRotationPoint(2F, -7.433333F, 2.733333F);
Shape11.setTextureSize(128, 64);
Shape11.mirror = true;
setRotation(Shape11, 0F, 0F, 1.047198F);
Shape12 = new ModelRenderer(this, 20, 9);
Shape12.addBox(-1F, -6F, -1F, 2, 1, 1);
Shape12.setRotationPoint(-2F, -7.433333F, 2.733333F);
Shape12.setTextureSize(128, 64);
Shape12.mirror = true;
setRotation(Shape12, 0F, 0F, -1.047198F);
Shape13 = new ModelRenderer(this, 20, 9);
Shape13.addBox(-1F, -2F, -1F, 2, 1, 1);
Shape13.setRotationPoint(-2F, -7.433333F, 2.733333F);
Shape13.setTextureSize(128, 64);
Shape13.mirror = true;
setRotation(Shape13, 0F, 0F, -1.047198F);
Shape14 = new ModelRenderer(this, 20, 9);
Shape14.addBox(-1F, -6F, -1F, 2, 1, 1);
Shape14.setRotationPoint(2F, -7.433333F, 2.733333F);
Shape14.setTextureSize(128, 64);
Shape14.mirror = true;
setRotation(Shape14, 0F, 0F, 1.047198F);
Shape15 = new ModelRenderer(this, 20, 9);
Shape15.addBox(-1F, -2F, -1F, 2, 1, 1);
Shape15.setRotationPoint(2F, -7.433333F, 2.733333F);
Shape15.setTextureSize(128, 64);
Shape15.mirror = true;
setRotation(Shape15, 0F, 0F, 1.047198F);
Shape16 = new ModelRenderer(this, 12, 8);
Shape16.addBox(-0.5F, -7F, -1F, 1, 1, 1);
Shape16.setRotationPoint(-2F, -7.433333F, 2.733333F);
Shape16.setTextureSize(128, 64);
Shape16.mirror = true;
setRotation(Shape16, 0F, 0F, -1.047198F);
Shape17 = new ModelRenderer(this, 12, 8);
Shape17.addBox(-0.5F, -7F, -1F, 1, 1, 1);
Shape17.setRotationPoint(2F, -7.433333F, 2.733333F);
Shape17.setTextureSize(128, 64);
Shape17.mirror = true;
setRotation(Shape17, 0F, 0F, 1.047198F);
Shape18 = new ModelRenderer(this, 81, 44);
Shape18.addBox(-6F, -2F, -4F, 12, 1, 3);
Shape18.setRotationPoint(0F, -2.433333F, 2.733333F);
Shape18.setTextureSize(128, 64);
Shape18.mirror = true;
setRotation(Shape18, 0F, 0F, 0F);
Shape19 = new ModelRenderer(this, 30, 44);
Shape19.addBox(-3F, -1F, -1.5F, 3, 1, 2);
Shape19.setRotationPoint(-2.666667F, -4.4F, 1F);
Shape19.setTextureSize(128, 64);
Shape19.mirror = true;
setRotation(Shape19, 0F, 0F, -0.3316126F);
Shape20 = new ModelRenderer(this, 30, 39);
Shape20.addBox(0F, -1F, -1.5F, 3, 1, 2);
Shape20.setRotationPoint(2.7F, -4.433333F, 1F);
Shape20.setTextureSize(128, 64);
Shape20.mirror = true;
setRotation(Shape20, 0F, 0F, 0.3316126F);
Shape21 = new ModelRenderer(this, 18, 19);
Shape21.addBox(-1F, -0.5F, -1F, 2, 8, 2);
Shape21.setRotationPoint(0.1F, -2.766667F, 2.333333F);
Shape21.setTextureSize(128, 64);
Shape21.mirror = true;
setRotation(Shape21, 0.418879F, 0F, 0F);
Shape22 = new ModelRenderer(this, 18, 19);
Shape22.addBox(-1F, -0.5F, -1F, 2, 8, 2);
Shape22.setRotationPoint(0F, 4.033333F, 5.2F);
Shape22.setTextureSize(128, 64);
Shape22.mirror = true;
setRotation(Shape22, -0.3316126F, 0F, 0F);
Shape23 = new ModelRenderer(this, 18, 38);
Shape23.addBox(-1.5F, 3F, -2F, 3, 2, 1);
Shape23.setRotationPoint(0F, 4.033333F, 5.2F);
Shape23.setTextureSize(128, 64);
Shape23.mirror = true;
setRotation(Shape23, -0.3316126F, 0F, 0F);
Shape24 = new ModelRenderer(this, 18, 32);
Shape24.addBox(-2.466667F, 2.5F, -2F, 1, 3, 1);
Shape24.setRotationPoint(0F, 4.033333F, 5.2F);
Shape24.setTextureSize(128, 64);
Shape24.mirror = true;
setRotation(Shape24, -0.3316126F, 0F, 0F);
Shape25 = new ModelRenderer(this, 18, 32);
Shape25.addBox(1.5F, 2.5F, -2F, 1, 3, 1);
Shape25.setRotationPoint(0F, 4.033333F, 5.2F);
Shape25.setTextureSize(128, 64);
Shape25.mirror = true;
setRotation(Shape25, -0.3316126F, 0F, 0F);
Shape26 = new ModelRenderer(this, 18, 19);
Shape26.addBox(-1F, -0.5F, -1F, 2, 8, 2);
Shape26.setRotationPoint(0F, 11.03333F, 3.8F);
Shape26.setTextureSize(128, 64);
Shape26.mirror = true;
setRotation(Shape26, 0F, 0F, 1.989675F);
Shape27 = new ModelRenderer(this, 18, 19);
Shape27.addBox(-1F, -0.5F, -1F, 2, 8, 2);
Shape27.setRotationPoint(-6.4F, 8.033334F, 3.9F);
Shape27.setTextureSize(128, 64);
Shape27.mirror = true;
setRotation(Shape27, 0F, 0F, 2.70526F);
Shape28 = new ModelRenderer(this, 1, 50);
Shape28.addBox(-2.5F, -0.5F, -1F, 5, 4, 5);
Shape28.setRotationPoint(-9.866667F, -1.966667F, 1.166667F);
Shape28.setTextureSize(128, 64);
Shape28.mirror = true;
setRotation(Shape28, 0F, 0F, 0F);
Shape29 = new ModelRenderer(this, 1, 42);
Shape29.addBox(-2.5F, -0.5F, -3F, 5, 1, 3);
Shape29.setRotationPoint(-9.866667F, 1.966667F, 3.166667F);
Shape29.setTextureSize(128, 64);
Shape29.mirror = true;
setRotation(Shape29, 0.2443461F, 0F, 0F);
Shape30 = new ModelRenderer(this, 25, 54);
Shape30.addBox(-2F, -0.5F, -3F, 4, 1, 3);
Shape30.setRotationPoint(-9.866667F, 1.433333F, 3.366667F);
Shape30.setTextureSize(128, 64);
Shape30.mirror = true;
setRotation(Shape30, 0F, 0F, 0F);
Shape31 = new ModelRenderer(this, 18, 19);
Shape31.addBox(-1F, -0.5F, -1F, 2, 8, 2);
Shape31.setRotationPoint(0F, 11.03333F, 3.666667F);
Shape31.setTextureSize(128, 64);
Shape31.mirror = true;
setRotation(Shape31, 0.1396263F, 0F, -1.413717F);
Shape32 = new ModelRenderer(this, 18, 19);
Shape32.addBox(-1F, -0.5F, -1F, 2, 8, 2);
Shape32.setRotationPoint(7F, 12.03333F, 4.6F);
Shape32.setTextureSize(128, 64);
Shape32.mirror = true;
setRotation(Shape32, 0.0698132F, 0F, -0.8203047F);
Shape33 = new ModelRenderer(this, 18, 19);
Shape33.addBox(-1F, -0.5F, -1F, 2, 8, 2);
Shape33.setRotationPoint(11.86667F, 17.36667F, 5.2F);
Shape33.setTextureSize(128, 64);
Shape33.mirror = true;
setRotation(Shape33, -0.5759587F, 0F, 0F);
Shape34 = new ModelRenderer(this, 96, 21);
Shape34.addBox(-1.5F, 0.5F, -3F, 3, 1, 3);
Shape34.setRotationPoint(11.86667F, 22.36667F, 2.2F);
Shape34.setTextureSize(128, 64);
Shape34.mirror = true;
setRotation(Shape34, 0F, 0F, 0F);
Shape35 = new ModelRenderer(this, 18, 19);
Shape35.addBox(-1F, -0.5F, -1F, 2, 8, 2);
Shape35.setRotationPoint(0.7333333F, 10.03333F, 4.133333F);
Shape35.setTextureSize(128, 64);
Shape35.mirror = true;
setRotation(Shape35, 0.1396263F, 0F, -2.059489F);
Shape36 = new ModelRenderer(this, 18, 19);
Shape36.addBox(-1F, -0.5F, -1F, 2, 8, 2);
Shape36.setRotationPoint(7.466667F, 6.633333F, 5.333333F);
Shape36.setTextureSize(128, 64);
Shape36.mirror = true;
setRotation(Shape36, -0.5759587F, 0F, -2.059489F);
Shape37 = new ModelRenderer(this, 66, 19);
Shape37.addBox(-2F, -0.5F, -6F, 4, 2, 6);
Shape37.setRotationPoint(12.46667F, 2.966667F, 2.133333F);
Shape37.setTextureSize(128, 64);
Shape37.mirror = true;
setRotation(Shape37, 0.296706F, 0F, 0F);
Shape38 = new ModelRenderer(this, 18, 19);
Shape38.addBox(-1F, -0.5F, -1F, 2, 8, 2);
Shape38.setRotationPoint(0F, 11.03333F, 3.666667F);
Shape38.setTextureSize(128, 64);
Shape38.mirror = true;
setRotation(Shape38, 0.8726646F, 0F, 0.3839724F);
Shape39 = new ModelRenderer(this, 18, 19);
Shape39.addBox(-1F, -0.5F, -1F, 2, 8, 2);
Shape39.setRotationPoint(-1.533333F, 15.3F, 8.466666F);
Shape39.setTextureSize(128, 64);
Shape39.mirror = true;
setRotation(Shape39, -1.466077F, 0F, 0.3839724F);
Shape39 = new ModelRenderer(this, 18, 19);
Shape39.addBox(-1F, -0.5F, -1F, 2, 8, 2);
Shape39.setRotationPoint(-1.533333F, 15.76667F, 1.266667F);
Shape39.setTextureSize(128, 64);
Shape39.mirror = true;
setRotation(Shape39, -0.2443461F, 0F, 0.1919862F);
Shape40 = new ModelRenderer(this, 96, 21);
Shape40.addBox(-1.5F, 0.5F, -3F, 3, 1, 3);
Shape40.setRotationPoint(-2.733333F, 22.36667F, -9.992007E-15F);
Shape40.setTextureSize(128, 64);
Shape40.mirror = true;
setRotation(Shape40, 0F, 0F, 0F);
Shape41 = new ModelRenderer(this, 18, 19);
Shape41.addBox(-1F, -0.5F, -1F, 2, 8, 2);
Shape41.setRotationPoint(0F, 11.03333F, 3.666667F);
Shape41.setTextureSize(128, 64);
Shape41.mirror = true;
setRotation(Shape41, 0.4712389F, 0F, -0.4712389F);
Shape42 = new ModelRenderer(this, 18, 19);
Shape42.addBox(-1F, -0.5F, -1F, 2, 8, 2);
Shape42.setRotationPoint(3F, 17.03333F, 6.666667F);
Shape42.setTextureSize(128, 64);
Shape42.mirror = true;
setRotation(Shape42, -1.160971F, 0F, -0.4712389F);
Shape43 = new ModelRenderer(this, 18, 19);
Shape43.addBox(-1F, -0.5F, -1F, 2, 8, 2);
Shape43.setRotationPoint(0F, 11.03333F, 3.666667F);
Shape43.setTextureSize(128, 64);
Shape43.mirror = true;
setRotation(Shape43, 0.2232851F, 0F, 1.239081F);
Shape44 = new ModelRenderer(this, 18, 19);
Shape44.addBox(-1F, -0.5F, -1F, 2, 8, 2);
Shape44.setRotationPoint(-6.8F, 13.36667F, 5F);
Shape44.setTextureSize(128, 64);
Shape44.mirror = true;
setRotation(Shape44, -0.7540993F, 0.2617994F, 0.2791494F);
Shape45 = new ModelRenderer(this, 18, 19);
Shape45.addBox(-1F, -0.5F, -1F, 2, 8, 2);
Shape45.setRotationPoint(-9.666667F, 17.9F, 0.6666667F);
Shape45.setTextureSize(128, 64);
Shape45.mirror = true;
setRotation(Shape45, 0.8341503F, 0F, 0.0871632F);
Shape46 = new ModelRenderer(this, 66, 19);
Shape46.addBox(-2F, 0F, -6F, 4, 2, 6);
Shape46.setRotationPoint(-10F, 21.96667F, 6.133333F);
Shape46.setTextureSize(128, 64);
Shape46.mirror = true;
setRotation(Shape46, 0F, 0.3665191F, 0F);
Shape47 = new ModelRenderer(this, 18, 19);
Shape47.addBox(-1F, -0.5F, -1F, 2, 8, 2);
Shape47.setRotationPoint(-0.2666667F, 9.033334F, 4.133333F);
Shape47.setTextureSize(128, 64);
Shape47.mirror = true;
setRotation(Shape47, 0.8726646F, 0F, -2.548181F);
Shape48 = new ModelRenderer(this, 18, 19);
Shape48.addBox(-1F, -0.5F, -1F, 2, 8, 2);
Shape48.setRotationPoint(2.533333F, 5.033333F, 9.133333F);
Shape48.setTextureSize(128, 64);
Shape48.mirror = true;
setRotation(Shape48, 3.141593F, 0F, 0.4712389F);
Shape49 = new ModelRenderer(this, 18, 19);
Shape49.addBox(-1F, -0.5F, -1F, 2, 8, 2);
Shape49.setRotationPoint(6.133333F, -1.966667F, 9.133333F);
Shape49.setTextureSize(128, 64);
Shape49.mirror = true;
setRotation(Shape49, -2.212127F, 0F, 0.4712389F);
Shape50 = new ModelRenderer(this, 49, 46);
Shape50.addBox(-2.5F, -5F, -4.1F, 2, 2, 1);
Shape50.setRotationPoint(0F, -2.433333F, 2.733333F);
Shape50.setTextureSize(128, 64);
Shape50.mirror = true;
setRotation(Shape50, 0F, 0F, 0F);
Shape51 = new ModelRenderer(this, 67, 46);
Shape51.addBox(0.5F, -5F, -4.1F, 2, 2, 1);
Shape51.setRotationPoint(0F, -2.433333F, 2.733333F);
Shape51.setTextureSize(128, 64);
Shape51.mirror = true;
setRotation(Shape51, 0F, 0F, 0F);
Shape52 = new ModelRenderer(this, 50, 44);
Shape52.addBox(-1.7F, -4.4F, -4.2F, 1, 1, 1);
Shape52.setRotationPoint(0F, -2.433333F, 2.733333F);
Shape52.setTextureSize(128, 64);
Shape52.mirror = true;
setRotation(Shape52, 0F, 0F, 0F);
Shape53 = new ModelRenderer(this, 50, 44);
Shape53.addBox(1.166667F, 0.7F, -1.1F, 1, 1, 1);
Shape53.setRotationPoint(-9.866667F, -1.966667F, 1.166667F);
Shape53.setTextureSize(128, 64);
Shape53.mirror = true;
setRotation(Shape53, 0F, 0F, 0F);
Shape54 = new ModelRenderer(this, 91, 20);
Shape54.addBox(-0.5F, 0.5F, -6F, 1, 1, 3);
Shape54.setRotationPoint(-2.733333F, 22.36667F, -9.992007E-15F);
Shape54.setTextureSize(128, 64);
Shape54.mirror = true;
setRotation(Shape54, 0F, 0F, 0F);
Shape55 = new ModelRenderer(this, 91, 20);
Shape55.addBox(-0.5F, 0.5F, -6F, 1, 1, 3);
Shape55.setRotationPoint(-2.7F, 22.36667F, -9.992007E-15F);
Shape55.setTextureSize(128, 64);
Shape55.mirror = true;
setRotation(Shape55, 0F, -0.3316126F, 0F);
Shape56 = new ModelRenderer(this, 91, 20);
Shape56.addBox(-0.5F, 0.5F, -6F, 1, 1, 3);
Shape56.setRotationPoint(-2.7F, 22.36667F, -9.992007E-15F);
Shape56.setTextureSize(128, 64);
Shape56.mirror = true;
setRotation(Shape56, 0F, 0.3316126F, 0F);
Shape57 = new ModelRenderer(this, 99, 20);
Shape57.addBox(-0.5F, 0.5F, -4F, 1, 1, 2);
Shape57.setRotationPoint(-2.7F, 22.36667F, -9.992007E-15F);
Shape57.setTextureSize(128, 64);
Shape57.mirror = true;
setRotation(Shape57, 0F, 0.837758F, 0F);
Shape58 = new ModelRenderer(this, 91, 20);
Shape58.addBox(-0.5F, 0.5F, -6F, 1, 1, 3);
Shape58.setRotationPoint(11.86667F, 22.36667F, 2.2F);
Shape58.setTextureSize(128, 64);
Shape58.mirror = true;
setRotation(Shape58, 0F, 0F, 0F);
Shape59 = new ModelRenderer(this, 91, 20);
Shape59.addBox(-0.5F, 0.5F, -6F, 1, 1, 3);
Shape59.setRotationPoint(11.86667F, 22.36667F, 2.2F);
Shape59.setTextureSize(128, 64);
Shape59.mirror = true;
setRotation(Shape59, 0F, -0.3316126F, 0F);
Shape60 = new ModelRenderer(this, 91, 20);
Shape60.addBox(-0.5F, 0.5F, -6F, 1, 1, 3);
Shape60.setRotationPoint(11.86667F, 22.36667F, 2.2F);
Shape60.setTextureSize(128, 64);
Shape60.mirror = true;
setRotation(Shape60, 0F, 0.3316126F, 0F);
Shape61 = new ModelRenderer(this, 99, 20);
Shape61.addBox(-0.5F, 0.5F, -4F, 1, 1, 2);
Shape61.setRotationPoint(11.86667F, 22.36667F, 2.2F);
Shape61.setTextureSize(128, 64);
Shape61.mirror = true;
setRotation(Shape61, 0F, -0.837758F, 0F);
Shape62 = new ModelRenderer(this, 16, 53);
Shape62.addBox(-1.3F, 0F, -1.5F, 0, 1, 1);
Shape62.setRotationPoint(0F, -4.5F, -5.133333F);
Shape62.setTextureSize(128, 64);
Shape62.mirror = true;
setRotation(Shape62, 0.7853982F, 0F, 0F);
Shape63 = new ModelRenderer(this, 16, 53);
Shape63.addBox(1.3F, 0F, -1.5F, 0, 1, 1);
Shape63.setRotationPoint(0F, -4.5F, -5.133333F);
Shape63.setTextureSize(128, 64);
Shape63.mirror = true;
setRotation(Shape63, 0.7853982F, 0F, 0F);
Shape64 = new ModelRenderer(this, 16, 53);
Shape64.addBox(-1.3F, 0F, -1.5F, 0, 1, 1);
Shape64.setRotationPoint(0F, -4.5F, -4.133333F);
Shape64.setTextureSize(128, 64);
Shape64.mirror = true;
setRotation(Shape64, 0.7853982F, 0F, 0F);
Shape65 = new ModelRenderer(this, 16, 53);
Shape65.addBox(1.3F, 0F, -1.5F, 0, 1, 1);
Shape65.setRotationPoint(0F, -4.5F, -4.133333F);
Shape65.setTextureSize(128, 64);
Shape65.mirror = true;
setRotation(Shape65, 0.7853982F, 0F, 0F);
Shape66 = new ModelRenderer(this, 16, 53);
Shape66.addBox(-1.3F, 0F, -1.5F, 0, 1, 1);
Shape66.setRotationPoint(0F, -4.5F, -3.133333F);
Shape66.setTextureSize(128, 64);
Shape66.mirror = true;
setRotation(Shape66, 0.7853982F, 0F, 0F);
Shape67 = new ModelRenderer(this, 16, 53);
Shape67.addBox(1.3F, 0F, -1.5F, 0, 1, 1);
Shape67.setRotationPoint(0F, -4.5F, -3.133333F);
Shape67.setTextureSize(128, 64);
Shape67.mirror = true;
setRotation(Shape67, 0.7853982F, 0F, 0F);
Shape68 = new ModelRenderer(this, 16, 53);
Shape68.addBox(0F, 0.5F, -1.5F, 1, 1, 0);
Shape68.setRotationPoint(0.3333333F, -4.5F, -4.6F);
Shape68.setTextureSize(128, 64);
Shape68.mirror = true;
setRotation(Shape68, 0F, 0F, 0.7853982F);
Shape69 = new ModelRenderer(this, 16, 53);
Shape69.addBox(0F, 0.5F, -1.5F, 1, 1, 0);
Shape69.setRotationPoint(-0.2666667F, -4.5F, -4.6F);
Shape69.setTextureSize(128, 64);
Shape69.mirror = true;
setRotation(Shape69, 0F, 0F, 0.7853982F);
Shape70 = new ModelRenderer(this, 16, 53);
Shape70.addBox(0F, 0.5F, -1.5F, 1, 1, 0);
Shape70.setRotationPoint(1F, -4.5F, -4.6F);
Shape70.setTextureSize(128, 64);
Shape70.mirror = true;
setRotation(Shape70, 0F, 0F, 0.7853982F);
Shape71 = new ModelRenderer(this, 18, 38);
Shape71.addBox(-1F, -1F, -0.5333334F, 2, 2, 1);
Shape71.setRotationPoint(-2.933333F, -4.3F, -1.066667F);
Shape71.setTextureSize(128, 64);
Shape71.mirror = true;
setRotation(Shape71, 0F, 0.1396263F, 0.1396263F);
Shape72 = new ModelRenderer(this, 18, 38);
Shape72.addBox(-1F, -1F, -0.5333334F, 2, 2, 1);
Shape72.setRotationPoint(2.9F, -4.3F, -1.1F);
Shape72.setTextureSize(128, 64);
Shape72.mirror = true;
setRotation(Shape72, 0F, -0.1396263F, -0.1396263F);
}

public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
{
super.render(entity, f, f1, f2, f3, f4, f5);
setRotationAngles(f, f1, f2, f3, f4, f5, entity);

Shape2.render(f5);
Shape3.render(f5);
Shape4.render(f5);
Shape5.render(f5);
Shape6.render(f5);
Shape7.render(f5);
Shape8.render(f5);
Shape9.render(f5);
Shape10.render(f5);
Shape11.render(f5);
Shape12.render(f5);
Shape13.render(f5);
Shape14.render(f5);
Shape15.render(f5);
Shape16.render(f5);
Shape17.render(f5);
Shape18.render(f5);
Shape19.render(f5);
Shape20.render(f5);
Shape21.render(f5);
Shape22.render(f5);
Shape23.render(f5);
Shape24.render(f5);
Shape25.render(f5);
Shape26.render(f5);
Shape27.render(f5);
Shape28.render(f5);
Shape29.render(f5);
Shape30.render(f5);
Shape31.render(f5);
Shape32.render(f5);
Shape33.render(f5);
Shape34.render(f5);
Shape35.render(f5);
Shape36.render(f5);
Shape37.render(f5);
Shape38.render(f5);
Shape39.render(f5);
Shape39.render(f5);
Shape40.render(f5);
Shape41.render(f5);
Shape42.render(f5);
Shape43.render(f5);
Shape44.render(f5);
Shape45.render(f5);
Shape46.render(f5);
Shape47.render(f5);
Shape48.render(f5);
Shape49.render(f5);
Shape50.render(f5);
Shape51.render(f5);
Shape52.render(f5);
Shape53.render(f5);
Shape54.render(f5);
Shape55.render(f5);
Shape56.render(f5);
Shape57.render(f5);
Shape58.render(f5);
Shape59.render(f5);
Shape60.render(f5);
Shape61.render(f5);
Shape62.render(f5);
Shape63.render(f5);
Shape64.render(f5);
Shape65.render(f5);
Shape66.render(f5);
Shape67.render(f5);
Shape68.render(f5);
Shape69.render(f5);
Shape70.render(f5);
Shape71.render(f5);
Shape72.render(f5);
}

private void setRotation(ModelRenderer model, float x, float y, float z)
{
model.rotateAngleX = x;
model.rotateAngleY = y;
model.rotateAngleZ = z;
}

public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e)

{
super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
}

}

}
