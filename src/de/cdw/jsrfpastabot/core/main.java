package de.cdw.jsrfpastabot.core;

import com.cavariux.twitchirc.Chat.Channel;

public class main {

    public static void main(String[] args) {
        Bot bot = new Bot();

        bot.connect();
        Channel channel = bot.joinChannel("#chrisderwahre");
        bot.sendMessage("Jet Set Radiooooooo Future Pasta Bot started!", channel);
        bot.start();
    }
}
