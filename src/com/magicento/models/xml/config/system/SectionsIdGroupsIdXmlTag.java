package com.magicento.models.xml.config.system;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Enrique Piatti
 */
public class SectionsIdGroupsIdXmlTag extends IdXmlTag {

    @Override
    public List<String> getPossibleNames() {
        names.add("your_custom_identifier_here");
        addAllNamesFrom("config/sections/"+getSectionsName()+"/groups/*");
        return new ArrayList<String>(names);
    }

}
