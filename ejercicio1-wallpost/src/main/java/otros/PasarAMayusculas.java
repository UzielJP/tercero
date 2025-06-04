package otros;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class PasarAMayusculas extends Formatter{

	@Override
	public String format(LogRecord record) 
	{
		return formatMessage(record).toUpperCase() + "\n";
	}

}
