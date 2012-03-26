package nl.tudelft.ewi.st.atlantis.v1.services.tools.filters;

import org.ebayopensource.turmeric.runtime.common.impl.handlers.BaseHandler;
import org.ebayopensource.turmeric.runtime.common.pipeline.MessageContext;

public abstract class Filter extends BaseHandler{
	protected String contextToString(MessageContext ctx) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Service: "+ctx.getAdminName());
		sb.append("\n");
		sb.append("RID: "+ctx.getRequestId());
		
		return sb.toString();
	}
}
