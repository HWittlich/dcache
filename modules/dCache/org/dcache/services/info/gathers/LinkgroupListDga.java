package org.dcache.services.info.gathers;

import org.apache.log4j.Logger;
import org.dcache.services.info.InfoProvider;
import diskCacheV111.services.space.message.GetLinkGroupNamesMessage;
import dmg.cells.nucleus.CellPath;

/**
 * This class should really be folded into SingleMessageDga, but unfortunately
 * the Message class doesn't have a clone() method.
 * 
 * @author Paul Millar <paul.millar@desy.de>
 */
public class LinkgroupListDga extends SkelPeriodicActivity {

	private static Logger _log = Logger.getLogger( LinkgroupListDga.class);

	private static final String SRM_CELL_NAME = "SrmSpaceManager";
	
	/** Assume that a message might be lost and allow for 50% jitter */
	private static final double SAFETY_FACTOR = 2.5;
	
	private CellPath _cp = new CellPath( SRM_CELL_NAME);
	private MessageHandlerChain _mhc = InfoProvider.getInstance().getMessageHandlerChain();
	
	/** The period between successive requests for data, in seconds */
	long _metricLifetime;
	
	/**
	 * Create new DGA for maintaining a list of LinkGroups.
	 * @param interval how often the list of linkgroups should be updated, in seconds.
	 */
	public LinkgroupListDga( int interval) {
		super( interval);

		_metricLifetime = Math.round( interval * SAFETY_FACTOR);
	}

	/**
	 * When triggered, send a message.
	 */
	@Override
	public void trigger() {
		super.trigger();
		
		if( _log.isInfoEnabled())
			_log.info( "Sending linkgroup list request message");
		
		_mhc.sendMessage( _cp, new GetLinkGroupNamesMessage(), _metricLifetime); 
	}

	
	public String toString()
	{
		return this.getClass().getSimpleName();
	}	
}
