package com.newer.exam.base;



import com.newer.exam.utility.ModelMapperSingle;
import org.modelmapper.ModelMapper;


/**
 * @author alvis
 */
public class BaseApiController {
    protected final static String DEFAULT_PAGE_SIZE = "10";
    protected final static ModelMapper modelMapper = ModelMapperSingle.Instance();
 
}
