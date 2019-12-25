package eu.endercentral.crazy_advancements.events.offline;

import java.util.UUID;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import eu.endercentral.crazy_advancements.Advancement;
import eu.endercentral.crazy_advancements.manager.AdvancementManager;

public class OfflineAdvancementGrantEvent extends Event {
	
	public static final HandlerList handlers = new HandlerList();
	
	@Override
	public HandlerList getHandlers() {
		return handlers;
	}
	
	public static HandlerList getHandlerList() {
		return handlers;
	}
	
	
	private final AdvancementManager manager;
	private final Advancement advancement;
	private final UUID uuid;
	
	public OfflineAdvancementGrantEvent(AdvancementManager manager, Advancement advancement, UUID uuid) {
		this.manager = manager;
		this.advancement = advancement;
		this.uuid = uuid;
	}
	
	/**
	 * 
	 * @return The Manager this event has been fired from
	 */
	public AdvancementManager getManager() {
		return manager;
	}
	
	/**
	 * 
	 * @return The Advancement that has been granted
	 */
	public Advancement getAdvancement() {
		return advancement;
	}
	
	/**
	 * 
	 * @return Reciever UUID
	 */
	public UUID getUUID() {
		return uuid;
	}
	
	
	
}