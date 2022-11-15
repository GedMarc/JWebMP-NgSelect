/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.ngselect;

import com.jwebmp.core.*;
import com.jwebmp.core.base.angular.client.annotations.angularconfig.*;
import com.jwebmp.core.base.angular.client.annotations.boot.*;
import com.jwebmp.core.base.angular.client.annotations.typescript.*;
import com.jwebmp.core.plugins.*;
import com.jwebmp.core.services.*;
import jakarta.validation.constraints.*;

/**
 * The 3 meta tags *must* come first in the head; any other head content must come *after* these tags
 * <p>
 * HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries WARNING: Respond.js doesn't work if you view the page via
 * file://
 */
@PluginInformation(pluginName = "Ng Select",
        pluginDescription = "Angular ng-select - Lightweight all in one UI Select, Multiselect and Autocomplete",
        pluginUniqueName = "jwebmp-angular-ng-select",
        pluginVersion = "13.0.0",
        pluginCategories = "select,angular,ngselect,ui,web ui, framework",
        pluginSubtitle = "Lightweight all in one UI Select, Multiselect and Autocomplete.",
        pluginSourceUrl = "https://github.com/ng-select/ng-select",
        pluginWikiUrl = "https://github.com/ng-select/ng-select/wiki",
        pluginGitUrl = "https://github.com/GedMarc/JWebMP-NgSelect",
        pluginIconUrl = "bower_components/componenttemplate/componenttemplateicon.jpg",
        pluginIconImageUrl = "bower_components/componenttemplate/componenttemplatelogo.jpg",
        pluginOriginalHomepage = "https://github.com/GedMarc/JWebMP-NgSelect",
        pluginDownloadUrl = "https://github.com/GedMarc/JWebMP-NgSelect/")

@TsDependency(value = "@ng-select/ng-select", version = "^8.3.0")
@NgStyleSheet(value = "node_modules/@ng-select/ng-select/themes/default.theme.css",name = "ngselecttheme")

@NgBootImportReference(name = "NgSelectModule", reference = "@ng-select/ng-select")
@NgBootModuleImport("NgSelectModule")

public class NgSelectPageConfigurator
        implements IPageConfigurator<NgSelectPageConfigurator> {
    /**
     * If this configurator is enabled
     */
    private static boolean enabled = true;

    /**
     * The default page configurator for componenttemplate
     */
    public NgSelectPageConfigurator() {
        //Nothing Needed
    }

    /**
     * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
     * <p>
     * If this configurator is enabled
     *
     * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
     */
    public static boolean isEnabled() {
        return NgSelectPageConfigurator.enabled;
    }

    /**
     * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
     * <p>
     * If this configurator is enabled
     *
     * @param mustEnable the enabled of this AngularAnimatedChangePageConfigurator object.
     */
    public static void setEnabled(boolean mustEnable) {
        NgSelectPageConfigurator.enabled = mustEnable;
    }


    /**
     * The 3 meta tags *must* come first in the head; any other head content must come *after* these tags
     * <p>
     * HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries WARNING: Respond.js doesn't work if you view the page
     * via file://
     *
     * @return
     */
    @NotNull
    @Override
    public Page<?> configure(Page<?> page) {
        if (!page.isConfigured() && enabled()) {
       }
        return page;
    }

    @Override
    public boolean enabled() {
        return NgSelectPageConfigurator.enabled;
    }

}
