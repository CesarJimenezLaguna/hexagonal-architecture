package com.breadhardit.logistics.item.facade.dto.mapper;

import com.breadhardit.logistics.item.business.model.Item;
import com.breadhardit.logistics.item.facade.dto.request.PostItemRequestDTO;
import com.breadhardit.logistics.item.facade.dto.response.GetItemResponseDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ItemFacadeMapper {
    GetItemResponseDTO fromDomain(Item in);
    Item fromPostItemRequestDTO(PostItemRequestDTO itemDto);
}
