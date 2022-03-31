package commands.Moderation;

import configurations.Configuration;
import org.javacord.api.listener.message.MessageCreateListener;

public class ChannelCreate implements MessageCreateListener {
    configurations.Configuration configuration = new Configuration();
    @Override
    public void onMessageCreate(org.javacord.api.event.message.MessageCreateEvent event) {
        if (event.getMessage().getContent().equalsIgnoreCase(configuration.getPrefix() + "channelcreate")) {
            event.getChannel().sendMessage("``channelcreate`` is not yet implemented.");
        }
    }
}
