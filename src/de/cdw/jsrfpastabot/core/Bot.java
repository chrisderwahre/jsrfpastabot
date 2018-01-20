package de.cdw.jsrfpastabot.core;

import com.cavariux.twitchirc.Chat.Channel;
import com.cavariux.twitchirc.Chat.User;
import com.cavariux.twitchirc.Core.TwitchBot;
import de.cdw.jsrfpastabot.util.Secrets;
import de.cdw.jsrfpastabot.util.Statics;

public class Bot extends TwitchBot{

    public Bot() {
        this.setUsername(Secrets.username);
        this.setOauth_Key(Secrets.oauth_key);
        this.setClientID(Secrets.client_id);
    }

    @Override
    public void onMessage(User user, Channel channel, String message) {
        if (message.equalsIgnoreCase(Statics.trigger + "info")) {
            this.sendMessage("JSRFPastaBot by ChrisderWahre ©ChrisderWahre 2018", channel);
        }

        if (message.equalsIgnoreCase(Statics.trigger + "help")) {
            this.sendMessage("Type !!<lateger, laat, gettingstoned, gettinglate, gettingblind, gettin'late, osoi> for a pasta.", channel);
        }

        if (message.equalsIgnoreCase(Statics.trigger + "github")) {
            this.sendMessage("If you are interested in Programming or want to see how the Bot works: github.com/chrisderwahre/jsrfpastabot", channel);
        }

        if (message.equalsIgnoreCase(Statics.trigger + "lateger")) {
            this.sendMessage("Jemand war so nett um mich wissen zu lassen dass du hier bist.Jetzt ist es meine Chance, mich um dich zu kümmern. Dieses mal bin ich bereit, also denk nicht, dass es wie letztes Mal wird. Wiederstand ist zwecklos du kleines Meerschweinchen... Akzeptier einfach dein Schicksal. Ha ha... Versuch kein lustiges Geschäft zu machen. Es wird schon spät.Meerschweinchen? Was hab' ich mir nur gedacht...? GuineaPig", channel);
        }

        if (message.equalsIgnoreCase(Statics.trigger + "laat")) {
            this.sendMessage("Iemand was zo aardig om mij te vertellen waar jullie waren. Nu kan ik eindelijk met jullie afrekenen. Dit keer ben ik er klaar voor, dus denk maar niet dat het hetzelfde zal verlopen als de vorige keer. Tegenstribbelen is zinloos kleine hamsters. Accepteer je lot maar. En probeer vooral niet leuk te doen. Het word alweer laat. GuineaPig", channel);
        }

        if (message.equalsIgnoreCase(Statics.trigger + "gettingstoned")) {
            this.sendMessage("\tA stoner was kind enough to let me know you were in Amsterdam. Now is my chance to join the amsterdandedelion. This time we can all join, so it will go down in history. Resistance would be stupid, just party like little Stroopwafels. Just Let go. Lets try some funny buiseness to just for fun. Its already the bottom of the bottle :( . Stroopwafel. GuineaPig", channel);
        }

        if (message.equalsIgnoreCase(Statics.trigger + "gettinglate")) {
            this.sendMessage("Someone was kind enough to let me know you're here. Now's my chance to take care of you once and for all. This time I'm prepared, so don't think it'll go down like last time. Resistance is futile, you little guinea pigs. Just accept your fate. Don't try any funny business either. It's already getting late. GuineaPig", channel);
        }

        if (message.equalsIgnoreCase(Statics.trigger + "gettingblind")) {
            this.sendMessage("⠠⠐⠎⠐⠕⠀⠴⠀⠅⠔⠙⠀⠢⠀⠞⠕⠀⠇⠑⠞⠀⠍⠑⠀⠐⠅⠀⠽⠄⠗⠑⠀⠐⠓⠲⠀⠠⠝⠪⠄⠎⠀⠍⠽⠀⠡⠨⠑⠀⠞⠕⠀⠞⠁⠅⠑⠀⠉⠜⠑⠀⠷⠀⠽⠀⠕⠝⠉⠑⠀⠯⠀⠿⠀⠁⠇⠇⠲⠀⠠⠹⠀⠐⠞⠀⠠⠊⠄⠍⠀⠏⠗⠑⠏⠜⠫⠂⠀⠎⠀⠙⠕⠝⠄⠞⠀⠹⠔⠅⠀⠭⠄⠇⠇⠀⠛⠀⠙⠪⠝⠀⠇⠀⠇⠁⠌⠀⠐⠞⠲⠀⠠⠗⠑⠎⠊⠌⠨⠑⠀⠊⠎⠀⠋⠥⠞⠊⠇⠑⠂⠀⠽⠀⠇⠇⠀⠛⠥⠔⠑⠁⠀⠏⠊⠛⠎⠲⠀⠠⠚⠀⠁⠒⠑⠏⠞⠀⠽⠗⠀⠋⠁⠞⠑⠲⠀⠠⠙⠕⠝⠄⠞⠀⠞⠗⠽⠀⠁⠝⠽⠀⠋⠥⠝⠝⠽⠀⠃⠥⠎⠊⠰⠎⠀⠑⠊⠲⠀⠠⠭⠄⠎⠀⠁⠇⠗⠀⠛⠑⠞⠞⠬⠀⠇⠁⠞⠑⠲", channel);
        }

        if (message.equalsIgnoreCase(Statics.trigger + "gettin'late")) {
            this.sendMessage("Someone was kind enough t' let me know ye're here. Now's me chance t' loot care o' ye once 'n fer all. This time I be prepared, so don't reckon it'll go down like last time. Resistance be futile, ye wee guinea pigs. Jus' accept yer fate. Don't try any funny business either. 'tis already gettin' late.", channel);
        }

        if (message.equalsIgnoreCase(Statics.trigger + "osoi")) {
            this.sendMessage("どなたかさんの通報でなぁ。オマエラを一斉に片付ける絶好のタイミングじゃねぇか、スバラシイ！こんどは準備バンタンだ！前回のようには、いかねえぞ。死をかくごしたオナガウサギは、死を待ち「ダンス」をおどるというぜ。ハハハハハ！！！さぁ、悪あがきすんじゃねぇぞ！ハハハッハ！もう夜もおそいしなぁ～。 GuineaPig", channel);
        }

        //if (message.equalsIgnoreCase(Statics.trigger + "lateger")) {
            //this.sendMessage("", channel);
        //}

    }
}
