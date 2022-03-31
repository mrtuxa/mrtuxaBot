package commands.Moderation;
import configurations.Configuration;
import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

import java.awt.*;

public class Help implements MessageCreateListener {
    configurations.Configuration configuration = new configurations.Configuration();

    @Override
    public void onMessageCreate(MessageCreateEvent event) {
        if (event.getMessageContent().equalsIgnoreCase(configuration.getPrefix() + "help")) {
            event.getChannel().sendMessage(new EmbedBuilder()
                                    .setAuthor("Help", null, event.getApi().getYourself().getAvatar())
                                    .setTitle("Help")
                                    .setDescription("This is a help command")
                                    .addField("Commands", "`" + configuration.getPrefix() + "help` - Shows this message\n", true) // createt, not implemented yet
                                    .addField("Ping","`" + configuration.getPrefix() + "ping` - Pong!\n", true) // ping, not implemented yet
                                    .addField("Say","`" + configuration.getPrefix() + "say` - Says what you want it to say\n", true) // implement yet
                                    .addField("Kick","`" + configuration.getPrefix() + "kick` - Kicks a user\n",true ) // implement yet (not working)
                                    .addField("Ban", "`" + configuration.getPrefix() + "ban` - Bans a user\n", true) // not implemented yet
                                    .addField("Purge","`" + configuration.getPrefix() + "purge` - Purges a number of messages\n", true) // implemented yet (not working)
                                    .addField("Server Information","`" + configuration.getPrefix() + "serverinfo` - Shows information about the server\n", true) // implemented yet
                                    .addField("User Information", "`" + configuration.getPrefix() + "userinfo` - Shows information about the user\n", true) // implemented yet
                                    .addField("Avatar","`" + configuration.getPrefix() + "avatar` - Shows the avatar of the user\n", true) // implemented yet (not working)
                                    .addField("Role Informations","`" + configuration.getPrefix() + "roleinfo` - Shows information about the role\n", true) // implemented yet (not ready)
                                    .addField("Role Color","`" + configuration.getPrefix() + "rolecolor` - Changes the color of the role\n", true) // implemented
                                    .addField("Role","`" + configuration.getPrefix() + "role` - Gives a role to a user\n", true) // implemented yet (not ready)
                                    .addField("Remove Role", "`" + configuration.getPrefix() + "removerole` - Removes a role from a user\n", true) // implemented yet (not ready)
                                    .addField("Nickname", "`" + configuration.getPrefix() + "nickname` - Changes the nickname of the user\n", true) // implemented yet (not ready)
                                    .addField("Channel Information","`" + configuration.getPrefix() + "channelinfo` - Shows information about the channel\n", true) // implemented yet (not ready)
                                    .addField("Channel Name","`" + configuration.getPrefix() + "channelname` - Changes the name of the channel\n", true) // implemented yet (not ready)
                                    .addField("Channel Topic", "`" + configuration.getPrefix() + "channeltopic` - Changes the topic of the channel\n", true) // implemented yet (not ready)
                                    .addField("Channel Creator","`" + configuration.getPrefix() + "channel create <name>` - Creates a channel\n", true) // implemented yet (not ready)
                                    .addField("Channel Delete","`" + configuration.getPrefix() + "channel delete #<?id>` - Deletes a channel\n", true) // implemented yet (not ready)
                                    .addField("Channel Move","`" + configuration.getPrefix() + "channel move #<?id> <?categorie>` - Moves a channel\n", true) // implemented yet (not ready)
                    .setFooter("Requested by " + event.getMessageAuthor().getName(), configuration.getFooterIcon())
                    .setColor(Color.BLUE)

                    .setThumbnail(configuration.getAvatarUrl()));
        }
    }
}

