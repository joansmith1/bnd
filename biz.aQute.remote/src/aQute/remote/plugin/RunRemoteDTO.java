package aQute.remote.plugin;

import java.util.*;

import aQute.bnd.util.dto.*;

public class RunRemoteDTO extends DTO {
	Map<String,Object>	__extra;
	public String		name;
	public String		host;
	public int			agent;
	public int			jdb;
	public int			timeout;
	public int			shell	= 0;
}