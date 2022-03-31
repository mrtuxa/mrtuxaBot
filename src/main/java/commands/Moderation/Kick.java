package commands.Moderation;

import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

public class Kick implements MessageCreateListener {
    configurations.Configuration configuration = new configurations.Configuration();
    @Override
    public void onMessageCreate(MessageCreateEvent messageCreateEvent) {
        /*String content = messageCreateEvent.getMessageContent();
        if (content.startsWith(configuration.getPrefix() + "kick")) {
            String[] args = content.split(" ");
            if (args.length == 2) {
                messageCreateEvent.getMessage().getMentionedUsers().forEach(user -> {
                    messageCreateEvent.getChannel().server.kickUser(user);
                });
            }
        }*/
    }
}
