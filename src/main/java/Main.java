import commands.Moderation.*;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.entity.activity.ActivityType;
import org.javacord.api.entity.channel.ServerChannel;
import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.entity.user.User;
import org.javacord.api.interaction.SlashCommand;
import org.javacord.api.interaction.SlashCommandInteraction;
import org.javacord.api.util.logging.FallbackLoggerConfiguration;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // Logger
        FallbackLoggerConfiguration.setDebug(true);
        FallbackLoggerConfiguration.setTrace(true);

        // configuration
        configurations.Configuration configuration = new configurations.Configuration();

        // Discord API
        DiscordApi api = new DiscordApiBuilder()
                .setToken(configuration.getToken())
                .addListener(new Avatar())
                .addListener(new Ban())
                .addListener(new ChannelCreate())
                .addListener(new ChannelDelete())
                .addListener(new ChannelInfo())
                .addListener(new ChannelInfo())
                .addListener(new ChannelPosition())
                .addListener(new Help())
                .addListener(new Invite())
                .addListener(new Kick())
                .addListener(new Nickname())
                .addListener(new Ping())
                .addListener(new Purge())
                .addListener(new RemoveRole())
                .addListener(new Role())
                .addListener(new RoleColor())
                .addListener(new RoleInfo())
                .addListener(new Say())
                .addListener(new ServerInfo())
                .addListener(new Userinfo())
                .login()
                .join();
        // activity set image
        api.updateActivity(configuration.getActivityName(), configuration.getActivityUrl());

        // slash commands

        // register
        SlashCommand pingCommand = SlashCommand.with("ping", "Responds with pong!")
                .createGlobal(api)
                .join();

        // respond

        api.addSlashCommandCreateListener(event -> {
            SlashCommandInteraction slashCommandInteracion = event.getSlashCommandInteraction();
            ServerChannel channel = slashCommandInteracion.getOptionChannelValueByIndex(0).orElse(null);
            User user = slashCommandInteracion.getOptionUserValueByIndex(1).orElse(null);
            Long permissionNumber = slashCommandInteracion.getOptionLongValueByIndex(2).orElse(null);

            slashCommandInteracion.createImmediateResponder()
                    .setContent("Pong!")
                    .respond();
        });

        // help command
        SlashCommand helpCommand = SlashCommand.with("help", "Responds with help!")
                .createGlobal(api)
                .join();
        // respond
        api.addSlashCommandCreateListener(event -> {
            SlashCommandInteraction slashCommandInteracion = event.getSlashCommandInteraction();
            ServerChannel channel = slashCommandInteracion.getOptionChannelValueByIndex(0).orElse(null);
            User user = slashCommandInteracion.getOptionUserValueByIndex(1).orElse(null);
            Long permissionNumber = slashCommandInteracion.getOptionLongValueByIndex(2).orElse(null);

            slashCommandInteracion.createImmediateResponder()
                    .setContent(String.valueOf(new EmbedBuilder()
                            .setAuthor("Help", null, event.getApi().getYourself().getAvatar())
                            .setTitle("Help")
                            .setDescription("This is a help command")
                            .addField("Commands", "`" + configuration.getPrefix() + "help` - Shows this message\n", true) // createt, not implemented yet
                            .addField("Ping", "`" + configuration.getPrefix() + "ping` - Pong!\n", true) // ping, not implemented yet
                            .addField("Say", "`" + configuration.getPrefix() + "say` - Says what you want it to say\n", true) // implement yet
                            .addField("Kick", "`" + configuration.getPrefix() + "kick` - Kicks a user\n", true) // implement yet (not working)
                            .addField("Ban", "`" + configuration.getPrefix() + "ban` - Bans a user\n", true) // not implemented yet
                            .addField("Purge", "`" + configuration.getPrefix() + "purge` - Purges a number of messages\n", true) // implemented yet (not working)
                            .addField("Server Information", "`" + configuration.getPrefix() + "serverinfo` - Shows information about the server\n", true) // implemented yet
                            .addField("User Information", "`" + configuration.getPrefix() + "userinfo` - Shows information about the user\n", true) // implemented yet
                            .addField("Avatar", "`" + configuration.getPrefix() + "avatar` - Shows the avatar of the user\n", true) // implemented yet (not working)
                            .addField("Role Informations", "`" + configuration.getPrefix() + "roleinfo` - Shows information about the role\n", true) // implemented yet (not ready)
                            .addField("Role Color", "`" + configuration.getPrefix() + "rolecolor` - Changes the color of the role\n", true) // implemented
                            .addField("Role", "`" + configuration.getPrefix() + "role` - Gives a role to a user\n", true) // implemented yet (not ready)
                            .addField("Remove Role", "`" + configuration.getPrefix() + "removerole` - Removes a role from a user\n", true) // implemented yet (not ready)
                            .addField("Nickname", "`" + configuration.getPrefix() + "nickname` - Changes the nickname of the user\n", true) // implemented yet (not ready)
                            .addField("Channel Information", "`" + configuration.getPrefix() + "channelinfo` - Shows information about the channel\n", true) // implemented yet (not ready)
                            .addField("Channel Name", "`" + configuration.getPrefix() + "channelname` - Changes the name of the channel\n", true) // implemented yet (not ready)
                            .addField("Channel Topic", "`" + configuration.getPrefix() + "channeltopic` - Changes the topic of the channel\n", true) // implemented yet (not ready)
                            .addField("Channel Creator", "`" + configuration.getPrefix() + "channel create <name>` - Creates a channel\n", true) // implemented yet (not ready)
                            .addField("Channel Delete", "`" + configuration.getPrefix() + "channel delete #<?id>` - Deletes a channel\n", true) // implemented yet (not ready)
                            .addField("Channel Move", "`" + configuration.getPrefix() + "channel move #<?id> <?categorie>` - Moves a channel\n", true) // implemented yet (not ready)
                            .setFooter("mrtuxa", "https://cdn.discordapp.com/avatars/539058180989879552/b8f9f8f8f8f8f8f8f8f8f8f8f8f8f8f8.png")
                            .setColor(Color.BLUE)

                            .setThumbnail(configuration.getAvatarUrl())));
        });
    }
}
