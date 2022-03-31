package commands;

import javafx.scene.paint.Color;
import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;


public class Userinfo implements MessageCreateListener {
    configurations.Configuration configuration = new configurations.Configuration();

    public void onMessageCreate(MessageCreateEvent event) {
        if (event.getMessage().getContent().equalsIgnoreCase(configuration.getPrefix() + "userinfo")) {
            event.getChannel().sendMessage(new EmbedBuilder()
                    .setTitle("Userinfo")
                    .setDescription("This command will show you your userinfo")
                    .setThumbnail(event.getMessageAuthor().getAvatar())
                    .setAuthor(event.getMessageAuthor().getName(), null, event.getMessageAuthor().getAvatar())
                    .addField("Name", event.getMessageAuthor().getName(), true)
                    .addField("ID", event.getMessageAuthor().getIdAsString(), true)
                    .addField("Joined", event.getMessageAuthor().getCreationTimestamp().toString(), true)
                    .setFooter("Requested by " + event.getMessageAuthor().getName(), event.getMessageAuthor().getAvatar()));
        }
    }
}

