package com.fnaf.Client.registry;

import com.fnaf.Common.Entity.WitheredBonnie.EntityWitheredBonnieMob;
import com.fnaf.Common.Entity.balloonboy.EntityBalloonBoy;
import com.fnaf.Common.Entity.balloonboy.EntityBalloonBoyMob;
import com.fnaf.Common.Entity.bonnie.EntityBonnieMob;
import com.fnaf.Common.Entity.chica.EntityChicaMob;
import com.fnaf.Common.Entity.foxy.EntityFoxyMob;
import com.fnaf.Common.Entity.freddy.EntityFreddyMob;
import com.fnaf.Common.Entity.goldenfreddy.EntityGoldenFreddyMob;
import com.fnaf.Common.Entity.mangle.EntityMangleMob;
import com.fnaf.Common.Entity.puppet.EntityPuppetMob;
import com.fnaf.Common.Entity.springtrap.EntitySpringtrap;
import com.fnaf.Common.Entity.toybonnie.EntityToyBonnieMob;
import com.fnaf.Common.Entity.toychica.EntityToyChicaMob;
import com.fnaf.Common.Entity.toyfreddy.EntityToyFreddyMob;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class EntityRegister {

	
	

	public static void registerEntity(){
			
		createEntity(EntityBalloonBoyMob.class, "BalloonBoy", 0xF20521, 0x2011CF);
		createEntity(EntityBonnieMob.class, "Bonnie", 0x525051, 0xEBEBEB);
		createEntity(EntityChicaMob.class, "Chica", 0xDEF22C, 0x707070);
		createEntity(EntityFoxyMob.class, "Foxy", 0xE64B17, 0xF56B3D);
		createEntity(EntityFreddyMob.class, "Freddy", 0x7D6706, 0x9C8627);
		createEntity(EntityGoldenFreddyMob.class, "GoldenFreddy", 0xBDC700, 0xE2ED0C);
		createEntity(EntityMangleMob.class, "Mangle", 0xEFF0DF, 0xF20568);
		createEntity(EntityPuppetMob.class, "Puppet", 0x525051, 0xFAFAFA);
		createEntity(EntitySpringtrap.class, "SpringTrap", 0xEFF0DF, 0x6B522C);
		createEntity(EntityToyBonnieMob.class, "ToyBonnie", 0x5CBEFA, 0xF53649);
		createEntity(EntityToyChicaMob.class, "ToyChica", 0xF7F702, 0xF702BE);
		createEntity(EntityToyFreddyMob.class, "ToyFreddy", 0xA88808, 0xAB922E);
		createEntity(EntityWitheredBonnieMob.class, "Withered Bonnie", 0x525023, 0xEBEBEB);
		

	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor){
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, com.fnaf.Client.main.main_fnaf.modInstance, 64, 1, true);
		EntityRegistry.addSpawn(entityClass, 2, 0, 1, EnumCreatureType.creature, BiomeGenBase.forest);
		
		createEgg(randomId, solidColor, spotColor);
		
	}
	
	private static void createEgg(int randomId, int solidColor, int spotColor){
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
		
	}


















	public static Entity entity() {
		return entity();
	}

	
	public static void mainRegistry(){
		registerEntity();
	}

}
