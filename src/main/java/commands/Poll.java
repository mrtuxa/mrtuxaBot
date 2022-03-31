package commands;

import configurations.Configuration;
import org.javacord.api.entity.message.Message;
import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

import java.awt.*;

public class Poll implements MessageCreateListener {
    configurations.Configuration configuration = new Configuration();
    @Override
    public void onMessageCreate(MessageCreateEvent messageCreateEvent) {
        Message message = messageCreateEvent.getMessage();
        if (message.getContent().equalsIgnoreCase(configuration.getPrefix() + "poll")) {
            message.getChannel().sendMessage(new EmbedBuilder()
                                .setTitle("Poll")
                    .setDescription("This is a poll")
                    .setColor(Color.BLUE)
                    .setAuthor("Requested by " + messageCreateEvent.getMessageAuthor().getDisplayName())
                    .setFooter("Poll", messageCreateEvent.getMessageAuthor().getAvatar()));
        }
    }
}
