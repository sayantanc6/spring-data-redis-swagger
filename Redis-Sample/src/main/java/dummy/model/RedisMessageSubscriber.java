package dummy.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class RedisMessageSubscriber implements MessageListener {
	
    public static List<String> messageList = new ArrayList<String>();

	@Override
	public void onMessage(Message message, byte[] pattern) {
        System.out.println( "Message received: " + message.toString());
	}
 
}
