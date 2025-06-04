package otros;
import java.util.List;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class CensurarPalabra extends Handler
{
	
    private Handler baseHandler;
    private List<String> censuradas;

    public CensurarPalabra(Handler baseHandler, List<String> censuradas) {
        this.baseHandler = baseHandler;
        this.censuradas = censuradas;
    }

    @Override
    public void publish(LogRecord record) {
        String msg = record.getMessage();
        for (String palabra : censuradas) {
            msg = msg.replaceAll(palabra, "***");
        }
        record.setMessage(msg);
        baseHandler.publish(record);
    }

	@Override
	public void flush()
	{
		 baseHandler.flush();
	}

	@Override
	public void close() throws SecurityException 
	{
		 baseHandler.flush();
	}
	
}
