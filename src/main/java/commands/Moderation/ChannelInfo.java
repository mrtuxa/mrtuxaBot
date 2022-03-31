package commands.Moderation;

import org.javacord.api.listener.message.MessageCreateListener;

public class ChannelInfo implements MessageCreateListener {
    configurations.Configuration configuration = new configurations.Configuration();
    @Override
    public void onMessageCreate(org.javacord.api.event.message.MessageCreateEvent event) {
        if (event.getMessageContent().equalsIgnoreCase(configuration.getPrefix() + "channelinfo")) {
            event.getChannel().sendMessage("``>channelinfo`` command is not yet implemented.");
        }
    }
}
