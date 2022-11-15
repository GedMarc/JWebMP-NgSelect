package com.jwebmp.plugins.ngselect;

import com.fasterxml.jackson.core.*;
import com.guicedee.guicedinjection.*;
import com.jwebmp.core.base.angular.client.services.interfaces.*;
import com.jwebmp.core.base.html.*;

import static com.guicedee.guicedinjection.interfaces.ObjectBinderKeys.*;


public class NgSelect extends DivSimple<NgSelect> implements INgComponent<NgSelect>
{
	
	private String addTagText;
	private String appearance;
	private String appendTo;
	private String bindValue;
	private String bindLabel;
	private Boolean closeOnSelect;
	private String clearAllText;
	private Boolean clearable;
	private Boolean clearOnBackspace;
	private NgSelectDropDownPosition dropDownPosition;
	private String groupBy;
	private String groupValue;
	private Boolean selectableGroup;
	private Boolean selectableGroupAsModel;
	private String items;
	private Boolean loading;
	private String loadingText;
	private String labelForId;
	private Boolean markFirst;
	private Boolean isOpen;
	private Number maxSelectedItems;
	private Boolean hideSelected;
	private Boolean multiple;
	private String notFoundText;
	private String placeHolder;
	private Boolean searchable;
	private Boolean readonly;
	private Boolean searchWhileComposing;
	private Boolean clearSearchOnAdd;
	private Boolean editableSearchTerm;
	private Boolean selectOnTab;
	private Boolean openOnEnter;
	private String typeAhead;
	private Number minTermLength;
	private String typeToSearchText;
	private Boolean virtualScroll;
	private Number tabIndex;
	
	public NgSelect()
	{
		setTag("ng-select");
	}
	
	
	@Override
	public void init()
	{
		if (addTagText != null)
		{
			addAttribute("addTagText", addTagText);
		}
		if (appearance != null)
		{
			addAttribute("appearance", appearance);
		}
		if (appendTo != null)
		{
			addAttribute("appendTo", appendTo);
		}
		if (bindValue != null)
		{
			addAttribute("bindValue", bindValue);
		}
		if (bindLabel != null)
		{
			addAttribute("bindLabel", bindLabel);
		}
		if (closeOnSelect != null)
		{
			addAttribute("[closeOnSelect]", closeOnSelect + "");
		}
		if (clearAllText != null)
		{
			addAttribute("clearAllText", clearAllText + "");
		}
		if (clearable != null)
		{
			addAttribute("[clearable]", clearable + "");
		}
		if (clearOnBackspace != null)
		{
			addAttribute("[clearOnBackspace]", clearOnBackspace + "");
		}
		if (dropDownPosition != null)
		{
			addAttribute("dropdownPosition", dropDownPosition + "");
		}
		
		if (groupBy != null)
		{
			addAttribute("[groupBy]", groupBy + "");
		}
		
		if (groupValue != null)
		{
			addAttribute("[groupValue]", groupValue + "");
		}
		if (selectableGroup != null)
		{
			addAttribute("[selectableGroup]", selectableGroup + "");
		}
		if (selectableGroupAsModel != null)
		{
			addAttribute("[selectableGroupAsModel]", selectableGroupAsModel + "");
		}
		if (items != null)
		{
			addAttribute("[items]", items + "");
		}
		if (loading != null)
		{
			addAttribute("[loading]", loading + "");
		}
		if (loadingText != null)
		{
			addAttribute("loadingText", loadingText + "");
		}
		if (labelForId != null)
		{
			addAttribute("labelForId", labelForId + "");
		}
		if (markFirst != null)
		{
			addAttribute("[markFirst]", markFirst + "");
		}
		if (isOpen != null)
		{
			addAttribute("[isOpen]", isOpen + "");
		}
		if (maxSelectedItems != null)
		{
			addAttribute("maxSelectedItems", maxSelectedItems + "");
		}
		if (hideSelected != null)
		{
			addAttribute("[hideSelected]", hideSelected + "");
		}
		
		if (multiple != null)
		{
			addAttribute("[multiple]", multiple + "");
		}
		if (notFoundText != null)
		{
			addAttribute("notFoundText", notFoundText + "");
		}
		if (placeHolder != null)
		{
			addAttribute("placeholder", placeHolder + "");
		}
		if (searchable != null)
		{
			addAttribute("[searchable]", searchable + "");
		}
		if (readonly != null)
		{
			addAttribute("[readonly]", readonly + "");
		}
		if (searchWhileComposing != null)
		{
			addAttribute("[searchWhileComposing]", searchWhileComposing + "");
		}
		if (clearSearchOnAdd != null)
		{
			addAttribute("[clearSearchOnAdd]", clearSearchOnAdd + "");
		}
		if (editableSearchTerm != null)
		{
			addAttribute("[editableSearchTerm]", editableSearchTerm + "");
		}
		if (selectOnTab != null)
		{
			addAttribute("[selectOnTab]", selectOnTab + "");
		}
		if (openOnEnter != null)
		{
			addAttribute("[openOnEnter]", openOnEnter + "");
		}
		if (typeAhead != null)
		{
			addAttribute("[typeahead]", typeAhead + "");
		}
		if (minTermLength != null)
		{
			addAttribute("[minTermLength]", minTermLength + "");
		}
		if (typeToSearchText != null)
		{
			addAttribute("typeToSearchText", typeToSearchText + "");
		}
		if (virtualScroll != null)
		{
			addAttribute("[virtualScroll]", virtualScroll + "");
		}
		super.init();
	}
	
