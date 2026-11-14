package com.enderdevelopment.plugin;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        Player killer = event.getPlayer().getKiller();
        if (killer == null) {
            return;
        }

        event.deathMessage(createKillMessage(killer, event.getPlayer()));
    }

    private Component createKillMessage(Player killer, Player victim) {
        Component rank = Component.text(getAdminRank(killer), NamedTextColor.GOLD);
        Component victimName = Component.text(victim.getName(), NamedTextColor.RED);
        return Component.text()
                .append(rank)
                .append(Component.text(" eliminated ", NamedTextColor.GRAY))
                .append(victimName)
                .build();
    }

    private String getAdminRank(Player player) {
        if (player.hasPermission("rankkillmessages.admin")) {
            return "Admin";
        }
        if (player.hasPermission("rankkillmessages.moderator")) {
            return "Moderator";
        }
        return "Player";
    }
}
