package commands;

import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

import java.awt.*;

public class ServerInfo implements MessageCreateListener {

    configurations.Configuration configuration = new configurations.Configuration();

    @Override
    public void onMessageCreate(MessageCreateEvent messageCreateEvent) {
        if (messageCreateEvent.getMessageContent().equalsIgnoreCase(configuration.getPrefix() + "serverinfo")) {
            messageCreateEvent.getChannel().sendMessage(new EmbedBuilder()
                            .setTitle("Server Info")
                            .setDescription("Replies with information about the server.")
                    .addField("Informations", "Server Name" + messageCreateEvent.getServer().get().getName() + "\n" +
                            "Member Count: " + "`" + messageCreateEvent.getServer().get().getMemberCount() + "`" + " Member", true)
                    .setColor(Color.BLUE)
                    .setThumbnail(configuration.getAvatarUrl())
                    .setFooter("Requested by " + messageCreateEvent.getMessageAuthor().getName(), configuration.getFooterIcon()));
                                                        //"Server Region: " + messageCreateEvent.getServer().get().getRegion().get().getName() + "\n" +
                                                        //"Server Icon: " + messageCreateEvent.getServer().get().getIcon().get().getUrl() + "\n");
        }
    }
}
