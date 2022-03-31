package commands.Moderation;

import org.javacord.api.listener.message.MessageCreateListener;

public class Say implements MessageCreateListener {
    configurations.Configuration configuration = new configurations.Configuration();
    public void onMessageCreate(org.javacord.api.event.message.MessageCreateEvent event) {
        if (event.getMessageContent().equalsIgnoreCase(configuration.getPrefix() + "say")) {
            event.getChannel().sendMessage(event.getMessage().getContent().split(" ")[1]);
        }
    }
}
