# Minecraft Plugin: upranks by almighty

upranks by almighty is a Minecraft plugin for Paper servers that provides rank based player kill messages. When one player kills another player, the plugin replaces the default death message with a message showing the killer's rank, including Admin, Moderator, or Player.

## Install

1. Build the plugin with Java 21 and Maven:
   `mvn clean package`
2. Find the generated JAR at:
   `target/plugin.jar`
3. Copy `plugin.jar` into your Paper server's `plugins` folder.
4. Start or restart the server.
5. Grant rank permissions to players as needed:
   - `rankkillmessages.admin` displays the Admin rank.
   - `rankkillmessages.moderator` displays the Moderator rank.
6. Players without either permission receive the Player rank.

## Use

1. Give a player the Admin permission:
   `/lp user <player> permission set rankkillmessages.admin true`
2. Give a player the Moderator permission:
   `/lp user <player> permission set rankkillmessages.moderator true`
3. Have a player kill another player.
4. The server displays a message such as:
   `Admin eliminated PlayerName`

The plugin has no commands, configuration file, or tag command. Admin has priority when a player has both rank permissions. The

---

More Minecraft plugin projects by EnderDevelopment: https://github.com/EnderDevelopment

Project page: https://dash.enderdevelopment.com/community/c4b23285-0ee2-492a-a0a3-462a12630edb?utm_source=github&utm_medium=readme&utm_campaign=auto_publish&utm_content=c4b23285-0ee2-492a-a0a3-462a12630edb
