/* $Revision: 6707 $ $Author: egonw $ $Date: 2006-07-30 16:38:18 -0400 (Sun, 30 Jul 2006) $
 * 
 * Copyright (C) 2007  Egon Willighagen
 * 
 * Contact: cdk-devel@lists.sourceforge.net
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2.1
 * of the License, or (at your option) any later version.
 * All we ask is that proper credit is given for our work, which includes
 * - but is not limited to - adding the above copyright notice to the beginning
 * of your source code files, and to any copyright notice that you may distribute
 * with programs based on this work.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 */
package org.openscience.cdk.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * An annotation for source classes to indicate the JUnit test
 * class tests the functionality.
 *
 * @cdk.author Egon Willighagen
 * @cdk.svnrev $Revision: 9162 $
 * @cdk.module core
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface TestClass {
    Class value();
}
