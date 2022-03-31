package commands;

import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

public class Say implements MessageCreateListener {
    configurations.Configuration configuration = new configurations.Configuration();
    @Override
    public void onMessageCreate(MessageCreateEvent messageCreateEvent) {
        String message = messageCreateEvent.getMessageContent();
        if (message.startsWith(configuration.getPrefix() + "say")) {
            String[] args = message.split(" ");
            if (args.length > 1) {
                messageCreateEvent.getChannel().sendMessage(message.substring(5));
            }
        }
    }
}
