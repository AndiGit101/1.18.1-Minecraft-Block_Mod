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
    public void breakBlock(BlockBreakEvent e)
    {
        int times = 0;
        if(e.getBlock().getBlockData().getMaterial() == Material.DIRT)
        {
            System.out.println("Bedrok broken");
            System.out.println(times);
            times++;
        }

    //Start plugin(If the player breaks a block, then it will drop a radnom item, will gor from there)


    }
}
