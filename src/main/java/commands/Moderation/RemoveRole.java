package commands.Moderation;

import org.javacord.api.listener.message.MessageCreateListener;

public class RemoveRole implements MessageCreateListener {
    configurations.Configuration configuration = new configurations.Configuration();
    @Override
    public void onMessageCreate(org.javacord.api.event.message.MessageCreateEvent event) {
        if (event.getMessage().getContent().equalsIgnoreCase(configuration.getPrefix() + "removerole")) {
            event.getChannel().sendMessage(configuration.getPrefix() + "removerole <rolename>");
        }
    }
}
