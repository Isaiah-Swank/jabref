/*  Copyright (C) 2003-2011 JabRef contributors.
    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License along
    with this program; if not, write to the Free Software Foundation, Inc.,
    51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
*/
package net.sf.jabref.imports;

import java.util.HashMap;

import net.sf.jabref.export.layout.LayoutFormatter;

public class CaseKeeper implements LayoutFormatter {
    private String[] wordList = new String[]{
	"VLSI",
	"FPGA",
	"ASIC",
	"ADC",
	"DSP",
	"DAC",
	"RF",
	"FFT",
	"DFT",
	"FIR",
	"IIR",
	"RAM",
	"ROM",
	"CMOS",
	"D/A",
	"A/D",
	"I/Q"
    };

    public CaseKeeper() {
	super();
    }

    public String format(String text) {
	if (text == null)
	    return null;
	for (int i = 0; i < wordList.length; i++) {
	    text = text.replaceAll("([ -\\}])" + wordList[i] + "(^\\})","$1\\{" + wordList[i] + "\\}$2");	    
	}
	return text;
    }
}