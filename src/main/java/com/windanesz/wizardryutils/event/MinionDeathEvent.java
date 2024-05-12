package com.windanesz.wizardryutils.event;

import electroblob.wizardry.event.ResurrectionEvent;
import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.eventhandler.Cancelable;

/**
 * This event is fired when a summoned minion's lifetime expires as LivingDeathEvent isn't called for setDead().
 * The event contains the minion that is about to die and the caster who summoned the minion.
 *
 * @author WinDanesz
 */
@Cancelable
public class MinionDeathEvent extends LivingEvent {

	private final EntityLivingBase caster;

	public MinionDeathEvent(EntityLivingBase minion, EntityLivingBase caster){
		super(minion);
		this.caster = caster;
	}

	/**
	 * Returns the entity that cast the summoning spell. If the minion summoned itself, this will be the
	 * same as {@link ResurrectionEvent#getEntityPlayer()}.
	 *
	 * @return the entity that cast the summoning spell
	 */
	public EntityLivingBase getCaster(){
		return caster;
	}

}
