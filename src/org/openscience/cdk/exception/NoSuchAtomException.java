/* $RCSfile$   
 * $Author$   
 * $Date$   
 * $Revision$
 * 
 * Copyright (C) 2001-2004  The Chemistry Development Kit (CKD) project
 *
 * Contact: cdk-devel@lists.sourceforge.net
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2.1
 * of the License, or (at your option) any later version.
 * All I ask is that proper credit is given for my work, which includes
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
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 */
package org.openscience.cdk.exception;

/**
 * Exception that is thrown when an Atom is requested or required that
 * does not exist in the relevant environment.
 *
 * @cdk.module core
 */
public class NoSuchAtomException extends CDKException {

    /**
     * Constructs a new NoSuchAtomException with the given message.
     *
     * @param Message for the constructed exception
     */
    public NoSuchAtomException(String message) {
        super( message );
    }
}
