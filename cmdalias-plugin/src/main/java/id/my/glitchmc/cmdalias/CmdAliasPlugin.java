package id.my.glitchmc.cmdalias;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * CmdAlias - Command Alias Plugin for Minecraft
 * Allows players to create custom command aliases
 */
public class CmdAliasPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("CmdAlias plugin enabled!");
        
        // Register commands and listeners here
        this.getCommand("alias").setExecutor((sender, cmd, label, args) -> {
            sender.sendMessage("CmdAlias v1.0.0 loaded!");
            return true;
        });
    }

    @Override
    public void onDisable() {
        getLogger().info("CmdAlias plugin disabled!");
    }
}