	public String getAddTagText()
	{
		return addTagText;
	}
	
	public NgSelect setAddTagText(String addTagText)
	{
		this.addTagText = addTagText;
		return this;
	}
	
	public String getAppearance()
	{
		return appearance;
	}
	
	public NgSelect setAppearance(String appearance)
	{
		this.appearance = appearance;
		return this;
	}
	
	public String getAppendTo()
	{
		return appendTo;
	}
	
	public NgSelect setAppendTo(String appendTo)
	{
		this.appendTo = appendTo;
		return this;
	}
	
	public String getBindValue()
	{
		return bindValue;
	}
	
	public NgSelect setBindValue(String bindValue)
	{
		this.bindValue = bindValue;
		return this;
	}
	
	public String getBindLabel()
	{
		return bindLabel;
	}
	
	public NgSelect setBindLabel(String bindLabel)
	{
		this.bindLabel = bindLabel;
		return this;
	}
	
	public Boolean getCloseOnSelect()
	{
		return closeOnSelect;
	}
	
	public NgSelect setCloseOnSelect(Boolean closeOnSelect)
	{
		this.closeOnSelect = closeOnSelect;
		return this;
	}
	
	public String getClearAllText()
	{
		return clearAllText;
	}
	
	public NgSelect setClearAllText(String clearAllText)
	{
		this.clearAllText = clearAllText;
		return this;
	}
	
	public Boolean getClearable()
	{
		return clearable;
	}
	
	public NgSelect setClearable(Boolean clearable)
	{
		this.clearable = clearable;
		return this;
	}
	
	public Boolean getClearOnBackspace()
	{
		return clearOnBackspace;
	}
	
	public NgSelect setClearOnBackspace(Boolean clearOnBackspace)
	{
		this.clearOnBackspace = clearOnBackspace;
		return this;
	}
	
	public String getGroupBy()
	{
		return groupBy;
	}
	
	public NgSelect setGroupBy(String groupBy)
	{
		this.groupBy = groupBy;
		return this;
	}
	
	public String getGroupValue()
	{
		return groupValue;
	}
	
	public NgSelect setGroupValue(String groupValue)
	{
		this.groupValue = groupValue;
		return this;
	}
	
	public Boolean getSelectableGroup()
	{
		return selectableGroup;
	}
	
	public NgSelect setSelectableGroup(Boolean selectableGroup)
	{
		this.selectableGroup = selectableGroup;
		return this;
	}
	
	public Boolean getSelectableGroupAsModel()
	{
		return selectableGroupAsModel;
	}
	
	public NgSelect setSelectableGroupAsModel(Boolean selectableGroupAsModel)
	{
		this.selectableGroupAsModel = selectableGroupAsModel;
		return this;
	}
	
	public String getItems()
	{
		return items;
	}
	
	public NgSelect setItems(String items)
	{
		this.items = items;
		return this;
	}
	
	public Boolean getLoading()
	{
		return loading;
	}
	
	public NgSelect setLoading(Boolean loading)
	{
		this.loading = loading;
		return this;
	}
	
	public String getLoadingText()
	{
		return loadingText;
	}
	
	public NgSelect setLoadingText(String loadingText)
	{
		this.loadingText = loadingText;
		return this;
	}
	
	public String getLabelForId()
	{
		return labelForId;
	}
	
	public NgSelect setLabelForId(String labelForId)
	{
		this.labelForId = labelForId;
		return this;
	}
	
