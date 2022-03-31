package commands.Moderation;

import org.javacord.api.listener.message.MessageCreateListener;

import java.io.File;

public class Avatar implements MessageCreateListener {
    configurations.Configuration configuration = new configurations.Configuration();
    @Override
    public void onMessageCreate(org.javacord.api.event.message.MessageCreateEvent event) {
        if (event.getMessage().getContent().equalsIgnoreCase(configuration.getPrefix() + "avatar")) {
            event.getChannel().sendMessage((File) event.getMessage().getAuthor().getAvatar());
        }
    }
}
