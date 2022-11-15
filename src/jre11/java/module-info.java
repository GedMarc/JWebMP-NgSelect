import com.jwebmp.plugins.ngselect.*;
import com.jwebmp.plugins.ngselect.implementations.*;

module com.jwebmp.plugins.ngselect {
	
	exports com.jwebmp.plugins.ngselect;
	
	requires transitive com.jwebmp.core;
	requires com.jwebmp.core.base.angular.client;
	
	provides com.jwebmp.core.services.IPageConfigurator with NgSelectPageConfigurator;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with NgSelectInclusionModule;
	
	opens com.jwebmp.plugins.ngselect.implementations to com.google.guice;
	opens com.jwebmp.plugins.ngselect to com.google.guice,com.jwebmp.core,com.fasterxml.jackson.databind;
}
