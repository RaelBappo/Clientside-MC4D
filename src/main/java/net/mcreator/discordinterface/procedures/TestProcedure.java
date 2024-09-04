package net.mcreator.discordinterface.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.ServerChatEvent;

import net.minecraft.entity.player.ServerPlayerEntity;

import java.util.Map;
import java.util.HashMap;
import javax.net.ssl.HttpsURLConnection;
import java.awt.Color;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import club.minnced.discord.webhook.send.WebhookMessage;
import club.minnced.discord.webhook.WebhookClient;
import net.minecraftforge.client.event.RenderGameOverlayEvent.Chat;
import net.minecraftforge.client.event.ClientChatReceivedEvent;


public class TestProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onChat(ClientChatReceivedEvent event) {
			//ServerPlayerEntity entity = event.getPlayer();
			//double i = entity.getPosX();
			//double j = entity.getPosY();
			//double k = entity.getPosZ();
			//Map<String, Object> dependencies = new HashMap<>();
			//dependencies.put("x", i);
			//dependencies.put("y", j);
			//dependencies.put("z", k);
			//dependencies.put("world", entity.world);
			//dependencies.put("entity", entity);
			//dependencies.put("text", event.getMessage());
			//dependencies.put("event", event);
			WebhookClient client = WebhookClient.withUrl("https://discord.com/api/webhooks/1243737230342750208/sDFuh80GiXghfZPDI5JTdlVg354A70DIZ7s7G_MrwJPyUz94QGu19CqCXZaWVsiAnjqy");
			StringBuilder message = new StringBuilder(1000);
			message.append(event.getMessage());
			message.delete(0,650);
			message.delete(message.length()-385, message.length());
			client.send(message.toString());
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		
	}
}
