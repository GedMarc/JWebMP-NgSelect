package com.jwebmp.plugins.ngselect.implementations;

import com.guicedee.guicedinjection.interfaces.*;
import jakarta.validation.constraints.*;

import java.util.*;

public class NgSelectInclusionModule implements IGuiceScanModuleInclusions<NgSelectInclusionModule>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.ngselect");
		return set;
	}
}
