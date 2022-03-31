package commands;
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
                                    .addField("Commands", "`" + configuration.getPrefix() + "help` - Shows this message\n") // createt, not implemented yet
                                    .addField(" ","`" + configuration.getPrefix() + "ping` - Pong!\n") // ping, not implemented yet
                                    .addField(" ","`" + configuration.getPrefix() + "say` - Says what you want it to say\n") // implement yet
                                    .addField(" ","`" + configuration.getPrefix() + "kick` - Kicks a user\n") // implement yet (not working)
                                    .addField(" ", "`" + configuration.getPrefix() + "ban` - Bans a user\n") // not implemented yet
                                    .addField(" ","`" + configuration.getPrefix() + "purge` - Purges a number of messages\n") // implemented yet (not working)
                                    .addField(" ","`" + configuration.getPrefix() + "serverinfo` - Shows information about the server\n")
                                    .addField(" ", "`" + configuration.getPrefix() + "userinfo` - Shows information about the user\n")
                                    .addField(" ","`" + configuration.getPrefix() + "avatar` - Shows the avatar of the user\n")
                                    .addField(" ","`" + configuration.getPrefix() + "servericon` - Shows the icon of the server\n")
                                    .addField(" ","`" + configuration.getPrefix() + "roleinfo` - Shows information about the role\n")
                                    .addField(" ","`" + configuration.getPrefix() + "rolecolor` - Changes the color of the role\n")
                                    .addField(" ","`" + configuration.getPrefix() + "role` - Gives a role to a user\n")
                                    .addField(" ", "`" + configuration.getPrefix() + "removerole` - Removes a role from a user\n")
                                    .addField(" ", "`" + configuration.getPrefix() + "nickname` - Changes the nickname of the user\n")
                                    .addField(" ","`" + configuration.getPrefix() + "channelinfo` - Shows information about the channel\n")
                                    .addField(" ","`" + configuration.getPrefix() + "channelname` - Changes the name of the channel\n")
                                    .addField(" ", "`" + configuration.getPrefix() + "channeltopic` - Changes the topic of the channel\n")
                                    .addField(" ","`" + configuration.getPrefix() + "channelposition` - Changes the position of the channel\n")
                                    .addField(" ","`" + configuration.getPrefix() + "channel create <name>` - Creates a channel\n")
                                    .addField(" ","`" + configuration.getPrefix() + "channel delete #<?id>` - Deletes a channel\n")
                                    .addField(" ","`" + configuration.getPrefix() + "channel move #<?id> <?categorie>` - Moves a channel\n")
                                    .addField(" ","`" + configuration.getPrefix() + "channel set name <?name>` - Sets the name of the channel\n")
                                    .addField("", "`" + configuration.getPrefix() + "channel set topic<?topic>` - Sets the topic of the channel\n")
                                    .addField("", "`" + configuration.getPrefix() + "channel set position <?position>` - Sets the position of the channel\n")
                                    //.addInlineField(" ","`" + configuration.getPrefix() + "channel set nsfw <true/false>` - Sets the nsfw of the channel\n")
                    .setFooter(configuration.getFooterText(), configuration.getFooterIcon())
                    .setColor(Color.BLUE)
                    .setThumbnail(configuration.getAvatarUrl()));

        }
    }
}

