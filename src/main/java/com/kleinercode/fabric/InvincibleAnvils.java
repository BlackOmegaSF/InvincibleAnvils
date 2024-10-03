package com.kleinercode.fabric;

import net.fabricmc.api.DedicatedServerModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InvincibleAnvils implements DedicatedServerModInitializer {

    public static final String MOD_ID = "invincible-anvils";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeServer() {

        LOGGER.info("Using anvils won't break them on this server");

    }

}
