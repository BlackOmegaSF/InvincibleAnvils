package com.floogoobooq.blackomega.invincibleanvils;

import com.destroystokyo.paper.event.block.AnvilDamagedEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class InvincibleAnvils extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {

    }

    @EventHandler
    public void anvilBreaking(AnvilDamagedEvent event) {

        if (event.getDamageState() == AnvilDamagedEvent.DamageState.CHIPPED || event.getDamageState() == AnvilDamagedEvent.DamageState.DAMAGED) {
            event.setDamageState(AnvilDamagedEvent.DamageState.FULL);
        }

        if (event.isBreaking()) {
            event.setBreaking(false);
        }

    }

}
