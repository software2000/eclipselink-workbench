/*******************************************************************************
* Copyright (c) 2007 Oracle. All rights reserved.
* This program and the accompanying materials are made available under the terms of
* the Eclipse Public License v1.0, which accompanies this distribution and is available at
* http://www.eclipse.org/legal/epl-v10.html.
*
* Contributors:
*     Oracle - initial API and implementation
******************************************************************************/
package org.eclipse.persistence.tools.workbench.framework.internal;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/**
 * This log handler opens a dialog to notify the user of
 * any log entries above a specified level.
 */
final class FrameworkLogHandler extends Handler {
	private FrameworkApplication application;

	/**
	 * Construct a log handler that will notify the user via a dialog
	 * of any log entries that meet or exceed the specified level.
	 */
	public FrameworkLogHandler(FrameworkApplication application, Level level) {
		super();
		this.application = application;
		this.setLevel(level);
	}

	/**
	 * @see java.util.logging.Handler#close()
	 */
	public void close() throws SecurityException {
		// do nothing
	}

	/**
	 * @see java.util.logging.Handler#flush()
	 */
	public void flush() {
		// do nothing
	}

	/**
	 * If the record is loggable, notify the user.
	 * @see java.util.logging.Handler#publish(java.util.logging.LogRecord)
	 */
	public void publish(LogRecord record) {
		if (this.isLoggable(record)) {
			FrameworkLogHandlerDialog dialog = new FrameworkLogHandlerDialog(this.application, record);
			// make the dialog non-modal so we don't hang the log handling loop
			dialog.setModal(false);
			dialog.show();
		}
	}

}
