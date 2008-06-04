package org.jrest4guice.sample.resources;

import org.jrest4guice.commons.fileupload.UploadInfo;
import org.jrest4guice.commons.fileupload.UploadMonitor;
import org.jrest4guice.rest.annotations.Get;
import org.jrest4guice.rest.annotations.Path;

import com.google.inject.Inject;

/**
 * 
 * @author <a href="mailto:zhangyouqun@gmail.com">cnoss</a>
 *
 */
@Path("/monitor")
public class FileuploadMonitor {
	@Inject
	private UploadMonitor monitor;
	
	@Get
	public UploadInfo getUploadInfo(){
		return this.monitor.getUploadInfo();
	}
}
