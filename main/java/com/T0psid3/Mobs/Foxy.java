package com.T0psid3.Mobs;

import java.util.Random;

import com.T0psid3.ModelFoxy;

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

public class Foxy {
	public static int mobid = 0;
	public static Object instance;
	//This anamtronic has no AI
    public void load(){}
    
    public void generateNether(World world, Random random, int chunkX, int chunkZ){}
	public void generateSurface(World world, Random random, int chunkX, int chunkZ){}
	public int addFuel(ItemStack fuel){
		return 0;
	}
	@SideOnly(Side.CLIENT)
	public void registerRenderers(){
		RenderingRegistry.registerEntityRenderingHandler(EntityFoxy.class, new RenderLiving(new ModelFoxy(), 0){protected ResourceLocation getEntityTexture(Entity par1Entity){return new ResourceLocation("bon bon texture.png");}});
	}
	public void serverLoad(FMLServerStartingEvent event){}
	@SuppressWarnings("unchecked")
	public void preInit(FMLPreInitializationEvent event){
		int entityID = EntityRegistry.findGlobalUniqueEntityId();
		mobid = entityID;
		EntityRegistry.registerGlobalEntityID(EntityFoxy.class, "Foxy", entityID);
		EntityRegistry.registerModEntity(Foxy.EntityFoxy.class, "Foxy", entityID, instance, 2, 1, true);
		EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, (255 << 16) + (255 << 8) + 255, (255 << 16) + (255 << 8) + 255));
		EntityRegistry.addSpawn(EntityFoxy.class, 20, 3, 30, EnumCreatureType.monster ,BiomeGenBase.extremeHills);

        
	}

 


   public static class EntityFoxy extends EntityMob 
	{
		World world = null;
	    public EntityFoxy(World var1)
	    {
	        super(var1);
	        world = var1;
	        experienceValue = 1000;
	        this.isImmuneToFire = true;
	        addRandomArmor();
        	
	    }

	    

protected void applyEntityAttributes(){
super.applyEntityAttributes();
this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(10.00D);
this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(1000D);
if(this.getEntityAttribute(SharedMonsterAttributes.attackDamage)!=null)this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(50D);
}


	    public boolean hasCustomNameTag(){
return true;
}


	    
protected void addRandomArmor(){

}



    	public boolean isAIEnabled()
		{
			   return false;
    	}

	   
	    protected void dropFewItems(boolean var1, int var2)
	    {
	        this.entityDropItem(new ItemStack(Items.experience_bottle), 0.0F);
	    }

	  
	    protected String getLivingSound()
	    {
	        return "";
	    }

	 
	    protected String getHurtSound()
	    {
	        return "";
	    }

	   
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
			return "bonnie";
		}

	}
   public class Modelbonnie extends ModelBase
   {
     //fields
       ModelRenderer Shape1;
       ModelRenderer Shape2;
       ModelRenderer Shape3;
       ModelRenderer Shape4;
       ModelRenderer Shape5;
       ModelRenderer Shape6;
       ModelRenderer Shape7;
       ModelRenderer Shape8;
       ModelRenderer Shape9;
       ModelRenderer Shape10;
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
     
     public Modelbonnie()
     {
       textureWidth = 128;
       textureHeight = 64;
       
         Shape1 = new ModelRenderer(this, 0, 0);
         Shape1.addBox(-1.5F, 0F, -6F, 3, 1, 6);
         Shape1.setRotationPoint(-2F, 23F, 4F);
         Shape1.setTextureSize(128, 64);
         Shape1.mirror = true;
         setRotation(Shape1, 0F, 0F, 0F);
         Shape2 = new ModelRenderer(this, 0, 0);
         Shape2.addBox(-1.5F, 0F, -6F, 3, 1, 6);
         Shape2.setRotationPoint(2F, 23F, 4F);
         Shape2.setTextureSize(128, 64);
         Shape2.mirror = true;
         setRotation(Shape2, 0F, 0F, 0F);
         Shape3 = new ModelRenderer(this, 0, 18);
         Shape3.addBox(-0.5F, 0F, -0.7F, 1, 6, 1);
         Shape3.setRotationPoint(-2F, 17F, 2F);
         Shape3.setTextureSize(128, 64);
         Shape3.mirror = true;
         setRotation(Shape3, 0.122173F, 0F, 0F);
         Shape4 = new ModelRenderer(this, 0, 18);
         Shape4.addBox(-0.5F, 0F, -0.7F, 1, 6, 1);
         Shape4.setRotationPoint(2F, 17F, 2F);
         Shape4.setTextureSize(128, 64);
         Shape4.mirror = true;
         setRotation(Shape4, 0.122173F, 0F, 0F);
         Shape5 = new ModelRenderer(this, 0, 44);
         Shape5.addBox(-1F, 0F, -2.5F, 2, 3, 2);
         Shape5.setRotationPoint(-2F, 15F, 2.5F);
         Shape5.setTextureSize(128, 64);
         Shape5.mirror = true;
         setRotation(Shape5, 0F, 0F, 0F);
         Shape6 = new ModelRenderer(this, 0, 44);
         Shape6.addBox(-1F, 0F, -2.5F, 2, 3, 2);
         Shape6.setRotationPoint(2F, 15F, 2.5F);
         Shape6.setTextureSize(128, 64);
         Shape6.mirror = true;
         setRotation(Shape6, 0F, 0F, 0F);
         Shape7 = new ModelRenderer(this, 0, 53);
         Shape7.addBox(-3.5F, 0F, -2.5F, 7, 2, 5);
         Shape7.setRotationPoint(0F, 9.466666F, 1.7F);
         Shape7.setTextureSize(128, 64);
         Shape7.mirror = true;
         setRotation(Shape7, 0F, 0F, 0F);
         Shape8 = new ModelRenderer(this, 3, 34);
         Shape8.addBox(-1.5F, 0F, -2F, 3, 5, 3);
         Shape8.setRotationPoint(-2F, 11.46667F, 2.5F);
         Shape8.setTextureSize(128, 64);
         Shape8.mirror = true;
         setRotation(Shape8, 0F, 0F, 0F);
         Shape9 = new ModelRenderer(this, 0, 34);
         Shape9.addBox(-1.5F, 0F, -2F, 3, 5, 3);
         Shape9.setRotationPoint(2F, 11.46667F, 2.5F);
         Shape9.setTextureSize(128, 64);
         Shape9.mirror = true;
         setRotation(Shape9, 0F, 0F, 0F);
         Shape10 = new ModelRenderer(this, 28, 55);
         Shape10.addBox(-2.5F, 0F, -1.6F, 5, 1, 4);
         Shape10.setRotationPoint(0F, 8.466666F, 1.5F);
         Shape10.setTextureSize(128, 64);
         Shape10.mirror = true;
         setRotation(Shape10, 0F, 0F, 0F);
         Shape14 = new ModelRenderer(this, 19, 26);
         Shape14.addBox(-3.5F, 0F, -2.466667F, 7, 9, 5);
         Shape14.setRotationPoint(0F, -0.4333333F, 1.733333F);
         Shape14.setTextureSize(128, 64);
         Shape14.mirror = true;
         setRotation(Shape14, 0F, 0F, 0F);
         Shape15 = new ModelRenderer(this, 18, 19);
         Shape15.addBox(-1F, -2.5F, -1F, 2, 3, 2);
         Shape15.setRotationPoint(0F, -0.4333333F, 2.2F);
         Shape15.setTextureSize(128, 64);
         Shape15.mirror = true;
         setRotation(Shape15, 0F, 0F, 0F);
         Shape16 = new ModelRenderer(this, 66, 56);
         Shape16.addBox(-2.5F, 0.1F, -6F, 5, 1, 6);
         Shape16.setRotationPoint(0F, -3.433333F, 2.733333F);
         Shape16.setTextureSize(128, 64);
         Shape16.mirror = true;
         setRotation(Shape16, 0.0872665F, 0F, 0F);
         Shape17 = new ModelRenderer(this, 0, 13);
         Shape17.addBox(-2F, 0.1F, -8F, 4, 1, 2);
         Shape17.setRotationPoint(0F, -3.433333F, 2.733333F);
         Shape17.setTextureSize(128, 64);
         Shape17.mirror = true;
         setRotation(Shape17, 0.0872665F, 0F, 0F);
         Shape18 = new ModelRenderer(this, 50, 44);
         Shape18.addBox(-3F, -6F, -4F, 6, 4, 5);
         Shape18.setRotationPoint(0F, -2.433333F, 2.733333F);
         Shape18.setTextureSize(128, 64);
         Shape18.mirror = true;
         setRotation(Shape18, 0F, 0F, 0F);
         Shape19 = new ModelRenderer(this, 51, 56);
         Shape19.addBox(-2F, -2F, -2F, 4, 2, 3);
         Shape19.setRotationPoint(0F, -2.433333F, 2.7F);
         Shape19.setTextureSize(128, 64);
         Shape19.mirror = true;
         setRotation(Shape19, 0F, 0F, 0F);
         Shape20 = new ModelRenderer(this, 50, 38);
         Shape20.addBox(-2.5F, -7F, -3.5F, 5, 1, 4);
         Shape20.setRotationPoint(0F, -2.433333F, 2.733333F);
         Shape20.setTextureSize(128, 64);
         Shape20.mirror = true;
         setRotation(Shape20, 0F, 0F, 0F);
         Shape21 = new ModelRenderer(this, 18, 14);
         Shape21.addBox(-2F, -3F, -6F, 4, 2, 2);
         Shape21.setRotationPoint(0F, -2.433333F, 2.733333F);
         Shape21.setTextureSize(128, 64);
         Shape21.mirror = true;
         setRotation(Shape21, 0F, 0F, 0F);
         Shape22 = new ModelRenderer(this, 36, 20);
         Shape22.addBox(-1.5F, -3F, -9F, 3, 2, 3);
         Shape22.setRotationPoint(0F, -2.433333F, 2.733333F);
         Shape22.setTextureSize(128, 64);
         Shape22.mirror = true;
         setRotation(Shape22, 0F, 0F, 0F);
         Shape23 = new ModelRenderer(this, 36, 17);
         Shape23.addBox(-1F, -1.5F, -0.5F, 2, 1, 1);
         Shape23.setRotationPoint(0F, -4.433333F, -6.266667F);
         Shape23.setTextureSize(128, 64);
         Shape23.mirror = true;
         setRotation(Shape23, -0.3665191F, 0F, 0F);
         Shape24 = new ModelRenderer(this, 34, 11);
         Shape24.addBox(-1.5F, -5F, -1F, 3, 3, 1);
         Shape24.setRotationPoint(-2F, -7.433333F, 2.733333F);
         Shape24.setTextureSize(128, 64);
         Shape24.mirror = true;
         setRotation(Shape24, 0F, 0F, -0.8726646F);
         Shape25 = new ModelRenderer(this, 34, 11);
         Shape25.addBox(-1.5F, -5F, -1F, 3, 3, 1);
         Shape25.setRotationPoint(2F, -7.433333F, 2.733333F);
         Shape25.setTextureSize(128, 64);
         Shape25.mirror = true;
         setRotation(Shape25, 0F, 0F, 0.8726646F);
         Shape28 = new ModelRenderer(this, 25, 2);
         Shape28.addBox(-2F, 0F, -1.5F, 3, 2, 3);
         Shape28.setRotationPoint(-3.5F, -1F, 2F);
         Shape28.setTextureSize(128, 64);
         Shape28.mirror = true;
         setRotation(Shape28, 0F, 0F, 0.3316126F);
         Shape29 = new ModelRenderer(this, 25, 2);
         Shape29.addBox(-1F, 0F, -1.5F, 3, 2, 3);
         Shape29.setRotationPoint(3.5F, -1F, 2F);
         Shape29.setTextureSize(128, 64);
         Shape29.mirror = true;
         setRotation(Shape29, 0F, 0F, -0.3316126F);
         Shape30 = new ModelRenderer(this, 47, 5);
         Shape30.addBox(-2F, 0.5333334F, -1F, 2, 5, 2);
         Shape30.setRotationPoint(-3.5F, 0F, 2F);
         Shape30.setTextureSize(128, 64);
         Shape30.mirror = true;
         setRotation(Shape30, 0F, 0F, 0.2792527F);
         Shape31 = new ModelRenderer(this, 47, 5);
         Shape31.addBox(0F, 0.5333334F, -1F, 2, 5, 2);
         Shape31.setRotationPoint(3.5F, 0F, 2F);
         Shape31.setTextureSize(128, 64);
         Shape31.mirror = true;
         setRotation(Shape31, 0F, 0F, -0.2792527F);
         Shape32 = new ModelRenderer(this, 33, 31);
         Shape32.addBox(-1.5F, 0.5333334F, -1F, 2, 4, 2);
         Shape32.setRotationPoint(-5.5F, 4.5F, 2F);
         Shape32.setTextureSize(128, 64);
         Shape32.mirror = true;
         setRotation(Shape32, -0.1047198F, 0F, 0F);
         Shape33 = new ModelRenderer(this, 33, 31);
         Shape33.addBox(-0.5F, 0.5333334F, -1F, 2, 5, 2);
         Shape33.setRotationPoint(5.5F, 4.5F, 2F);
         Shape33.setTextureSize(128, 64);
         Shape33.mirror = true;
         setRotation(Shape33, -0.1047198F, 0F, 0F);
         Shape34 = new ModelRenderer(this, 51, 24);
         Shape34.addBox(-2F, 4.533333F, -1.5F, 3, 2, 3);
         Shape34.setRotationPoint(-5.5F, 4.5F, 2F);
         Shape34.setTextureSize(128, 64);
         Shape34.mirror = true;
         setRotation(Shape34, -0.1047198F, 0F, 0F);
         Shape35 = new ModelRenderer(this, 51, 31);
         Shape35.addBox(0F, 5.533333F, -1.633333F, 1, 1, 3);
         Shape35.setRotationPoint(5.5F, 4.5F, 2F);
         Shape35.setTextureSize(128, 64);
         Shape35.mirror = true;
         setRotation(Shape35, -0.1047198F, 0F, 0F);
         Shape36 = new ModelRenderer(this, 64, 32);
         Shape36.addBox(-1F, -3F, 0F, 1, 2, 0);
         Shape36.setRotationPoint(0F, -8.433333F, 2.733333F);
         Shape36.setTextureSize(128, 64);
         Shape36.mirror = true;
         setRotation(Shape36, 0F, 0F, -0.4014257F);
         Shape37 = new ModelRenderer(this, 64, 32);
         Shape37.addBox(0F, -3F, 0F, 1, 2, 0);
         Shape37.setRotationPoint(0F, -8.433333F, 2.733333F);
         Shape37.setTextureSize(128, 64);
         Shape37.mirror = true;
         setRotation(Shape37, 0F, 0F, 0.4014257F);
         Shape38 = new ModelRenderer(this, 64, 32);
         Shape38.addBox(-0.5F, -3F, 0F, 1, 2, 0);
         Shape38.setRotationPoint(0F, -8.433333F, 2.733333F);
         Shape38.setTextureSize(128, 64);
         Shape38.mirror = true;
         setRotation(Shape38, 0F, 0F, 0F);
         Shape39 = new ModelRenderer(this, 20, 9);
         Shape39.addBox(-1F, -6F, -1F, 2, 1, 1);
         Shape39.setRotationPoint(-2F, -7.433333F, 2.733333F);
         Shape39.setTextureSize(128, 64);
         Shape39.mirror = true;
         setRotation(Shape39, 0F, 0F, -0.8726646F);
         Shape40 = new ModelRenderer(this, 0, 9);
         Shape40.addBox(-1.5F, 0.1F, -9F, 3, 1, 1);
         Shape40.setRotationPoint(0F, -3.433333F, 2.733333F);
         Shape40.setTextureSize(128, 64);
         Shape40.mirror = true;
         setRotation(Shape40, 0.0872665F, 0F, 0F);
         Shape41 = new ModelRenderer(this, 20, 9);
         Shape41.addBox(-1F, -2F, -1F, 2, 1, 1);
         Shape41.setRotationPoint(-2F, -7.433333F, 2.733333F);
         Shape41.setTextureSize(128, 64);
         Shape41.mirror = true;
         setRotation(Shape41, 0F, 0F, -0.8726646F);
         Shape42 = new ModelRenderer(this, 20, 9);
         Shape42.addBox(-1F, -6F, -1F, 2, 1, 1);
         Shape42.setRotationPoint(2F, -7.433333F, 2.733333F);
         Shape42.setTextureSize(128, 64);
         Shape42.mirror = true;
         setRotation(Shape42, 0F, 0F, 0.8726646F);
         Shape43 = new ModelRenderer(this, 20, 9);
         Shape43.addBox(-1F, -2F, -1F, 2, 1, 1);
         Shape43.setRotationPoint(2F, -7.433333F, 2.733333F);
         Shape43.setTextureSize(128, 64);
         Shape43.mirror = true;
         setRotation(Shape43, 0F, 0F, 0.8726646F);
         Shape44 = new ModelRenderer(this, 12, 8);
         Shape44.addBox(-0.5F, -7F, -1F, 1, 1, 1);
         Shape44.setRotationPoint(-2F, -7.433333F, 2.733333F);
         Shape44.setTextureSize(128, 64);
         Shape44.mirror = true;
         setRotation(Shape44, 0F, 0F, -0.8726646F);
         Shape45 = new ModelRenderer(this, 12, 8);
         Shape45.addBox(-0.5F, -7F, -1F, 1, 1, 1);
         Shape45.setRotationPoint(2F, -7.433333F, 2.733333F);
         Shape45.setTextureSize(128, 64);
         Shape45.mirror = true;
         setRotation(Shape45, 0F, 0F, 0.8726646F);
         Shape46 = new ModelRenderer(this, 81, 44);
         Shape46.addBox(-5F, -2F, -4F, 10, 1, 3);
         Shape46.setRotationPoint(0F, -2.433333F, 2.733333F);
         Shape46.setTextureSize(128, 64);
         Shape46.mirror = true;
         setRotation(Shape46, 0F, 0F, 0F);
         Shape47 = new ModelRenderer(this, 30, 44);
         Shape47.addBox(-2F, -1F, -1.5F, 2, 1, 2);
         Shape47.setRotationPoint(-2.666667F, -4.433333F, 0.7333333F);
         Shape47.setTextureSize(128, 64);
         Shape47.mirror = true;
         setRotation(Shape47, 0F, 0F, 0.122173F);
         Shape48 = new ModelRenderer(this, 30, 44);
         Shape48.addBox(0F, -1F, -1.5F, 2, 1, 2);
         Shape48.setRotationPoint(2.7F, -4.433333F, 0.7333333F);
         Shape48.setTextureSize(128, 64);
         Shape48.mirror = true;
         setRotation(Shape48, 0F, 0F, -0.122173F);
         Shape49 = new ModelRenderer(this, 67, 24);
         Shape49.addBox(-1.5F, 6.533333F, -1F, 2, 1, 2);
         Shape49.setRotationPoint(-5.5F, 4.5F, 2F);
         Shape49.setTextureSize(128, 64);
         Shape49.mirror = true;
         setRotation(Shape49, -0.1047198F, 0F, 0F);
         Shape50 = new ModelRenderer(this, 51, 10);
         Shape50.addBox(-0.5F, 7.533333F, -2.5F, 0, 5, 5);
         Shape50.setRotationPoint(-5.5F, 4.5F, 2F);
         Shape50.setTextureSize(128, 64);
         Shape50.mirror = true;
         setRotation(Shape50, -0.1047198F, 0F, 0F);
         Shape51 = new ModelRenderer(this, 41, 44);
         Shape51.addBox(-1.466667F, -2F, 0F, 2, 2, 0);
         Shape51.setRotationPoint(-1F, -7.533333F, -1.266667F);
         Shape51.setTextureSize(128, 64);
         Shape51.mirror = true;
         setRotation(Shape51, 1.381289F, 0F, 0F);
         Shape52 = new ModelRenderer(this, 49, 46);
         Shape52.addBox(-2.466667F, -1F, -0.1333333F, 2, 2, 1);
         Shape52.setRotationPoint(0F, -6.5F, -1.266667F);
         Shape52.setTextureSize(128, 64);
         Shape52.mirror = true;
         setRotation(Shape52, 0F, 0F, 0F);
         Shape53 = new ModelRenderer(this, 49, 46);
         Shape53.addBox(0.5F, -1F, -0.1333333F, 2, 2, 1);
         Shape53.setRotationPoint(0F, -6.5F, -1.266667F);
         Shape53.setTextureSize(128, 64);
         Shape53.mirror = true;
         setRotation(Shape53, 0F, 0F, 0F);
         Shape54 = new ModelRenderer(this, 67, 47);
         Shape54.addBox(-1.7F, -0.1F, -0.2F, 1, 1, 1);
         Shape54.setRotationPoint(0F, -6.4F, -1.266667F);
         Shape54.setTextureSize(128, 64);
         Shape54.mirror = true;
         setRotation(Shape54, 0F, 0F, 0F);
         Shape55 = new ModelRenderer(this, 67, 47);
         Shape55.addBox(0.7F, -0.1F, -0.2F, 1, 1, 1);
         Shape55.setRotationPoint(0F, -6.4F, -1.266667F);
         Shape55.setTextureSize(128, 64);
         Shape55.mirror = true;
         setRotation(Shape55, 0F, 0F, 0F);
         Shape56 = new ModelRenderer(this, 54, 31);
         Shape56.addBox(0F, 6.533333F, -1.633333F, 1, 3, 1);
         Shape56.setRotationPoint(5.5F, 4.5F, 2F);
         Shape56.setTextureSize(128, 64);
         Shape56.mirror = true;
         setRotation(Shape56, -0.122173F, 0F, 0F);
         Shape57 = new ModelRenderer(this, 54, 31);
         Shape57.addBox(0F, 6.533333F, 0.3666667F, 1, 3, 1);
         Shape57.setRotationPoint(5.5F, 4.5F, 2F);
         Shape57.setTextureSize(128, 64);
         Shape57.mirror = true;
         setRotation(Shape57, -0.0872665F, 0F, 0F);
         Shape58 = new ModelRenderer(this, 54, 31);
         Shape58.addBox(0.3F, 6.533333F, -0.6333333F, 1, 3, 1);
         Shape58.setRotationPoint(5.5F, 4.5F, 2F);
         Shape58.setTextureSize(128, 64);
         Shape58.mirror = true;
         setRotation(Shape58, -0.1047198F, 0F, 0F);
         Shape59 = new ModelRenderer(this, 54, 31);
         Shape59.addBox(0F, 0.5333334F, -2.633333F, 1, 2, 1);
         Shape59.setRotationPoint(5.5F, 10.5F, 2F);
         Shape59.setTextureSize(128, 64);
         Shape59.mirror = true;
         setRotation(Shape59, -0.2094395F, 0F, 0.4537856F);
     }
     
     public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
     {
       super.render(entity, f, f1, f2, f3, f4, f5);
       setRotationAngles(f, f1, f2, f3, f4, f5);
       Shape1.render(f5);
       Shape2.render(f5);
       Shape3.render(f5);
       Shape4.render(f5);
       Shape5.render(f5);
       Shape6.render(f5);
       Shape7.render(f5);
       Shape8.render(f5);
       Shape9.render(f5);
       Shape10.render(f5);
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
     }
     
     private void setRotation(ModelRenderer model, float x, float y, float z)
     {
       model.rotateAngleX = x;
       model.rotateAngleY = y;
       model.rotateAngleZ = z;
     }
     
     public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
     {
       super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
     }

   }

}
