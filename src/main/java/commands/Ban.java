package commands;

import configurations.Configuration;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

public class Ban implements MessageCreateListener {
    configurations.Configuration configuration = new configurations.Configuration();
    @Override
    public void onMessageCreate(MessageCreateEvent event) {
      if (event.getMessageContent().equalsIgnoreCase(configuration.getPrefix() + "ban")) {
        event.getChannel().sendMessage("``>ban`` command is not yet implemented.");
      }
    }
}
