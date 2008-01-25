/*******************************************************************************
* Copyright (c) 2007 Oracle. All rights reserved.
* This program and the accompanying materials are made available under the terms of
* the Eclipse Public License v1.0, which accompanies this distribution and is available at
* http://www.eclipse.org/legal/epl-v10.html.
*
* Contributors:
*     Oracle - initial API and implementation
******************************************************************************/
package org.eclipse.persistence.tools.workbench.mappingsmodel.mapping;

import org.eclipse.persistence.tools.workbench.mappingsmodel.descriptor.MWMappingDescriptor;
import org.eclipse.persistence.tools.workbench.mappingsmodel.meta.MWClassAttribute;


public interface MWMappingFactory 
{	
	MWDirectMapping createDirectMapping(MWMappingDescriptor descriptor, MWClassAttribute attribute, String name);
	
	MWDirectCollectionMapping createDirectCollectionMapping(MWMappingDescriptor descriptor, MWClassAttribute attribute, String name);
	
	MWDirectMapMapping createDirectMapMapping(MWMappingDescriptor descriptor, MWClassAttribute attribute, String name);
	
	MWTransformationMapping createTransformationMapping(MWMappingDescriptor descriptor, MWClassAttribute attribute, String name);
}
