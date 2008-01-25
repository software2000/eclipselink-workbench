/*******************************************************************************
* Copyright (c) 2007 Oracle. All rights reserved.
* This program and the accompanying materials are made available under the terms of
* the Eclipse Public License v1.0, which accompanies this distribution and is available at
* http://www.eclipse.org/legal/epl-v10.html.
*
* Contributors:
*     Oracle - initial API and implementation
******************************************************************************/
package org.eclipse.persistence.tools.workbench.mappingsmodel.mapping.relational;

import org.eclipse.persistence.tools.workbench.mappingsmodel.descriptor.MWDescriptor;

public interface AggregateRuntimeFieldNameGenerator {

	/** 
	 * used for specifying unique field names inside the aggregate descriptor
	 * and matching up with field translations in the aggregateObjectMapping
	 * This will be persisted and used to create a runtime project
	 */
	String fieldNameForRuntime();
	
	/**
	 * A description of the field that will be used in the UI
	 */
	AggregateFieldDescription fullFieldDescription();
	
	/**
	 * Return true if this field will be written by toplink.  
	 * For example a 1-1 target foreign key would return false.
	 */
	boolean fieldIsWritten();

	/**
	 * Return the generator's owning" descriptor.
	 * This is used to build an AggregatePathToColumn's description.
	 */
	MWDescriptor owningDescriptor();

}