	public Boolean getMarkFirst()
	{
		return markFirst;
	}
	
	public NgSelect setMarkFirst(Boolean markFirst)
	{
		this.markFirst = markFirst;
		return this;
	}
	
	public Boolean getOpen()
	{
		return isOpen;
	}
	
	public NgSelect setOpen(Boolean open)
	{
		isOpen = open;
		return this;
	}
	
	public Number getMaxSelectedItems()
	{
		return maxSelectedItems;
	}
	
	public NgSelect setMaxSelectedItems(Number maxSelectedItems)
	{
		this.maxSelectedItems = maxSelectedItems;
		return this;
	}
	
	public Boolean getHideSelected()
	{
		return hideSelected;
	}
	
	public NgSelect setHideSelected(Boolean hideSelected)
	{
		this.hideSelected = hideSelected;
		return this;
	}
	
	public Boolean getMultiple()
	{
		return multiple;
	}
	
	public NgSelect setMultiple(Boolean multiple)
	{
		this.multiple = multiple;
		return this;
	}
	
	public String getNotFoundText()
	{
		return notFoundText;
	}
	
	public NgSelect setNotFoundText(String notFoundText)
	{
		this.notFoundText = notFoundText;
		return this;
	}
	
	public String getPlaceHolder()
	{
		return placeHolder;
	}
	
	public NgSelect setPlaceHolder(String placeHolder)
	{
		this.placeHolder = placeHolder;
		return this;
	}
	
	public Boolean getSearchable()
	{
		return searchable;
	}
	
	public NgSelect setSearchable(Boolean searchable)
	{
		this.searchable = searchable;
		return this;
	}
	
	public Boolean getReadonly()
	{
		return readonly;
	}
	
	public NgSelect setReadonly(Boolean readonly)
	{
		this.readonly = readonly;
		return this;
	}
	
	public Boolean getSearchWhileComposing()
	{
		return searchWhileComposing;
	}
	
	public NgSelect setSearchWhileComposing(Boolean searchWhileComposing)
	{
		this.searchWhileComposing = searchWhileComposing;
		return this;
	}
	
	public Boolean getClearSearchOnAdd()
	{
		return clearSearchOnAdd;
	}
	
	public NgSelect setClearSearchOnAdd(Boolean clearSearchOnAdd)
	{
		this.clearSearchOnAdd = clearSearchOnAdd;
		return this;
	}
	
	public Boolean getEditableSearchTerm()
	{
		return editableSearchTerm;
	}
	
	public NgSelect setEditableSearchTerm(Boolean editableSearchTerm)
	{
		this.editableSearchTerm = editableSearchTerm;
		return this;
	}
	
	public Boolean getSelectOnTab()
	{
		return selectOnTab;
	}
	
	public NgSelect setSelectOnTab(Boolean selectOnTab)
	{
		this.selectOnTab = selectOnTab;
		return this;
	}
	
	public Boolean getOpenOnEnter()
	{
		return openOnEnter;
	}
	
	public NgSelect setOpenOnEnter(Boolean openOnEnter)
	{
		this.openOnEnter = openOnEnter;
		return this;
	}
	
	public String getTypeAhead()
	{
		return typeAhead;
	}
	
	public NgSelect setTypeAhead(String typeAhead)
	{
		this.typeAhead = typeAhead;
		return this;
	}
	
	public Number getMinTermLength()
	{
		return minTermLength;
	}
	
	public NgSelect setMinTermLength(Number minTermLength)
	{
		this.minTermLength = minTermLength;
		return this;
	}
	
	public String getTypeToSearchText()
	{
		return typeToSearchText;
	}
	
	public NgSelect setTypeToSearchText(String typeToSearchText)
	{
		this.typeToSearchText = typeToSearchText;
		return this;
	}
	
	public Boolean getVirtualScroll()
	{
		return virtualScroll;
	}
	
	public NgSelect setVirtualScroll(Boolean virtualScroll)
	{
		this.virtualScroll = virtualScroll;
		return this;
	}
	
	public Number getTabIndex()
	{
		return tabIndex;
	}
	
	public NgSelect setTabIndex(Number tabIndex)
	{
		this.tabIndex = tabIndex;
		return this;
	}
	
	public NgSelectDropDownPosition getDropDownPosition()
	{
		return dropDownPosition;
	}
	
	public NgSelect setDropDownPosition(NgSelectDropDownPosition dropDownPosition)
	{
		this.dropDownPosition = dropDownPosition;
		return this;
	}
}
