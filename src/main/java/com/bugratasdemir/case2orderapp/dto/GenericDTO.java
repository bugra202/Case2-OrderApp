package com.bugratasdemir.case2orderapp.dto;

import java.util.List;

public interface GenericDTO<T>{
     List<T> getByAllEntity();
     void saveEntity();
}
