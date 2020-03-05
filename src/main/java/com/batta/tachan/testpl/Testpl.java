package com.batta.tachan.testpl;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class Testpl extends JavaPlugin {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        sender.sendMessage("aaaaa");
        getLogger().info("aaa!!");
        return false;

    }
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Hello, Minecraft!");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
