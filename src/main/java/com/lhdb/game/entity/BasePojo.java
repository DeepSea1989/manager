package com.lhdb.game.entity;

import java.io.IOException;


import com.fasterxml.jackson.core.JsonParseException;

import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.lhdb.util.Page;
import com.lhdb.util.Sort;

public class BasePojo {
    private String sort;

    private Page pager;

    public Page getPager() {
        return pager;
    }

    public void setPager(Page pager) {
        this.pager = pager;
    }


}
