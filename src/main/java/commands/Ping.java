package commands;

import configurations.Configuration;
import org.javacord.api.listener.message.MessageCreateListener;

public class Ping implements MessageCreateListener {
    configurations.Configuration configuration = new configurations.Configuration();
    @Override
    public void onMessageCreate(org.javacord.api.event.message.MessageCreateEvent event) {
        if (event.getMessageContent().equalsIgnoreCase(configuration.getPrefix() + "ping")) {
            event.getChannel().sendMessage("``>ping`` command is not yet implemented.");
        }
    }
}
