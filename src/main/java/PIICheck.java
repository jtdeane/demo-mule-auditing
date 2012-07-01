import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

/**
 * Handles requests for Mock PII Audit
 * @author jeremydeane
 *
 */
public final class PIICheck implements Callable {	
	

	/**
	 * andles requests for Mock PII Audit
	 * @param context
	 * @return Object
	 * @throws Exception
	 */
	@Override
	public Object onCall(MuleEventContext context) throws Exception {
		
		String text = (String) context.getMessage().getPayload();
        
		String auditResult = null;
        
        if (text.length() > 21) {
        	
        	auditResult = "FOUND PII";
        	
        } else {
        	
        	auditResult = "NO PII";
        }
        
        return auditResult;
	}
}