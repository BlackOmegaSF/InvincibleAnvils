package com.kleinercode.plugins.invincibleanvils;

import com.destroystokyo.paper.event.block.AnvilDamagedEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public class InvincibleAnvils extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {

    }

    @EventHandler
    public void anvilBreaking(AnvilDamagedEvent event) {

        if (event.getDamageState() == AnvilDamagedEvent.DamageState.CHIPPED || event.getDamageState() == AnvilDamagedEvent.DamageState.DAMAGED) {
            event.setDamageState(AnvilDamagedEvent.DamageState.FULL);
            getServer().getLogger().log(Level.INFO, "Oh, no you don't! An anvil just tried to break.");
        }

        if (event.isBreaking()) {
            event.setBreaking(false);
            getServer().getLogger().log(Level.INFO, "Oh, no you don't! An anvil just tried to break.");
        }

    }

}
