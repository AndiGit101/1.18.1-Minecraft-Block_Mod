package me.clowr__.modding1;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.plugin.java.JavaPlugin;


    
public final class Modding1 extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("Plugin enabled");

        getServer().getPluginManager().registerEvents(this , this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        System.out.println("Shut down");
    }



    @EventHandler
    public void breakBlock(BlockBreakEvent e) throws InterruptedException {

        Player p = (Player)e.getPlayer();

        e.getPlayer().sendMessage("I broke a block.");
        Thread.sleep(2000);
        e.getPlayer().sendMessage("This executes after 2 seconds");

        e.getBlock().setType(Material.DIAMOND);

        e.getPlayer().sendMessage("DIAMONDS");

    }
}
