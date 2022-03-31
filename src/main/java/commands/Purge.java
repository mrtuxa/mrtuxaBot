package commands;

import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

public class Purge implements MessageCreateListener {
    configurations.Configuration configuration = new configurations.Configuration();
    public void onMessageCreate(MessageCreateEvent event) {
      /*  if (event.getMessage().getContent().equalsIgnoreCase(configuration.getPrefix() + "purge")) {
            if (event.getMessage().getMentionedUsers().size() == 0) {
                event.getChannel().deleteMessageById(event.getMessage().getId()).join();
                event.getChannel().sendMessage("You need to mention a user to purge their messages!").join();
            } else {
                event.getChannel().deleteMessageById(event.getMessage().getId()).join();
                event.getChannel().sendMessage("Purging messages...").join();
                event.getChannel().getMessagesBefore(event.getMessage().getCreationTimestamp()).thenAcceptAsync(messages -> {
                    for (int i = 0; i < messages.size(); i++) {
                        if (messages.get(i).getAuthor().equals(event.getMessage().getMentionedUsers().get(0))) {
                            messages.get(i).delete().join();
                        }
                    }
                });
            }
        }*/
    }
}
