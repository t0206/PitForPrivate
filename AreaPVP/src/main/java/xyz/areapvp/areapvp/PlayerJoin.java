package xyz.areapvp.areapvp;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        e.getPlayer().teleport( e.getPlayer( ).getWorld().getSpawnLocation( ) );
    }
}
