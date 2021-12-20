package logger;

import java.util.logging.LogRecord;

public class Formatter extends Logger1 {
public String format(LogRecord record)
{
return record.getMessage()+":"+record.getSourceMethodName()+":"	
}
}
